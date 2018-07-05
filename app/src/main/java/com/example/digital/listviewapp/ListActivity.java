package com.example.digital.listviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_listview, R.id.label, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);
    }
}
