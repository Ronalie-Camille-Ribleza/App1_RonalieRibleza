package com.example.cake_ulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dryStuff = arrayOf("Flour", "Sugar", "Cocoa Powder")
    val wetStuff = arrayOf("Eggs", "Milk", "Oil")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dryStuff)
        val adapterB = ArrayAdapter(this, android.R.layout.simple_spinner_item, wetStuff)

        var button = findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapterB.setDropDownViewResource(android.R.layout.simple_spinner_item)

        dryIngredients.adapter = adapter
        dryIngredients.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?)
            {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(dryIngredients.selectedItemPosition==0)
                {

                }
                if(dryIngredients.selectedItemPosition==1)
                {

                }
                if(dryIngredients.selectedItemPosition==2)
                {

                }
            }
        }

        wetIngredients.adapter = adapterB
        wetIngredients.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?)
            {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(wetIngredients.selectedItemPosition==0)
                {

                }
                if(wetIngredients.selectedItemPosition==1)
                {

                }
                if(wetIngredients.selectedItemPosition==2)
                {

                }
            }
        }

        button.setOnClickListener{
            if(dryIngredients.selectedItemPosition==0 && wetIngredients.selectedItemPosition==0)
            {

            }
        }
    }

}