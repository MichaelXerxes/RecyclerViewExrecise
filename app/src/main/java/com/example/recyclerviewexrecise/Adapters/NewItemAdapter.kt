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

 class NewItemAdapter (private val context: Context, private val items: ArrayList<DataModel>):
    RecyclerView.Adapter<NewItemAdapter.NewViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewItemAdapter.NewViewHolder {
        return NewViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_new_custom_row,
                parent,
                false
            )
        )
    }
     override fun onBindViewHolder(holder: NewItemAdapter.NewViewHolder, position: Int) {
        val item=items.get(position)


        holder.tvItemNew.text=item.itemName

        if(position%2 == 0){//for even position
            holder.cardViewItemNew.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorLightGrey
                )
            )
        }else{
            holder.cardViewItemNew.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorWhite
                )
            )
        }
    }




    override fun getItemCount(): Int {
        return items.size
    }

    class NewViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvItemNew=view.findViewById<TextView>(R.id.tv_item_name_new)
        val cardViewItemNew=view.findViewById<CardView>(R.id.card_view_new_item)

    }

 }