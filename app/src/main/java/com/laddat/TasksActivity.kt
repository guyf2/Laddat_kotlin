package com.laddat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TasksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks)

        // elements
        val task1Button = findViewById<Button>(R.id.tasksLinkToTask1)
        val task2Button = findViewById<Button>(R.id.tasksLinkToTask2)
        val task3Button = findViewById<Button>(R.id.tasksLinkToTask3)
        val linkToHome = findViewById<TextView>(R.id.tasksLinkToHomePage)


        // event listeners
        linkToHome.setOnClickListener{
            // setContent view to home
        }
        task1Button.setOnClickListener{
            // setContentView to Task 1 view
        }
        task2Button.setOnClickListener{
            // setContentView to Task 2 view
        }
        task3Button.setOnClickListener{
            // setContentView to Task 3 view
        }


    }
}