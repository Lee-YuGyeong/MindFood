package com.example.mindfood.ui.recommendation;

public class RecommendationListItem {

    String url;
    String title;
    String author;
    int rank;


    public RecommendationListItem(String url, String title, String author, int rank) {
        this.url = url;
        this.title = title;
        this.author = author;
        this.rank = rank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
