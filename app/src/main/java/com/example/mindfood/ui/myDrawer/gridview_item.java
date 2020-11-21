package com.example.mindfood.ui.myDrawer;

import android.widget.RatingBar;

public class gridview_item {
    private String name;
    private double rating;
   // private int imageNumber;


    public gridview_item(String name,int imageNumber,float rating){
        this.name = name;
        this.rating = rating;
        //this.imageNumber = imageNumber;
    }




    public void setName(String name){this.name = name;}
    public String getName(){
        return name;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

//    public void setImageNumber(int imageNumber) {
//        this.imageNumber = imageNumber;
//    }
//    public int getImageNumber() {
//        return imageNumber;
//    }


}

