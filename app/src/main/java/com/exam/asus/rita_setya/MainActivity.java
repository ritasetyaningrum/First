package com.exam.asus.rita_setya;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    int [] images ={R.drawable.matajitu, R.drawable.agal, R.drawable.aibeling, R.drawable.kalela, R.drawable.kenawa, R.drawable.paserang,R.drawable.bedil,R.drawable.tropical,R.drawable.benete,R.drawable.mantar};
    String [] names = {"AIR TERJUN MATAJITU","AIR TERJUN AGAL","AIR TERJUN AI BELING","AIR TERJUN KALELA","PULAU KENAWA",
            "PULAU  PASERANG","PULAU BEDIL","PANTAI TROPICA","PANTAI BENETE","PUNCAK MANTAR"};
    String [] positions = {"AIR TERJUN MATAJITU","AIR TERJUN AGAL","AIR TERJUN AI BELING","AIR TERJUN KALELA","PULAU KENAWA",
            "PULAU  PASERANG","PULAU BEDIL","PANTAI TROPICA","PANTAI BENETE","PUNCAK MANTAR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);
        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        MyAdapter adapter=new MyAdapter(this,names,positions,images);
        rv.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}