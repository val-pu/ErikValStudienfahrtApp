package valmx.nelly.studienfahrtapp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.card_item.view.*
import valmx.nelly.studienfahrtapp.R
import valmx.nelly.studienfahrtapp.containers.Card

class HomeItemAdapter(private val data: List<Card>, val inflater: LayoutInflater) : RecyclerView.Adapter<ViewHolder>() {

    // View von card_item.xml wird erstellt

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return CardViewHolder(inflater.inflate(R.layout.card_item, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    // Setzen der Werte

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val c: CardViewHolder = holder as CardViewHolder
        val data: Card = data[position]

        c.url.text = data.url
        c.ort.text = data.ort
        c.time.text = data.time
        c.title.text = data.title
        // TODO: 18.09.2020 RESTLICHE TEXTTYPEN IMPLEMENTIEREN
    }

    private class CardViewHolder(itemView: View) : ViewHolder(itemView) {

        // TextViews werden abgerufen

        internal var url: TextView = itemView.findViewById(R.id.url)
        internal var ort: TextView = itemView.findViewById(R.id.ort)
        internal var time: TextView = itemView.findViewById(R.id.time)
        internal lateinit var desc: TextView
        internal var title: TextView = itemView.findViewById(R.id.title)
    }

}