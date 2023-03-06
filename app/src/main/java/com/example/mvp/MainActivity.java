package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainRole.view {
    private static final String TAG = "MainActivity";
    private MainRole.presenter ma = new PresenterMain();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
ma.onAttach(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ma.Detach();
    }

    @Override
    public void showUsers(List<Users> users) {
        Log.d(TAG, "showUsers: ");
    }
}