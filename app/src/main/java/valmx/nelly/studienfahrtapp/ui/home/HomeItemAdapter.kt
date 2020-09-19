package valmx.nelly.studienfahrtapp.ui.home

import android.opengl.Visibility
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.card_item.view.*
import valmx.nelly.studienfahrtapp.R
import valmx.nelly.studienfahrtapp.R.*
import valmx.nelly.studienfahrtapp.containers.Card

class HomeItemAdapter(private val data: List<Card>, val inflater: LayoutInflater) : RecyclerView.Adapter<ViewHolder>() {

    // View von card_item.xml wird erstellt

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return CardViewHolder(inflater.inflate(layout.card_item, parent, false))
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
        c.timeExtra.text = data.time
        c.title.text = data.title
        c.desc.text = data.desc

        // TODO: 9/19/20 add image support

        if(data.useImage) {
            c.image.visibility = VISIBLE
        }

        c.textBar.setOnClickListener {

            TransitionManager.beginDelayedTransition(c.popUp,AutoTransition())
            TransitionManager.beginDelayedTransition(c.textBar,AutoTransition())

            // oeffnung / schliessung des Popups

            if(c.popUp.visibility == GONE) {
                c.popUp.visibility = VISIBLE
                c.timeExtra.visibility = INVISIBLE
                c.seeMoreIcon.setImageResource(drawable.ic_baseline_keyboard_arrow_up_24)
            } else {
                c.popUp.visibility = GONE
                c.timeExtra.visibility = VISIBLE
                c.seeMoreIcon.setImageResource(drawable.ic_baseline_keyboard_arrow_down_24)
            }
        }
    }

    private class CardViewHolder(itemView: View) : ViewHolder(itemView) {

        // Views werden abgerufen

        internal var textBar: ConstraintLayout = itemView.findViewById(id.constraintLayout)
        internal var popUp: ConstraintLayout = itemView.findViewById(id.card_more_info)
        internal var image: ImageView = itemView.findViewById(id.image)
        internal var seeMoreIcon: ImageView = itemView.findViewById(id.seeMoreIcon)
        internal var url: TextView = itemView.findViewById(id.url)
        internal var ort: TextView = itemView.findViewById(id.ort)
        internal var time: TextView = itemView.findViewById(id.time)
        internal var timeExtra: TextView = itemView.findViewById(id.timeExtra)
        internal var desc: TextView = itemView.findViewById(id.desc)
        internal var title: TextView = itemView.findViewById(id.title)
    }

}