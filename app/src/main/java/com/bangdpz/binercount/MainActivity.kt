
package com.bangdpz.binercount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity : AppCompatActivity() {

    // private var _binding: ActivityMainBinding? = null
    
    // private val binding: ActivityMainBinding
    // get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        // _binding = ActivityMainBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(R.layout.activity_main)
    }
    /*
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }*/
}
