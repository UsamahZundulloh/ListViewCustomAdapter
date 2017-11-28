package com.ushfree.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] itemList = {"Amerika", "Afrika", "Australia", "Belanda", "Brazil",
                "China", "Chili", "Francis", "Ghana", "Indonesia", "Inggris", "Italia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Object o = listView.getItemAtPosition(position);
                String item = (String)o;
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
