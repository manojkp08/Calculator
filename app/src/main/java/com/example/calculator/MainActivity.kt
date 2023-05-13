package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.allclear.setOnClickListener {
            binding.inputText.text = ""
            binding.outputText.text = ""
        }

        binding.zero.setOnClickListener {
            binding.inputText.append("0")
        }

        binding.one.setOnClickListener {
            binding.inputText.append("1")
        }

        binding.two.setOnClickListener {
            binding.inputText.append("2")
        }

        binding.three.setOnClickListener {
            binding.inputText.append("3")
        }

        binding.four.setOnClickListener {
            binding.inputText.append("4")
        }

        binding.five.setOnClickListener {
            binding.inputText.append("5")
        }

        binding.six.setOnClickListener {
            binding.inputText.append("6")
        }

        binding.seven.setOnClickListener {
            binding.inputText.append("7")
        }

        binding.eight.setOnClickListener {
            binding.inputText.append("8")
        }

        binding.nine.setOnClickListener {
            binding.inputText.append("9")
        }

        binding.decimal.setOnClickListener {
            binding.inputText.append(".")
        }

        binding.plus.setOnClickListener {
            binding.inputText.append("+")
        }

        binding.divide.setOnClickListener {
            binding.inputText.append("/")
        }

        binding.minus.setOnClickListener {
            binding.inputText.append("-")
        }

        binding.multiply.setOnClickListener {
            binding.inputText.append("*")
        }

        binding.startBracket.setOnClickListener {
            binding.inputText.append("(")
        }

        binding.endBracket.setOnClickListener {
            binding.inputText.append(")")
        }

        binding.equal.setOnClickListener {
            val expression = ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if(result == longresult.toDouble()){
                binding.outputText.text = longresult.toString()
            } else {
                binding.outputText.text = result.toString()
            }
        }
    }
}