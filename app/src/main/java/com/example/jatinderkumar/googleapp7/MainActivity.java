package com.example.jatinderkumar.googleapp7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<EarthQuake> earthquakes = QueryUtils.extractEarthquakes();
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));
//        earthquakes.add(new EarthQuake("Mumbai",8.0,"20-02-2018"));

        list = findViewById(R.id.list);
        final EarthQuakeAdapter adapter = new EarthQuakeAdapter(MainActivity.this,earthquakes);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EarthQuake quake = adapter.getItem(position);
                Uri url = Uri.parse(quake.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);
            }
        });

    }
}
