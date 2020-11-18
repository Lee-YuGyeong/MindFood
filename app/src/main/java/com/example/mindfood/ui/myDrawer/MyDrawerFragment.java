package com.example.mindfood.ui.myDrawer;

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

import com.example.mindfood.R;

public class MyDrawerFragment extends Fragment {

    private MyDrawerViewModel myDrawerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myDrawerViewModel =
                ViewModelProviders.of(this).get(MyDrawerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_drawer, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        myDrawerViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}