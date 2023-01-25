package com.example.youtube

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val contentList: List<ExploreList>,private val context: Context) :RecyclerView.Adapter<Adapter.ContentHolder>(){

    class ContentHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val textView: TextView = itemView.findViewById(R.id.text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentHolder {
        val youTubeContent = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return ContentHolder(youTubeContent)
    }

    override fun onBindViewHolder(holder: ContentHolder, position: Int) {
        val positionContent = contentList[position]
        holder.imageView.setImageResource(positionContent.img)
        holder.textView.text=(positionContent.txt)
        holder.itemView.setOnClickListener{
            Toast.makeText(context,"You click on this VECTOR ${positionContent.txt}",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return contentList.size
    }
}