package tech.henriquedev.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list_view)

        var countryList = resources.getStringArray(R.array.countries)

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val countryName: String = parent.getItemAtPosition(position).toString()

            showToast(countryName)
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, "Testando toast message $message", Toast.LENGTH_SHORT).show()
    }
}