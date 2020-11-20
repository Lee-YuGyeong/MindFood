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

public class RecommendationListItemView extends LinearLayout {

    ImageView imageView;
    TextView textView;
    TextView textView2;
    TextView textView3;

    public RecommendationListItemView(Context context) {
        super(context);

        init(context);
    }

    public RecommendationListItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.recommendation_rank_list_item, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setUrl(String url) {
        Glide.with(getContext().getApplicationContext()).load(url).into(imageView);
    }

    public void setTitle(String title) {
        textView.setText(title);
    }

    public void setAuthor(String author) {
        textView2.setText(author);
    }

    public void setRank(int rank) {
        textView3.setText(String.valueOf(rank));
    }

}
