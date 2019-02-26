package com.example.buddy.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.buddy.Book;
import com.example.buddy.Model.Horizontal_recycler_view;
import com.example.buddy.R;

import java.util.ArrayList;

public class Library_child_Recycler_View extends RecyclerView.Adapter<Library_child_Recycler_View.MyViewHolder> {
    Context context;

    ArrayList<Horizontal_recycler_view> arrayList;
    int ORIGEN;

    public Library_child_Recycler_View(Context context, ArrayList<Horizontal_recycler_view> arrayList, int ORIGEN) {
        this.context = context;
        this.arrayList = arrayList;
        this.ORIGEN = ORIGEN;
    }

    @NonNull
    @Override
    public Library_child_Recycler_View.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (ORIGEN){


            case 0:{

                View view= LayoutInflater.from(context).inflate(R.layout.library_child_recyclerview,viewGroup,false);


                return new MyViewHolder(view);
            }
            case 1:{
                Log.e("Adapter","discover Adapter");
                View view= LayoutInflater.from(context).inflate(R.layout.discover_top_layout,viewGroup,false);


                return new MyViewHolder(view);
            }
            default: {
                View view = LayoutInflater.from(context).inflate(R.layout.empty_resource, viewGroup, false);
                return new MyViewHolder(view);
            }}
    }

    @Override
    public void onBindViewHolder(@NonNull Library_child_Recycler_View.MyViewHolder myViewHolder, int i) {
        final Horizontal_recycler_view model=arrayList.get(i);

        myViewHolder.imageView.setImageResource(model.getImageUri());
           myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   Intent intent=new Intent(context, Book.class);
                   intent.putExtra("bookImage",model.getImageUri());
                   intent.putExtra("bookName",model.getTitle());
                   context.startActivity(intent);
                   Toast.makeText(context,model.getTitle(),Toast.LENGTH_SHORT).show();
               }
           });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
