package com.kirigo.mycontact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (var contact: List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int){
        var currentcontact = contact.get(position)
        holder.tvName.text = currentcontact.name
        holder.tvDetails.text = currentcontact.PhoneNumber

    }

    override fun getItemCount(): Int {
        return contact.size
    }

}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvDetails = itemView.findViewById<TextView>(R.id.tvName)
}