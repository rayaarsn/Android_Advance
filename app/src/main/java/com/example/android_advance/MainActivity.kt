package com.example.android_advance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_advance.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.image1,"image1"))
        list.add(Info(R.drawable.image2,"image2"))
        list.add(Info(R.drawable.image3,"image3"))
        list.add(Info(R.drawable.image4,"image4"))
        list.add(Info(R.drawable.image5,"image5"))
        list.add(Info(R.drawable.image6,"image6"))
        list.add(Info(R.drawable.image1,"image1"))
        list.add(Info(R.drawable.image2,"image2"))
        list.add(Info(R.drawable.image3,"image3"))
        list.add(Info(R.drawable.image4,"image4"))
        list.add(Info(R.drawable.image5,"image5"))
        list.add(Info(R.drawable.image6,"image6"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)




    }
}