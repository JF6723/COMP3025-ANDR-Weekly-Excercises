package ca.lakeheadu.comp3025g_w2024_week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeTextView = findViewById<TextView>(R.id.clickMeTextView)
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
    }
}