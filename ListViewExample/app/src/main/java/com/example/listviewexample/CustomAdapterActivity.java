package com.example.listviewexample;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Ant", R.mipmap.ic_ant));
        animals.add(new Animal("Bear", R.mipmap.ic_bear));
        animals.add(new Animal("Bird", R.mipmap.ic_bird));
        animals.add(new Animal("Cat", R.mipmap.ic_cat));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter= new AnimalAdapter (this, animals);
        listView.setAdapter(adapter);
    }
}