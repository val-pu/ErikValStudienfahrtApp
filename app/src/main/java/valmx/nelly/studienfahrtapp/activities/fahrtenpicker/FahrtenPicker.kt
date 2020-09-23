package valmx.nelly.studienfahrtapp.activities.fahrtenpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import valmx.nelly.studienfahrtapp.R
import java.util.*

class FahrtenPicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrten_picker)
        val itemRecycler : RecyclerView = findViewById(R.id.items)

        val data = LinkedList<Int>()
        data.add(1)
        val a = FahrtenItemRecycler(LayoutInflater.from(this),data,this)
        itemRecycler.layoutManager = LinearLayoutManager(this)

        itemRecycler.adapter = a

    }
}