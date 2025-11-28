package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentView: Unit = setContentView(R.layout.activity_main)

        contentView
        val flashcard_question = findViewById<TextView>(R.id.flashcard_question)
        val flashcard_answer = findViewById<TextView>(R.id.flashcard_answer)

        flashcard_question.setOnClickListener {
            flashcard_question.visibility = View.INVISIBLE
            flashcard_answer.visibility = View.INVISIBLE
        }


    val buttonadd = findViewById<Button>(R.id.button_add)
    buttonadd.setOnClickListener {


        val intent = Intent(this, AddCard::class.java)
        startActivity(intent)
    }
}
}