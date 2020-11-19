package com.example.mindfood.ui.recommendation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mindfood.R;

import java.util.ArrayList;

public class RecommendationFragment1 extends Fragment {

    RecommendationRankAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_recommendation1, container, false);

        GridView gridView = (GridView) root.findViewById(R.id.gridView);

        adapter = new RecommendationRankAdapter();

        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));
        adapter.addItem(new RecommendationGridItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이"));

        gridView.setAdapter(adapter);



        return root;
    }

    class RecommendationRankAdapter extends BaseAdapter {
        ArrayList<RecommendationGridItem> items = new ArrayList<RecommendationGridItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(RecommendationGridItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            RecommendationGridItemView view = null;
            if (convertView == null) {
                view = new RecommendationGridItemView(getContext());
            } else {
                view = (RecommendationGridItemView) convertView;
            }

            RecommendationGridItem item = items.get(position);

            view.setUrl(item.getUrl());
            view.setTitle(item.getTitle());


            return view;
        }
    }

}
