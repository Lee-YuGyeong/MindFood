package com.example.mindfood.ui.recommendation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.mindfood.R;


public class RecommendationGridItemView extends LinearLayout {

    ImageView imageView;
    TextView textView;

    public RecommendationGridItemView(Context context) {
        super(context);

        init(context);
    }

    public RecommendationGridItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.recommendation_rank_grid_item, this, true);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setUrl(String url) {
        Glide.with(getContext().getApplicationContext()).load(url).into(imageView);
    }

    public void setTitle(String title) {
        textView.setText(title);
    }
}
