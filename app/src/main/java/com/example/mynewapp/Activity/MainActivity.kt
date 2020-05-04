package com.example.mynewapp.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynewapp.R
class MainActivity : AppCompatActivity() {
    var a=1
    //check push
    //branch no 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
