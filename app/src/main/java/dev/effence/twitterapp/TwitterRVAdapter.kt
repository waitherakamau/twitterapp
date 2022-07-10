package dev.effence.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class TwitterRVAdapter(var twitterList: List<Tweet>): RecyclerView.Adapter<twitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return twitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text=currentTwitter.name
        holder.tvHandle.text=currentTwitter.handle
        holder.tvTweet.text=currentTwitter.tweet
        holder.tvNumber1.text=currentTwitter.number1
        holder.tvNumber2.text=currentTwitter.number2
        holder.tvNumber3.text=currentTwitter.number3


    }

    override fun getItemCount(): Int {
        return twitterList.size
    }

}
class twitterViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView){
            var tvName=itemView.findViewById<TextView>(R.id.tvName)
            var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
           var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
           var tvNumber1=itemView.findViewById<TextView>(R.id.tvNumber1)
           var tvNumber2=itemView.findViewById<TextView>(R.id.tvNumber2)
          var tvNumber3=itemView.findViewById<TextView>(R.id.tvNumber3)




}