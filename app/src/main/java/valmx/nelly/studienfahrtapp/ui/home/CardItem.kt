package valmx.nelly.studienfahrtapp.ui.home

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import valmx.nelly.studienfahrtapp.R
import valmx.nelly.studienfahrtapp.containers.Card

class CardItem() : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_item)
    }

    fun setData(card: Card) {
        findViewById<TextView>(R.id.title).text = card.title
        findViewById<TextView>(R.id.ort).text = card.ort
        findViewById<TextView>(R.id.url).text = card.url

        findViewById<TextView>(R.id.title).text = card.time
    }

}