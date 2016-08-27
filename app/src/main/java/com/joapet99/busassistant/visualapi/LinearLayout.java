package com.joapet99.busassistant.visualapi;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.joapet99.busassistant.MainPage;
import com.joapet99.busassistant.R;

/**
 * Created by Joakim on 26.08.2016.
 */
public class LinearLayout {
    String busNumber;
    android.widget.LinearLayout busLayout;
    MainPage window;
    Extra ex;

    public LinearLayout(String id, MainPage window) {
        if (window == null) {
            throw new NullPointerException("Window has not been set at constructor LinearLayout");
        }

        this.window = window;
        this.busNumber = id.split("_")[1];
        System.out.println("{{Found connection to bus " + busNumber + " in " + id);

        busLayout = (android.widget.LinearLayout) this.window.findViewById(this.window.getResources()
                .getIdentifier(id, "id", this.window.getPackageName()));
        if (busLayout != null) {
            System.out.println("{{Succesfully opened layout " + id);
            System.out.println("{{Printing first child:" + ((TextView)busLayout.getChildAt(2)).getText());
        } else {
            System.out.println("{{Failed at opening " + id + " | This is a critical error and must be fixed");
        }
    }

    public Extra getExtra(){
        if(ex == null){
            ex = Extra.parseString(searchExtra());
        }
        return ex;
    }

    private String searchExtra(){
        for(int i = 0; i < this.busLayout.getChildCount();i++){
            TextView tw = (TextView)this.busLayout.getChildAt(i);
            if(tw == null){
                System.err.println("WARNING:" + this.busLayout.getResources().getResourceName(
                        this.busLayout.getChildAt(i).getId()) + " is not a TextView");
                continue;
            }
            if(String.valueOf(tw.getText()).startsWith(Extra.EXTRA_IDENTIFIER_TAG)){
                return String.valueOf(tw.getText());
            }
        }
        return null;
    }
}
