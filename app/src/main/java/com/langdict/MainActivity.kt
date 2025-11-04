package com.langdict

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: TextInputEditText
    private lateinit var resultsRecyclerView: RecyclerView
    private lateinit var emptyStateLayout: View
    private lateinit var emptyStateText: TextView
    private lateinit var loadingProgressBar: ProgressBar
    private lateinit var dictionaryAdapter: DictionaryAdapter
    private lateinit var repository: DictionaryRepositoryNew

    private var searchJob: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize repository
        repository = DictionaryRepositoryNew()

        // Initialize views
        searchEditText = findViewById(R.id.searchEditText)
        resultsRecyclerView = findViewById(R.id.resultsRecyclerView)
        emptyStateLayout = findViewById(R.id.emptyStateLayout)
        emptyStateText = findViewById(R.id.emptyStateText)
        loadingProgressBar = findViewById(R.id.loadingProgressBar)

        // Set up RecyclerView
        resultsRecyclerView.layoutManager = LinearLayoutManager(this)
        dictionaryAdapter = DictionaryAdapter(emptyList())
        resultsRecyclerView.adapter = dictionaryAdapter

        // Set up search functionality
        setupSearch()
    }

    private fun setupSearch() {
        // Text change listener for real-time search with debouncing
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Cancel previous search job
                searchJob?.cancel()

                // Start new search with delay (debouncing)
                searchJob = lifecycleScope.launch {
                    delay(500) // Wait 500ms after user stops typing
                    performSearch(s?.toString() ?: "")
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // Handle keyboard search action (immediate search, no debouncing)
        searchEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                searchJob?.cancel()
                lifecycleScope.launch {
                    performSearch(searchEditText.text?.toString() ?: "")
                }
                true
            } else {
                false
            }
        }
    }

    private suspend fun performSearch(query: String) {
        if (query.isBlank()) {
            // Show initial empty state
            showEmptyState(getString(R.string.search_prompt))
            return
        }

        // Show loading
        showLoading()

        try {
            val results = repository.search(query)

            if (results.isEmpty()) {
                // Show no results state
                showEmptyState(getString(R.string.no_results))
            } else {
                // Show results
                showResults(results)
            }
        } catch (e: Exception) {
            // Show error state
            showEmptyState("Error: ${e.message ?: "Unable to fetch results"}")
        }
    }

    private fun showLoading() {
        resultsRecyclerView.visibility = View.GONE
        emptyStateLayout.visibility = View.GONE
        loadingProgressBar.visibility = View.VISIBLE
    }

    private fun showEmptyState(message: String) {
        resultsRecyclerView.visibility = View.GONE
        loadingProgressBar.visibility = View.GONE
        emptyStateLayout.visibility = View.VISIBLE
        emptyStateText.text = message
    }

    private fun showResults(results: List<DictionaryEntry>) {
        emptyStateLayout.visibility = View.GONE
        loadingProgressBar.visibility = View.GONE
        resultsRecyclerView.visibility = View.VISIBLE
        dictionaryAdapter.updateEntries(results)
    }

    override fun onDestroy() {
        super.onDestroy()
        searchJob?.cancel()
    }
}
