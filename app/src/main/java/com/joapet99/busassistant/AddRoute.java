package com.joapet99.busassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddRoute extends AppCompatActivity {
    Route tempRoute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_route);
        tempRoute = new Route();
    }

    public void onRadioButton(View view){

    }
}
