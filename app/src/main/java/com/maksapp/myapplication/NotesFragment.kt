package com.maksapp.myapplication

import android.os.Bundle
import android.view.*
import android.widget.TextView
import android.widget.Toolbar
import androidx.fragment.app.Fragment

class NotesFragment(index: Int) : Fragment() {



   // val ARG_INDEX = "note_index"
   companion object {
       val ARG_INDEX = "note_index"
       //fun newInstance() = NotesFragment()

       fun newInstance(index: Int): NotesFragment =
           NotesFragment(index).apply {
               arguments = Bundle().apply {
                   putInt(ARG_INDEX, index)

               }
           }


        }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.notes_fragment, container,false)

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val (textTitle: TextView, textDesc: TextView, textData: TextView) = init(view)
        //  var index: Int = (arguments?.getInt(KEY_INDEX) ?:"") as Int
        if (arguments != null){
            val index: Int = requireArguments().getInt(ARG_INDEX)

            val noteArr = getNote()[index]
                textTitle.text = noteArr.title
                textDesc.text = noteArr.desc
                textData.text = noteArr.date

//            val noteArray: Array<String> = resources.getStringArray(R.array.notes)
//            val note: String = noteArray[index]
//            textNote.text = note
        }
    }

    private fun init(view: View): Triple<TextView, TextView, TextView> {
        val textTitle: TextView = view.findViewById(R.id.textTitle)
        val textDesc: TextView = view.findViewById(R.id.textDesc)
        val textData: TextView = view.findViewById(R.id.textData)
        return Triple(textTitle, textDesc, textData)
    }


}
   //}
//        val ARG_INDEX = "note_index"
//        fun newInstance(index: Int): NotesFragment {
//            val fragment = NotesFragment()
//            val bundle = Bundle()
//            bundle.putInt(ARG_INDEX, index)
//            //fragment.arguments
//            fragment.arguments?.getBundle(bundle.toString())
//            return fragment
//
//    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.notes_fragment, container,false)
//
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val textNote: TextView = view.findViewById(R.id.textNote)
//      //  var index: Int = (arguments?.getInt(KEY_INDEX) ?:"") as Int
//        if (arguments != null){
//            val index: Int = requireArguments().getInt(ARG_INDEX)
//            val noteArray: Array<String> = resources.getStringArray(R.array.notes)
//            val note: String = noteArray[index]
//            textNote.text = note
//        }
//    }
//
//
//}