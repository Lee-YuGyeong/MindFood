package com.example.mindfood.ui.recommendation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mindfood.R;

import java.util.ArrayList;

public class RecommendationFragment2 extends Fragment {

    RecommendationRankAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_recommendation2, container, false);

        ListView listView = (ListView) root.findViewById(R.id.listView);

        adapter = new RecommendationRankAdapter();

        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",1));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",2));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",3));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",4));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",5));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",6));
        adapter.addItem(new RecommendationListItem("https://img.youtube.com/vi/1KZCltPHvqk/1.jpg", "고양이", "유경",7));

        listView.setAdapter(adapter);


        return root;
    }

    class RecommendationRankAdapter extends BaseAdapter {
        ArrayList<RecommendationListItem> items = new ArrayList<RecommendationListItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(RecommendationListItem item) {
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
            RecommendationListItemView view = null;
            if (convertView == null) {
                view = new RecommendationListItemView(getContext());
            } else {
                view = (RecommendationListItemView) convertView;
            }

            RecommendationListItem item = items.get(position);

            view.setUrl(item.getUrl());
            view.setTitle(item.getTitle());
            view.setAuthor(item.getAuthor());
            view.setRank(item.getRank());

            return view;
        }
    }

}
