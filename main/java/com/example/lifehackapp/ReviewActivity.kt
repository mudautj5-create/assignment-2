package com.example.lifehackapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewContent = findViewById<TextView>(R.id.reviewContent)
        val backButton = findViewById<Button>(R.id.backButton)

        val explanations = arrayOf(
            "1. Putting your phone in rice fixes water damage\nMyth: Rice does not fix water damage. It can actually introduce dust and starch into the device.\n",
            "2. Using keyboard shortcuts improves productivity\nHack: Saves time and improves productivity by reducing reliance on the mouse.\n",
            "3. Drinking coffee completely dehydrates you\nMyth: Coffee has a mild diuretic effect but still contributes to your daily fluid intake.\n",
            "4. Writing tasks down improves memory\nHack: The act of writing helps encode information in your brain better than typing.\n",
            "5. Charging phone overnight destroys battery\nMyth: Modern smartphones are designed to prevent overcharging once they reach 100%."
        )

        reviewContent.text = explanations.joinToString("\n")

        backButton.setOnClickListener {
            finish()
        }
    }
}
