package com.example.buddy.Fragments;

import android.app.SearchManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.buddy.Adapter.Library_parent_Recycler_Adapter;
import com.example.buddy.Model.Horizontal_recycler_view;
import com.example.buddy.Model.Vertical_Recycler_view;
import com.example.buddy.R;

import java.util.ArrayList;

public class DiscoverFragment extends Fragment {

    private SearchView searchView = null;
    private SearchView.OnQueryTextListener queryTextListener;

    RecyclerView recyclerViewTop;

    Library_parent_Recycler_Adapter adapter;

    ArrayList<Vertical_Recycler_view> arrayList=new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_discover, container, false);


      /*  Toolbar toolbar=view.findViewById(R.id.toolbar);
         *//*  toolbar.inflateMenu(R.menu.toolbar_menu);
            toolbar.setTitle("Library");*//*
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);*/


       recyclerViewTop=view.findViewById(R.id.recycler_view);
       recyclerViewTop.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
       recyclerViewTop.setHasFixedSize(true);
       adapter=new Library_parent_Recycler_Adapter(getContext(),arrayList,1);
       recyclerViewTop.setAdapter(adapter);



       addTempData();






     return view;
    }
 /*   @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        Log.e("filter","filter");
        inflater.inflate(R.menu.toolbar_menu, menu);
        Log.e("filter","filter");
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);

        if (searchItem != null) {
            searchView = (SearchView) searchItem.getActionView();
        }
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

            queryTextListener = new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextChange(String newText) {
                    Log.i("onQueryTextChange", newText);
                    adapter.getFilter().filter(newText);
                    return false;
                }
                @Override
                public boolean onQueryTextSubmit(String query) {
                    adapter.getFilter().filter(query);
                    Log.i("onQueryTextSubmit", query);

                    return false;
                }
            };
            searchView.setOnQueryTextListener(queryTextListener);
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // Not implemented here
                return false;
            default:
                break;
        }
        searchView.setOnQueryTextListener(queryTextListener);
        return super.onOptionsItemSelected(item);
    }

*/
    private void addTempData(){


        ArrayList<Horizontal_recycler_view> arrayList1=new ArrayList<>();
        ArrayList<Horizontal_recycler_view> arrayList2=new ArrayList<>();
        ArrayList<Horizontal_recycler_view> arrayList3=new ArrayList<>();

        arrayList1.add(new Horizontal_recycler_view("batman beyond",R.drawable.book66));
        arrayList1.add(new Horizontal_recycler_view("Book one",R.drawable.book66));
        arrayList1.add(new Horizontal_recycler_view("Book two",R.drawable.book66));
        arrayList1.add(new Horizontal_recycler_view("Book three",R.drawable.book66));
        arrayList1.add(new Horizontal_recycler_view("Book four",R.drawable.book66));


        arrayList2.add(new Horizontal_recycler_view("batman beyond",R.drawable.book1));
        arrayList2.add(new Horizontal_recycler_view("Book 1",R.drawable.book1));
        arrayList2.add(new Horizontal_recycler_view("Book 2",R.drawable.book1));
        arrayList2.add(new Horizontal_recycler_view("Book 3",R.drawable.book1));
        arrayList2.add(new Horizontal_recycler_view("Book 4",R.drawable.book1));

        arrayList3.add(new Horizontal_recycler_view("batman beyond",R.drawable.book2));
        arrayList3.add(new Horizontal_recycler_view(" one",R.drawable.book2));
        arrayList3.add(new Horizontal_recycler_view(" two",R.drawable.book2));
        arrayList3.add(new Horizontal_recycler_view(" three",R.drawable.book2));
        arrayList3.add(new Horizontal_recycler_view(" four",R.drawable.book2));

        arrayList.add(new Vertical_Recycler_view("action",arrayList1));
        arrayList.add(new Vertical_Recycler_view("adventure",arrayList2));
        arrayList.add(new Vertical_Recycler_view("fantasy",arrayList3));

    }
}
