package com.androidtraining.listviewaproach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androidtraining.lib.MyClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView itemsLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        itemsLV = findViewById(R.id.itemsLV);
        MyClass myClass = new MyClass();

        ArrayAdapter adapter = new ArrayAdapter<>(
                this,
                R.layout.activity_listview_item ,
                myClass.createList(1000));

        itemsLV.setAdapter(adapter);
    }
}
