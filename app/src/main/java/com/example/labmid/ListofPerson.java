package com.example.labmid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListofPerson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_person);
        int serviceCode=getIntent().getIntExtra("serviceCode",1);
        int areaCode=getIntent().getIntExtra("areaCode",1);

        ListView listView=(ListView) findViewById(R.id.listofpersons);
        final ArrayList<ServiceInformation> person=new ArrayList<ServiceInformation>();

        for(int i=0;i<ServiceInformation.serviceInformation.length;i++){
            if(ServiceInformation.serviceInformation[i].getAreaCode()==areaCode && ServiceInformation.serviceInformation[i].getServiceCode()==serviceCode){
                person.add(ServiceInformation.serviceInformation[i]);
            }
        }

        ArrayAdapter<ServiceInformation> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,person);
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener clickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=(int)id;
                String contact=person.get(index).getContactNumber();
                Intent intent=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:"+contact));
                intent.putExtra("sms_body",person.get((int)id).getUrgentMessage());
                Intent chooserIntent=Intent.createChooser(intent,"Select an app of your choice");
                if(chooserIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooserIntent);
                }
            }
        };
        listView.setOnItemClickListener(clickListener);
    }
}
