package valmx.nelly.studienfahrtapp.activities.fahrtenpicker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import valmx.nelly.studienfahrtapp.R
import java.util.*

class FahrtenItemRecycler(var inflater: LayoutInflater, val data : LinkedList<R>) : RecyclerView.Adapter<FahrtenItemRecycler.Holder>() {



    class Holder(v: View) : RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }
}