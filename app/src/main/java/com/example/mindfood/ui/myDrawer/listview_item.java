package com.example.mindfood.ui.myDrawer;

import android.widget.RatingBar;

public class listview_item {
    private String name;
    private double rating;
    //private int imageNumber;


    public listview_item(String name,int imageNumber,double rating){
        this.name = name;
        this.rating = rating;
        //this.imageNumber = imageNumber;
    }




    public void setName(String name){this.name = name;}
    public void setRating(double rating) {
        this.rating = rating;
    }
//    public void setImageNumber(int imageNumber) {
//        this.imageNumber = imageNumber;
//    }
    public String getName(){
        return name;
    }
//    public int getImageNumber() {
//        return imageNumber;
//    }
    public double getRating() {
        return rating;
    }






}

