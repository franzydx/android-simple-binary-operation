package com.bangdpz.binercount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

public class MainActivity : AppCompatActivity() {
    
    private lateinit var binaryInput1: EditText
    private lateinit var binaryInput2: EditText
    private lateinit var xaddButton: Button
    private lateinit var xsubButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        
        binaryInput1 = findViewById(R.id.binInput1)
        binaryInput2 = findViewById(R.id.binInput2)
        xaddButton = findViewById(R.id.addButton)
        xsubButton = findViewById(R.id.subButton)
        resultTextView = findViewById(R.id.resultView)
      
      xaddButton.setOnClickListener() {
        val binary_1 = binaryInput1.text.toString()
        val binary_2 = binaryInput2.text.toString()
        if (checkBinary(binary_1) && checkBinary(binary_2)) {
            val sum = doPenambahan(binary_1, binary_2)
            resultTextView.text = "Hasil akhirnya adalah $sum"
        } else {
            Toast.makeText(this, "Input tidak valid!", Toast.LENGTH_SHORT).show()
        } 
      }
      
     xsubButton.setOnClickListener() {
        val binary_1 = binaryInput1.text.toString()
        val binary_2 = binaryInput2.text.toString()
        if (checkBinary(binary_1) && checkBinary(binary_2)) {
            val sum = doPengurangan(binary_1, binary_2)
            resultTextView.text = "Hasil akhirnya adalah $sum"
        } else {
            Toast.makeText(this, "Input tidak valid!", Toast.LENGTH_SHORT).show()
        }
      }
    }
   
    private fun checkBinary(bin: String): Boolean {
        return bin.all { it == '0' || it == '1'}
    }
    
    private fun doPenambahan(bin1: String, bin2: String): String {
        val hasil = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)
        return Integer.toBinaryString(hasil) 
    }
    
    private fun doPengurangan(bin1: String, bin2: String): String {
        val bit1 = Integer.parseInt(bin1, 2)
        val bit2 = Integer.parseInt(bin2, 2)
        val hasil = bit1 - bit2
        return Integer.toBinaryString(hasil)
    }
}
