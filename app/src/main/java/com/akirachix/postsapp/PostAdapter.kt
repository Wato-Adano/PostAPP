package com.akirachix.postsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.postsapp.databinding.ListItemsInterfaceBinding

class PostAdapter ( var post:List<Post>):
        RecyclerView.Adapter<PostViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_items_interface,parent,false)
        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = post[position]
        holder.Userid.text = "Userid: $ {post.userId}"
        holder.tvId.text = "id: ${post.id}"
        holder.body.text = post.body
        holder.title.text = post.title
    }

    override fun getItemCount(): Int {
        return post.size
    }
}


class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var body = itemView.findViewById<TextView>(R.id.tvBody)
    var title = itemView.findViewById<TextView>(R.id.tvTitle)
    var Userid= itemView.findViewById<TextView>(R.id.tvUserId)
    var tvId= itemView.findViewById<TextView>(R.id.tvId)
}

