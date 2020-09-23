package valmx.nelly.studienfahrtapp.activities.fahrtenpicker

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import valmx.nelly.studienfahrtapp.MainActivity
import valmx.nelly.studienfahrtapp.R
import java.util.*
import valmx.nelly.studienfahrtapp.MainActivity.dataManager as dataManager1

class FahrtenItemRecycler(var inflater: LayoutInflater, val data : LinkedList<Int>, val context: Context) : RecyclerView.Adapter<FahrtenItemRecycler.Holder>() {



    class Holder(v: View) : RecyclerView.ViewHolder(v) {
        val layout: ConstraintLayout = v.findViewById(R.id.layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(inflater.inflate(R.layout.fahrtenpicker_item,parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.layout.setOnClickListener {
            // TODO: 23.09.2020 IMPLEMENT
            dataManager1.isTripLoaded = true
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }

    }
}