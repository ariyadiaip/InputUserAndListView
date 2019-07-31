package id.smkn4.smkcoding.inputuserandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //Data-Data yang Akan ditampilkan
    private String[] youtubeChannel = {"Nihongo Mantappu","Dunia Manji","Eka Gustiwana",
            "Tri Suaka Channel","Kery Astina", "Baim Paula","Erpan1140","Vincent Raditya",
            "Andy Sugar","SG Entertaiment", "Narasi Channel", "Calon Sarjana"};

    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listContainer);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.custom_style, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView adapterView, View view, int position, long l) {
        String getYoutubeChannel = data.get(position);
        Toast.makeText(this, getYoutubeChannel +" Subscribed", Toast.LENGTH_SHORT).show();
    }

    private void getData(){
        Collections.addAll(data, youtubeChannel);
    }
}
