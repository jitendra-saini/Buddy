package com.example.buddy.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.buddy.Model.Images;
import com.example.buddy.R;

import java.util.ArrayList;

public class Library_child_Recycler_View extends RecyclerView.Adapter<Library_child_Recycler_View.MyViewHolder> {
    Context context;
    int ORIGEN;
    private ArrayList<Images> imagesArrayList=new ArrayList<>();

    public Library_child_Recycler_View(Context context, int position, ArrayList<Images> imagesArrayList) {
        this.context = context;
        this.ORIGEN = position;
        this.imagesArrayList = imagesArrayList;
    }

    @NonNull
    @Override
    public Library_child_Recycler_View.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.library_child_recyclerview,viewGroup,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Library_child_Recycler_View.MyViewHolder myViewHolder, int i) {
         final Images imageslist=imagesArrayList.get(i);

       myViewHolder.imageView.setImageResource(imagesArrayList.get(i).getImage());








    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
