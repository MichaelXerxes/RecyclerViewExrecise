package com.example.recyclerviewexrecise.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexrecise.DataModel
import com.example.recyclerviewexrecise.R

class ItemAdapter (val context: Context, val items: ArrayList<DataModel>):
      RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    companion object{
        const val VIEW_TYPE_ONE=1
        const val VIEW_TYPE_TWO=2

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType== VIEW_TYPE_ONE){
            return ViewHolder1(
                LayoutInflater.from(context).inflate(
                    R.layout.tem_custom_row,
                    parent,
                    false
                )
            )
        }else {
            return AnotherViewHolder(
                LayoutInflater.from(context).inflate(
                    R.layout.item_new_custom_row,
                    parent,
                    false
                )
            )
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item=items.get(position)
        if(holder is ViewHolder1){
            holder.tvItem.text=item.itemName

            if(position%2 == 0){//for even position
                holder.cardViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorLightGrey
                    )
                )
            }else{
                holder.cardViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorWhite
                    )
                )
            }
        }else if(holder is AnotherViewHolder){
            holder.tvAnotherItem.text=item.itemName

            if(position%2 == 0){//for even position
                holder.cardAnotherViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorLightGrey
                    )
                )
            }else{
                holder.cardAnotherViewItem.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.colorWhite
                    )
                )
            }
        }


    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder1(view: View):RecyclerView.ViewHolder(view){
        val tvItem=view.findViewById<TextView>(R.id.tv_item_name)
        val cardViewItem=view.findViewById<CardView>(R.id.card_view_item)

    }
    class AnotherViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvAnotherItem=view.findViewById<TextView>(R.id.tv_item_name_new)
        val cardAnotherViewItem=view.findViewById<CardView>(R.id.card_view_new_item)

    }

}