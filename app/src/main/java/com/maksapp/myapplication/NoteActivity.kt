package com.maksapp.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maksapp.myapplication.NotesFragment.Companion.newInstance

class NoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_activity)

//        if(savedInstanceState == null){
//
//            val intent: Intent = intent
//            var index: Int = intent.getIntExtra(NotesFragment.ARG_INDEX,0)
//           // val fragment = NotesFragment(index)
//
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.note_container, newInstance(index))
//                .commitNow()
//        }

//        val intent: Intent = intent
//        var index: Int = intent.getIntExtra(NotesFragment.newInstance().ARG_INDEX,0)
//        val fragment: NotesFragment = NotesFragment().newInstance(index)
    }
}