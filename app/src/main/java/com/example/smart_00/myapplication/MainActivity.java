package com.example.smart_00.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    MyGridAdapter gAdaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드");

        gv = (GridView) findViewById(R.id.gridView1);
        gAdaper = new MyGridAdapter(this);
        gv.setAdapter(gAdaper);
    }
}
