package com.example.buddy.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buddy.Model.Images;
import com.example.buddy.R;

import java.util.ArrayList;

public class Library_parent_Recycler_Adapter extends RecyclerView.Adapter<Library_parent_Recycler_Adapter.MyViewHolder> {

    private ArrayList<Images> imagesArrayList=new ArrayList<>();

    Context context;
    Library_child_Recycler_View child_adapter;

    public Library_parent_Recycler_Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Library_parent_Recycler_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(context).inflate(R.layout.library_parent_recyclerview,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Library_parent_Recycler_Adapter.MyViewHolder myViewHolder, int i) {


            myViewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
           child_adapter=new Library_child_Recycler_View(context,i,imagesArrayList);
           myViewHolder.recyclerView.setAdapter(child_adapter);


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView=itemView.findViewById(R.id.library_child_recyclerView);
                  addData();
        }
    }

    public void addData(){


        imagesArrayList.add(new Images(R.drawable.thor,0));
        imagesArrayList.add(new Images(R.drawable.book1,0));
        imagesArrayList.add(new Images(R.drawable.book1,1));
        imagesArrayList.add(new Images(R.drawable.book2,1));
        imagesArrayList.add(new Images(R.drawable.book3,2));
        imagesArrayList.add(new Images(R.drawable.book4,2));
        imagesArrayList.add(new Images(R.drawable.book66,3));
        imagesArrayList.add(new Images(R.drawable.book7,3));
        imagesArrayList.add(new Images(R.drawable.book7,4));
        imagesArrayList.add(new Images(R.drawable.book7,4));





    }


}
