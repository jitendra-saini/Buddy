package com.example.buddy.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.buddy.Model.Horizontal_recycler_view;
import com.example.buddy.R;

import java.util.ArrayList;

public class Profile_Review_Adapter extends RecyclerView.Adapter<Profile_Review_Adapter.MyViewHolder> {
    Context context;
    private ArrayList<Horizontal_recycler_view> imagesArrayList=new ArrayList<>();

    public Profile_Review_Adapter(Context context, ArrayList<Horizontal_recycler_view> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
    }

    @NonNull
    @Override
    public Profile_Review_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.profile_review_resource,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Profile_Review_Adapter.MyViewHolder myViewHolder, int i) {

        myViewHolder.imageView.setImageResource(imagesArrayList.get(i).getImageUri());


    }

    @Override
    public int getItemCount() {
        return imagesArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView=itemView.findViewById(R.id.book_image);
        }
    }
}
