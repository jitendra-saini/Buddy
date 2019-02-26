package com.example.buddy.Model;

import java.util.ArrayList;

public class Vertical_Recycler_view {

    String category;
    ArrayList<Horizontal_recycler_view> horizontal_recycler_views;

    public Vertical_Recycler_view(String category, ArrayList<Horizontal_recycler_view> horizontal_recycler_views) {
        this.category = category;
        this.horizontal_recycler_views = horizontal_recycler_views;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Horizontal_recycler_view> getHorizontal_recycler_views() {
        return horizontal_recycler_views;
    }

    public void setHorizontal_recycler_views(ArrayList<Horizontal_recycler_view> horizontal_recycler_views) {
        this.horizontal_recycler_views = horizontal_recycler_views;
    }
}
