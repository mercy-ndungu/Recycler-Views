package com.kirigo.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kirigo.mycontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayContacts() {
        var contact1 = Contact("Mercy", "0768277620")
        var contact2 = Contact("Mercy", "0768277620")
        var contact3 = Contact("Mercy", "0768277620")
        var contact=
            listOf(contact1,contact2,contact3)
        var contactAdapter = RecyclerAdapter(contact)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}