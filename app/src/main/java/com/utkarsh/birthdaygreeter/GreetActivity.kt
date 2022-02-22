package com.utkarsh.birthdaygreeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
        
        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.text = "Happy Birthday🎂 Dear\n$name!✨"
    }
}