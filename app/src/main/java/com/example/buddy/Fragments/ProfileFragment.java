package com.example.buddy.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buddy.Adapter.Library_child_Recycler_View;
import com.example.buddy.Adapter.Profile_Review_Adapter;
import com.example.buddy.Model.Horizontal_recycler_view;
import com.example.buddy.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

RecyclerView recyclerView,recyclerView1;
Library_child_Recycler_View adapter;
    private ArrayList<Horizontal_recycler_view> imagesArrayList=new ArrayList<>();
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
        adapter=new Library_child_Recycler_View(getContext(),imagesArrayList,0);
        recyclerView.setAdapter(adapter);

         return view;
    }

    public void addData(){


           imagesArrayList.add(new Horizontal_recycler_view("book 1",R.drawable.book2));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.book66));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.book4));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.book7));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.book66));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));
           imagesArrayList.add(new Horizontal_recycler_view("book2",R.drawable.thor));



    }


}
