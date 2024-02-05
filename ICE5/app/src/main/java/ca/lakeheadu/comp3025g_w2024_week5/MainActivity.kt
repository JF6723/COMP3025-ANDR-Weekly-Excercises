/*
 NAME: Tom Tsiliopoulos
 DATE: January 22, 2024
 ID  : 1234567
 */

package ca.lakeheadu.comp3025g_w2024_week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ca.lakeheadu.comp3025g_w2024_week5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    //private var resultString: String = ""
    private lateinit var calculator: Calculator

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculator = Calculator(binding)

    }
}