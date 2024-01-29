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

        initializeOnClickListeners()
    }

    private fun initializeOnClickListeners() {
        // Listeners for Extras Buttons
        binding.clearButton.setOnClickListener { view -> processExtraButtons(view) }
        binding.percentButton.setOnClickListener { view -> processExtraButtons(view) }
        binding.backspaceButton.setOnClickListener { view -> processExtraButtons(view) }
        binding.plusminusButton.setOnClickListener { view -> processExtraButtons(view) }

        // Listeners for the Operator Buttons
        binding.divideButton.setOnClickListener { view -> processOperatorButtons(view) }
        binding.multiplyButton.setOnClickListener { view -> processOperatorButtons(view) }
        binding.addButton.setOnClickListener { view -> processOperatorButtons(view) }
        binding.subtractButton.setOnClickListener { view -> processOperatorButtons(view) }
        binding.equalsButton.setOnClickListener { view -> processOperatorButtons(view) }

        // Listeners for the Number Buttons (and decimal)
        binding.zeroButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.oneButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.twoButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.threeButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.fourButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.fiveButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.sixButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.sevenButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.eightButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.nineButton.setOnClickListener { view -> processNumberButtons(view) }
        binding.decimalButton.setOnClickListener { view -> processNumberButtons(view) }
    }

    /**
     * This method processes any operator button that is clicked
     * @param view [View]
     */
    private fun processOperatorButtons(view: View)
    {
        binding.resultTextView.text = view.tag.toString()
    }

    private fun processExtraButtons(view: View)
    {
        binding.resultTextView.text = view.tag.toString()
    }

    private fun processNumberButtons(view: View)
    {
        binding.resultTextView.text = view.tag.toString()
    }
}