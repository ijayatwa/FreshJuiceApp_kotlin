package com.example.assignment2_20170599

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button) // to variable button to btResult
        button.setOnClickListener { view ->
            var dialog = dialogfrag()
            dialog.show(supportFragmentManager, "customDialog")


        }
        var flag: String = "Apple"
        //here .. create a spinner items (options)
        val spinnerVal: Spinner = findViewById(R.id.spinner)
        var options = arrayOf("Apple","Orange","Lemonada","Lemon & Mint","Mango")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(
                this,
                "Online store that provide all types of healthy and fresh juice",
                Toast.LENGTH_SHORT
            ).show()
            R.id.item2 -> Toast.makeText(
                this,
                "email : FRESHJUICE@gmail.com      PhoneNumber : 0699443535",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true;
    }



}

