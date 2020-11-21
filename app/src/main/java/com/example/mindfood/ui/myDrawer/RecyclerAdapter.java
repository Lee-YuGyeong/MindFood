package com.example.mindfood.ui.myDrawer;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mindfood.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    private Fragment fragment;
    private ArrayList<listview_item> datalist;



    @NonNull
    @Override
    public RecyclerAdapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item,parent,false);
        MyViewholder viewholder = new MyViewholder(view);

        return viewholder;
    }


    public void onBindViewHolder(RecyclerAdapter.MyViewholder holder, int position) {
        listview_item data = datalist.get(position);
        holder.Name.setText(data.getName());
        //holder.Image.setImageResource(data.getImageNumber());
        holder.Rating.setRating((float)data.getRating());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewholder extends  RecyclerView.ViewHolder{
        TextView Name;
        RatingBar Rating;
        //ImageView Image;


        public MyViewholder(@NonNull View listview_item) {
            super(listview_item);
            Name = (TextView)listview_item.findViewById(R.id.name);
            Rating = (RatingBar)listview_item.findViewById(R.id.ratingBar);
            //Image = (ImageView)listview_item.findViewById(R.id.image);


//            listview_item.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //Toast.makeText(fragment, Name.getText().toString(),Toast.LENGTH_SHORT).show();
//                   // Intent intent = new Intent(v.getContext(),액티비티명.class);
//                   // intent.putExtra("아바타",Name.getText().toString());
//
//                  //  v.getContext().startActivity(intent);
//                }
//            });
        }
    }

    public RecyclerAdapter(Fragment fragment, ArrayList<listview_item> datalist){
        this.fragment = fragment;
        this.datalist = datalist;
    }
}

