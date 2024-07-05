package com.example.anabeatrizfrana

import android.os.Bundle
import android.widget.SearchView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class home_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val searchView = findViewById<SearchView>(R.id.searchBar)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {

                }
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {

                }
                return false
            }

        })

    }
}