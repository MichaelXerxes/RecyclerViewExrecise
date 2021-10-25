package com.example.recyclerviewexrecise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexrecise.Adapters.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler_view_items=findViewById(R.id.recycler_View_Items) as RecyclerView
        val itemAdapter=ItemAdapter(this,getAnotherItemList())

        recycler_view_items.layoutManager= LinearLayoutManager(this)
        // recycler_view_items.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        //recycler_view_items.layoutManager= GridLayoutManager(this,2)

        recycler_view_items.adapter=itemAdapter


    }



    private fun getItemList():ArrayList<String>{
        val list = ArrayList<String>()
         //val list1= arrayListOf("dgffd","sfdfs","dfdfssd","dfgdfd")

        for(i in 1..30){
           list.add("Item $i ")
            //list.add("bla bla")
        }
        return list
    }
    private fun getAnotherItemList():ArrayList<DataModel>{
        val list=ArrayList<DataModel>()

        list.add(DataModel("Item 1 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 2 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 3 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 4 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 5 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 6 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 7 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 8 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 9 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 10 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))
        list.add(DataModel("Item 11 ViewType 1",ItemAdapter.VIEW_TYPE_ONE))
        list.add(DataModel("Item 12 ViewType 2",ItemAdapter.VIEW_TYPE_TWO))

        return list
    }
}