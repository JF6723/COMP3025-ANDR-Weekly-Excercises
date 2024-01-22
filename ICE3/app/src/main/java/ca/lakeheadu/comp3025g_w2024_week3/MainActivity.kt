/*
 NAME: Tom Tsiliopoulos
 DATE: January 22, 2024
 ID  : 1234567
 */

package ca.lakeheadu.comp3025g_w2024_week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create references to button Views
        val clearButton = findViewById<Button>(R.id.clearButton)
        val percentButton = findViewById<Button>(R.id.percentButton)

        clearButton.setOnClickListener { view -> processOperatorButtons(view)}
        percentButton.setOnClickListener { view ->processOperatorButtons(view)}
    }

    /**
     * This method processes any operator button that is clicked
     * @param view [View]
     */
    private fun processOperatorButtons(view: View)
    {
        Log.i("operator", view.tag.toString())
    }
}