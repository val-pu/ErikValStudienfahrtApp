package valmx.nelly.studienfahrtapp.activities.fahrtenpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import valmx.nelly.studienfahrtapp.R

class FahrtenPicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrten_picker)
        var itemRecycler : RecyclerView = findViewById(R.id.items)
    }
}