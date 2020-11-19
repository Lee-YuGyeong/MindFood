package com.example.mindfood.ui.recommendation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.mindfood.R;
import com.example.mindfood.ui.myDrawer.MyDrawerFragment;
import com.google.android.material.tabs.TabLayout;

public class RecommendationFragment extends Fragment {

    RecommendationFragment1 recommendationFragment1;
    RecommendationFragment2 recommendationFragment2;
    ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_recommendation, container, false);

        recommendationFragment1 = new RecommendationFragment1();
        recommendationFragment2 = new RecommendationFragment2();

        TabLayout tabs = (TabLayout) root.findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("추천도서"));
        tabs.addTab(tabs.newTab().setText("베스트셀러"));

        viewPager=(ViewPager) root.findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}