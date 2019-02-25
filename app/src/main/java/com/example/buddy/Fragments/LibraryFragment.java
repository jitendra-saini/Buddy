package com.example.buddy.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.buddy.Adapter.Library_parent_Recycler_Adapter;
import com.example.buddy.R;


public class LibraryFragment extends Fragment {

RecyclerView recyclerView;
Library_parent_Recycler_Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_library, container, false);


        Toolbar toolbar=view.findViewById(R.id.toolbar);
            toolbar.inflateMenu(R.menu.toolbar_menu);
        /*AppCompatActivity activity = (AppCompatActivity) getActivity();

        activity.setSupportActionBar(toolbar);*/
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {



                SearchView searchView= (SearchView) menuItem.getActionView();
                searchView.setQueryHint("Search");

                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                /*mAdapter.getFilter().filter(query);

                return true;*/
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                      //  mAdapter.getFilter().filter(newText);

                        return true;
                    }
                });


                return false;
            }
        });




        recyclerView=view.findViewById(R.id.library_parent_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Library_parent_Recycler_Adapter(getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }


}
