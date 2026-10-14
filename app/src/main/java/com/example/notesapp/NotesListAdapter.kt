package com.example.notesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.databinding.NoteItemBinding

class NotesListAdapter(var context: Context) : RecyclerView.Adapter<NotesListAdapter.ViewHolder>() {

    var noteList : ArrayList<NoteItem> = arrayListOf()

    inner class ViewHolder(var binding: NoteItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: NoteItem) {
            binding.txtNoteTitle.text = item.title
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesListAdapter.ViewHolder {
        val binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NotesListAdapter.ViewHolder, position: Int) {
        holder.bind(noteList[position])
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}