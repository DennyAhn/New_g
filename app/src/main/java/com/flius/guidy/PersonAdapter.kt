package com.flius.guidy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Person(val name: String, val details: String)
class PersonAdapter(private val personList: List<Person>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val currentPerson = personList[position]
        holder.personName.text = currentPerson.name
        holder.personDetails.text = currentPerson.details
    }

    override fun getItemCount() = personList.size

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personName: TextView = itemView.findViewById(R.id.person_name)
        val personDetails: TextView = itemView.findViewById(R.id.person_details)
    }
}