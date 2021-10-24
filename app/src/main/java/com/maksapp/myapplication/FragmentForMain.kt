package com.maksapp.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FragmentForMain: Fragment() {



    companion object {
        fun newInstance() = FragmentForMain()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_for_main, container, false)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_toolbar,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
     if (item.itemId == R.id.add_note){
         startFragmentAddNote()
        }
        return super.onOptionsItemSelected(item)

    }

    private fun startFragmentAddNote() {
        val fragmentAddNote: FragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentAddNote.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, FragmentAddNote())
        fragmentAddNote.popBackStack()
        fragmentTransaction.commitNow()
    }
    fun startNotesFragment(index: Int) {
//          val intent = Intent(activity,NoteActivity::class.java)
//           intent.putExtra(NotesFragment.ARG_INDEX,index)
//           startActivity(intent)
            val fragmentNote: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentNote.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, NotesFragment.newInstance(index))
            //fragmentNote.popBackStack()
            //fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitNow()
      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        setHasOptionsMenu(true)

    }

    private fun initViews(view: View) {
        val layout: LinearLayout = view as LinearLayout
        val cities: Array<String> = resources.getStringArray(R.array.cities)


//        fun startNotesFragment(index: Int) {
////           val intent = Intent(activity,NoteActivity::class.java)
////            intent.putExtra(NotesFragment.ARG_INDEX,index)
////            startActivity(intent)
//            val fragmentNote: FragmentManager = requireActivity().supportFragmentManager
//            val fragmentTransaction: FragmentTransaction = fragmentNote.beginTransaction()
//            fragmentTransaction.replace(R.id.fragment_container, NotesFragment.newInstance(index))
//            //fragmentNote.popBackStack()
//            //fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.commitNow()
//        }


        for (i in cities){
            val textView = TextView(context)
            textView.text = i //city
            textView.textSize = 30f
            val index: Int = cities.indexOf(i)
            textView.setOnClickListener { startNotesFragment(index) }
            layout.addView(textView)

        }
    }


}