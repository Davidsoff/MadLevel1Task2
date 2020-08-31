package nl.soffware.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import nl.soffware.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        binding.button.setOnClickListener() { handleSubmit()  }
    }

    private fun handleSubmit() {
        val correct = checkAnswers()
        Toast.makeText(this, getString(R.string.results, correct), Toast.LENGTH_LONG).show()
    }
    private fun checkAnswers(): Int {
        var correct = 0
        val t = getString(R.string.truth)
        val f = getString(R.string.untrue)
        if(binding.case1.selectedItem.toString() == t) correct += 1
        if(binding.case2.selectedItem.toString() == f) correct += 1
        if(binding.case3.selectedItem.toString() == f) correct += 1
        if(binding.case4.selectedItem.toString() == f) correct += 1
        return correct
    }


}