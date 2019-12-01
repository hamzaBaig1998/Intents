package com.example.labmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListofAreas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_areas);
        ListView listView=(ListView) findViewById(R.id.listofareas);
        final int serviceCode=getIntent().getIntExtra("serviceCode",1);
        AdapterView.OnItemClickListener clickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ListofAreas.this,ListofPerson.class);
                intent.putExtra("servieCode",serviceCode);
                intent.putExtra("areaCode",(int)id+1);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(clickListener);

    }
}
