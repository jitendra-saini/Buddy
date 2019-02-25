package com.example.buddy.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.buddy.Adapter.Library_child_Recycler_View;
import com.example.buddy.Adapter.Profile_Review_Adapter;
import com.example.buddy.Model.Images;
import com.example.buddy.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

RecyclerView recyclerView,recyclerView1;
Library_child_Recycler_View adapter;
    private ArrayList<Images> imagesArrayList=new ArrayList<>();
Profile_Review_Adapter adapter2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);


           addData();

           recyclerView1=view.findViewById(R.id.profile_reviews_recycler_view);
           recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
           adapter2=new Profile_Review_Adapter(getContext(),imagesArrayList);
           recyclerView1.setAdapter(adapter2);

        recyclerView=view.findViewById(R.id.profile_books_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        adapter=new Library_child_Recycler_View(getContext(),1,imagesArrayList);
        recyclerView.setAdapter(adapter);

         return view;
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
