package com.example.labmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceProvider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button transporation=(Button) findViewById(R.id.transportation);
        final Button maintenance=(Button) findViewById(R.id.maintenance);
        final Button purchase=(Button) findViewById(R.id.purchase);

        transporation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServiceProvider.this,ListofAreas.class);
                intent.putExtra("serviceCode",1);
                startActivity(intent);
            }
        });
        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServiceProvider.this,ListofAreas.class);
                intent.putExtra("serviceCode",2);
                startActivity(intent);
            }
        });
        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServiceProvider.this,ListofAreas.class);
                intent.putExtra("serviceCode",3);
                startActivity(intent);
            }
        });
    }
}
