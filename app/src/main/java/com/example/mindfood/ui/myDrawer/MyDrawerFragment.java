package com.example.mindfood.ui.myDrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mindfood.R;

import java.util.ArrayList;

public class MyDrawerFragment extends Fragment {
    ArrayList<gridview_item> Data;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_my_drawer, container, false);


        //setContentView(R.layout.fragment_my_drawer);
        InitializeData();
        final myDrawer_adapter adapter = new myDrawer_adapter(Data);

        //레잉아웃 리소스 배치(리스트뷰)
        GridView gridView = (GridView)root.findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(),gridview_item.class);
                intent.putExtra("Name",Data.get(position).getName());
                //intent.putExtra("Image",Data.get(position).getImage());
                startActivity(intent);
            }
        });
        return root;
    }

    public void InitializeData(){
        Data = new ArrayList<gridview_item>();
        Data.add(new gridview_item("어린왕자"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
        Data.add(new gridview_item("백설공주"));
    }

}