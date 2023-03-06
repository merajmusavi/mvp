package com.example.mvp;

public class PresenterMain implements MainRole.presenter {
private MainRole.view view1;
    @Override
    public void onAttach(MainActivity view) {
        this.view1 = (MainRole.view) view;

this.view1.showUsers(ModelLayer.users());
    }

    @Override
    public void Detach() {
this.view1 = null;
    }
}
