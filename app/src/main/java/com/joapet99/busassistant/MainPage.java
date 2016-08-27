package com.joapet99.busassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.joapet99.busassistant.framework.Bus;
import com.joapet99.busassistant.framework.BusTable;
import com.joapet99.busassistant.visualapi.LinearLayout;

public class MainPage extends AppCompatActivity {
    Route route;
    Route compare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Bus bus = new Bus("02", BusTable.BUS02);

        TextView tw = (TextView)findViewById(R.id.nextBus_02);
        tw.setText(tw.getText() + String.valueOf(bus.estimateRoute(true)));

        LinearLayout layout = new LinearLayout("layout_02", this);
    }

    public void addRoute(View view){
        Intent intent = new Intent(this,AddRoute.class);
        startActivity(intent);
    }
}
