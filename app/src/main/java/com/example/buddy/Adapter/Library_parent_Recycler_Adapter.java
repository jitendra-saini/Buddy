package com.example.buddy.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.buddy.Model.Horizontal_recycler_view;
import com.example.buddy.Model.Vertical_Recycler_view;
import com.example.buddy.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Library_parent_Recycler_Adapter extends RecyclerView.Adapter<Library_parent_Recycler_Adapter.MyViewHolder> implements Filterable {
      Context context;
      ArrayList<Vertical_Recycler_view> arrayList;
      int ORIGEN;
      private ArrayList<Vertical_Recycler_view> filterList;


    public Library_parent_Recycler_Adapter(Context context, ArrayList<Vertical_Recycler_view> arrayList, int ORIGEN) {
        this.context = context;
        this.arrayList = arrayList;
        this.ORIGEN = ORIGEN;
        this.filterList=arrayList;
    }

    @NonNull
    @Override
    public Library_parent_Recycler_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



        View view= LayoutInflater.from(context).inflate(R.layout.library_parent_recyclerview,viewGroup,false);


        return new MyViewHolder(view);

       }

    @Override
    public void onBindViewHolder(@NonNull Library_parent_Recycler_Adapter.MyViewHolder myViewHolder, int i) {
        Vertical_Recycler_view vertical_recycler_view=filterList.get(i);
        String category=vertical_recycler_view.getCategory();
        ArrayList<Horizontal_recycler_view> horizontal_recycler_views=vertical_recycler_view.getHorizontal_recycler_views();

        myViewHolder.category.setText(category);

              if(ORIGEN==1){
                  myViewHolder.category.setVisibility(View.GONE);
              }
          Library_child_Recycler_View adapter=new Library_child_Recycler_View(context,horizontal_recycler_views,ORIGEN);
          myViewHolder.recyclerView.setHasFixedSize(true);
          myViewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
          myViewHolder.recyclerView.setAdapter(adapter);
    }




    @Override
    public int getItemCount() {
        return filterList.size();
    }

    @Override
    public Filter getFilter() {


        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
               String charString=constraint.toString();
               if(charString.isEmpty()){

                   filterList=arrayList;

               }else {
                   ArrayList<Vertical_Recycler_view> filteredlist=new ArrayList<>();
                   for(Vertical_Recycler_view cat :arrayList){

                       if(cat.getCategory().toLowerCase().contains(charString.toLowerCase()) /*|| cat.getHorizontal_recycler_views().contains(charString)*/){

                           filteredlist.add(cat);
                       }
                   }
                   filterList=filteredlist;
               }
                FilterResults filterResults=new FilterResults();
               filterResults.values= filterList;
               return filterResults;

            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                filterList= (ArrayList<Vertical_Recycler_view>) results.values;
                notifyDataSetChanged();

            }
        };
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;
        TextView category;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView=itemView.findViewById(R.id.library_child_recyclerView);
            category=itemView.findViewById(R.id.category);

        }
    }



}
