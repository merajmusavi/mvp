package com.example.mvp;

import java.util.List;

public interface MainRole {

    interface view{
void showUsers(List<Users> users);
    }
    interface presenter{
        void onAttach(MainActivity view);
        void Detach();
    }

}
