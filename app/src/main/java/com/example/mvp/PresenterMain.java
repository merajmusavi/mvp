package com.example.mvp;

public class PresenterMain {
    MainActivity mainActivity = new MainActivity();

    public void onAttach(MainActivity mainActivity){
        this.mainActivity = mainActivity;

    }
}
