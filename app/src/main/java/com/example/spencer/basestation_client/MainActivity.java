package com.example.spencer.basestation_client;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {



    public void internalServer(View view){
        Intent internal = new Intent(this, internalActivity.class);
        startActivity(internal);
    }

    public void externalServer(View view){
        Intent internal = new Intent(this, internalActivity.class);
        startActivity(internal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
