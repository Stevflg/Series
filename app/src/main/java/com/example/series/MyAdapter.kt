package com.example.series

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.series.databinding.ItemSeriesBinding
import com.squareup.picasso.Picasso

class MyAdapter (private val context:Context,private val arrayList:java.util.ArrayList<Series>):BaseAdapter(){
    override fun getCount(): Int {
      return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
      val binding= ItemSeriesBinding.inflate(LayoutInflater.from(parent.context),parent, false )
      var convertView= convertView
        convertView=binding.root

        binding.titleSerie.text=arrayList[position].title
        binding.yearSerie.text="${arrayList[position].year}"
        if (arrayList[position].imageurl!=null){
            Picasso.get().load(arrayList[position].imageurl).into(binding.imageView)
        }
        return convertView
    }

}