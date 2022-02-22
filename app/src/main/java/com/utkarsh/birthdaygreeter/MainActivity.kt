package com.utkarsh.birthdaygreeter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBdayCard(view: View) {
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.text.toString()
        if(name.isEmpty()){
            AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("Please Enter Name")
                .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
                .setCancelable(false)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
        Toast.makeText(this,"Happy Birthday",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, GreetActivity::class.java)
        intent.putExtra(GreetActivity.NAME_EXTRA,name)
        startActivity(intent)

    }
}