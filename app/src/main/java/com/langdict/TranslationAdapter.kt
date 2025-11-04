package com.langdict

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TranslationAdapter(
    private val translations: List<Translation>
) : RecyclerView.Adapter<TranslationAdapter.TranslationViewHolder>() {

    class TranslationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val translationTextView: TextView = view.findViewById(R.id.translationTextView)
        val partOfSpeechTextView: TextView = view.findViewById(R.id.partOfSpeechTextView)
        val definitionTextView: TextView = view.findViewById(R.id.definitionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TranslationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_translation, parent, false)
        return TranslationViewHolder(view)
    }

    override fun onBindViewHolder(holder: TranslationViewHolder, position: Int) {
        val translation = translations[position]
        holder.translationTextView.text = translation.translation
        holder.partOfSpeechTextView.text = "(${translation.partOfSpeech.displayName})"
        holder.definitionTextView.text = translation.definition
    }

    override fun getItemCount() = translations.size
}
