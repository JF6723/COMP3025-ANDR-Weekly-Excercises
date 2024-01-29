/*
 NAME: Tom Tsiliopoulos
 DATE: January 22, 2024
 ID  : 1234567
 */

package ca.lakeheadu.comp3025g_w2024_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ca.lakeheadu.comp3025g_w2024_week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clearButton.setOnClickListener { view -> processOperatorButtons(view)}
        binding.percentButton.setOnClickListener { view ->processOperatorButtons(view)}

        binding.sevenButton.setOnClickListener { view ->processNumberButtons(view)}
        binding.eightButton.setOnClickListener { view ->processNumberButtons(view)}
        binding.nineButton.setOnClickListener { view ->processNumberButtons(view)}
    }

    /**
     * This method processes any operator button that is clicked
     * @param view [View]
     */
    private fun processOperatorButtons(view: View)
    {
        binding.resultTextView.text = view.tag.toString()
    }

    private fun processNumberButtons(view: View)
    {
        binding.resultTextView.text = view.tag.toString()
    }
}