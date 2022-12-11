package com.example.cake_ulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // creating arrays for every kind of ingredient
    val ingredientsA = arrayOf("Flour", "Sugar", "Cocoa Powder")
    val ingredientsB = arrayOf("Milk", "Egg", "Oil")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating adapter values for viewing
        val adapterD = ArrayAdapter(this, android.R.layout.simple_spinner_item, ingredientsA)
        val adapterW = ArrayAdapter(this, android.R.layout.simple_spinner_item, ingredientsB)

        // variable for the button
        var myButton = findViewById(R.id.button) as Button

        // setting the adapters
        adapterD.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapterW.setDropDownViewResource(android.R.layout.simple_spinner_item)

        // setting the dry ingredient spinner
        dryIngredients.adapter = adapterD
        dryIngredients.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(dryIngredients.selectedItemPosition==0)
                {
                    dryPreview.setText(" " + dryIngredients.selectedItem)
                }

                else if(dryIngredients.selectedItemPosition==1)
                {
                    dryPreview.setText(" " + dryIngredients.selectedItem)
                }

                else if(dryIngredients.selectedItemPosition==2)
                {
                    dryPreview.setText(" " + dryIngredients.selectedItem)
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?)
            {

            }

        }

        // setting the wet ingredient spinner
        wetIngredients.adapter = adapterW
        wetIngredients.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if(wetIngredients.selectedItemPosition==0)
                {
                    wetPreview.setText(" " + wetIngredients.selectedItem)
                }

                else if(wetIngredients.selectedItemPosition==1)
                {
                    wetPreview.setText(" " + wetIngredients.selectedItem)
                }

                else if(wetIngredients.selectedItemPosition==2)
                {
                    wetPreview.setText(" " + wetIngredients.selectedItem)
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?)
            {

            }

        }

        myButton.setOnClickListener {
            if(dryIngredients.selectedItemPosition == 0 && wetIngredients.selectedItemPosition==0)
            {
                defaultImage.setImageResource(R.drawable.pour_milk_into_flour)
            }

            else if(dryIngredients.selectedItemPosition == 0 && wetIngredients.selectedItemPosition==1)
            {
                defaultImage.setImageResource(R.drawable.img_6121)
            }

            else if(dryIngredients.selectedItemPosition == 0 && wetIngredients.selectedItemPosition==2)
            {
                defaultImage.setImageResource(R.drawable.focaccia_step_1h_06532ec9_840d_498a_98a4_6c88bc0f725c_0_472x310)
            }

            else if(dryIngredients.selectedItemPosition == 1 && wetIngredients.selectedItemPosition==0)
            {
                defaultImage.setImageResource(R.drawable.does_milk_have_sugar_in_it_naturally)
            }

            else if(dryIngredients.selectedItemPosition == 1 && wetIngredients.selectedItemPosition==1)
            {
                defaultImage.setImageResource(R.drawable.mix_sugar_eggs_prepare_baking_cake_40267318)
            }

            else if(dryIngredients.selectedItemPosition == 1 && wetIngredients.selectedItemPosition==2)
            {
                defaultImage.setImageResource(R.drawable.mix_sugar_and_olive_oil)
            }

            else if(dryIngredients.selectedItemPosition == 2 && wetIngredients.selectedItemPosition==0)
            {
                defaultImage.setImageResource(R.drawable.chocolate_milk_sedimentation_5_1)
            }

            else if(dryIngredients.selectedItemPosition == 2 && wetIngredients.selectedItemPosition==1)
            {
                defaultImage.setImageResource(R.drawable.ultimate_fudgy_brownies_without_eggs_19)
            }

            else if(dryIngredients.selectedItemPosition == 2 && wetIngredients.selectedItemPosition==2)
            {
                defaultImage.setImageResource(R.drawable.cocoa_powder)
            }
        }
    }

}