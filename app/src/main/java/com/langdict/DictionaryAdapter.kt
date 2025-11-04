package com.langdict

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DictionaryAdapter(
    private var entries: List<DictionaryEntry>
) : RecyclerView.Adapter<DictionaryAdapter.DictionaryViewHolder>() {

    class DictionaryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val wordTextView: TextView = view.findViewById(R.id.wordTextView)
        val languageTextView: TextView = view.findViewById(R.id.languageTextView)
        val translationsRecyclerView: RecyclerView = view.findViewById(R.id.translationsRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DictionaryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dictionary_entry, parent, false)
        return DictionaryViewHolder(view)
    }

    override fun onBindViewHolder(holder: DictionaryViewHolder, position: Int) {
        val entry = entries[position]
        holder.wordTextView.text = entry.word
        holder.languageTextView.text = when (entry.language) {
            Language.SPANISH -> "Spanish"
            Language.ENGLISH -> "English"
        }

        // Set up translations RecyclerView
        holder.translationsRecyclerView.layoutManager = LinearLayoutManager(holder.itemView.context)
        holder.translationsRecyclerView.adapter = TranslationAdapter(entry.translations)
    }

    override fun getItemCount() = entries.size

    fun updateEntries(newEntries: List<DictionaryEntry>) {
        entries = newEntries
        notifyDataSetChanged()
    }
}
