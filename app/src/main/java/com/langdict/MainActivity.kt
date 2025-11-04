package com.langdict

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: TextInputEditText
    private lateinit var resultsRecyclerView: RecyclerView
    private lateinit var emptyStateLayout: View
    private lateinit var emptyStateText: TextView
    private lateinit var dictionaryAdapter: DictionaryAdapter
    private lateinit var repository: DictionaryRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize repository
        repository = DictionaryRepository()

        // Initialize views
        searchEditText = findViewById(R.id.searchEditText)
        resultsRecyclerView = findViewById(R.id.resultsRecyclerView)
        emptyStateLayout = findViewById(R.id.emptyStateLayout)
        emptyStateText = findViewById(R.id.emptyStateText)

        // Set up RecyclerView
        resultsRecyclerView.layoutManager = LinearLayoutManager(this)
        dictionaryAdapter = DictionaryAdapter(emptyList())
        resultsRecyclerView.adapter = dictionaryAdapter

        // Set up search functionality
        setupSearch()
    }

    private fun setupSearch() {
        // Text change listener for real-time search
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                performSearch(s?.toString() ?: "")
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // Handle keyboard search action
        searchEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                performSearch(searchEditText.text?.toString() ?: "")
                true
            } else {
                false
            }
        }
    }

    private fun performSearch(query: String) {
        if (query.isBlank()) {
            // Show initial empty state
            showEmptyState(getString(R.string.search_prompt))
            return
        }

        val results = repository.search(query)

        if (results.isEmpty()) {
            // Show no results state
            showEmptyState(getString(R.string.no_results))
        } else {
            // Show results
            showResults(results)
        }
    }

    private fun showEmptyState(message: String) {
        resultsRecyclerView.visibility = View.GONE
        emptyStateLayout.visibility = View.VISIBLE
        emptyStateText.text = message
    }

    private fun showResults(results: List<DictionaryEntry>) {
        emptyStateLayout.visibility = View.GONE
        resultsRecyclerView.visibility = View.VISIBLE
        dictionaryAdapter.updateEntries(results)
    }
}
