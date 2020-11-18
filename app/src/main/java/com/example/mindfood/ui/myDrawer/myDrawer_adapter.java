package com.example.mindfood.ui.myDrawer;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myDrawer_adapter extends BaseAdapter{

    private ArrayList<gridview_item> gridviewItemList;
    Context mContext = null;

    public myDrawer_adapter(ArrayList<gridview_item> itemList){
        if(itemList ==null){
            gridviewItemList = new ArrayList<>();
        }
        else{
            gridviewItemList=itemList;
        }
    }
    //data 갯수
    @Override
    public int getCount() {
        return gridviewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return gridviewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    @NonNull

    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        gridviewholder holder;

        if(convertView==null){
            holder = new gridviewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = (LinearLayout)inflater.inflate(R.layout.gridview_item,null);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            //holder.image=(ImageView)convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        }
        else{
            holder=(gridviewholder)convertView.getTag();
        }
        gridview_item dto = gridviewItemList.get(position);
        holder.name.setText(dto.getName());
        //holder.image.setImageDrawable(dto.getImage());
        return convertView;
    }
    public static class gridviewholder{
        //ImageView image;
        TextView name;
    }
}

