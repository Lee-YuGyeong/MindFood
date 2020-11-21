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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mindfood.R;

import java.util.ArrayList;

public class MyDrawerFragment extends Fragment {
    LinearLayoutManager llm;
    RecyclerAdapter adapter;
    RecyclerView rcv;
    GridLayoutManager glm;
    ArrayList<listview_item> Data;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_my_drawer, container, false);

        rcv = (RecyclerView)root.findViewById(R.id.recyclerView);
//        llm = new LinearLayoutManager(getContext());
//        //glm = new GridLayoutManager(getContext())
//        rcv.setHasFixedSize(true);
//        //rcv.setLayoutManager(llm);
//
//        Data.add(new listview_item("백설공주",3.0));
        //Data.add(new listview_item("백설공주",3));
        //Data.add(new listview_item("백설공주",3));
        adapter = new RecyclerAdapter(this,Data);
//        llm = new LinearLayoutManager(getActivity());

        rcv.setAdapter(adapter);

//        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch (view.getId()){
//
//                    case R.id.grid:
//                        Intent intent = new Intent(getContext(),gridview_item.class);
//                        intent.putExtra("Name",Data.get(position).getName());
//                        //intent.putExtra("Image",Data.get(position).getImage());
//                        startActivity(intent);
//
//
//                }
//
//
//
//            }
//        });
        return root;
    }


}