package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.toHtml
import androidx.recyclerview.widget.RecyclerView
import com.example.wishlist5.R
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var item: EditText
    lateinit var price: EditText
    lateinit var link: EditText
    lateinit var button: Button
    lateinit var wishes: MutableList<Wish>
    lateinit var wishRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        item = findViewById(R.id.Item)
        price = findViewById(R.id.Price)
        link = findViewById(R.id.Link)
        button = findViewById(R.id.button)

        wishes = ArrayList()


        button.setOnClickListener {
            val wish = Wish(item.text.toString(),price.text.toString(),link.text.toString())
            wishes.add(wish)
            wishadapter.notifyDataSetChanged()

            item.text.clear()
            price.text.clear()
            link.text.clear()

            wishRV.smoothScrollToPosition(wishes.lastIndex)

        }



    }



}