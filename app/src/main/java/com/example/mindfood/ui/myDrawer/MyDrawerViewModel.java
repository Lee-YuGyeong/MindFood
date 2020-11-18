package com.example.mindfood.ui.myDrawer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyDrawerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyDrawerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myDrawer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}