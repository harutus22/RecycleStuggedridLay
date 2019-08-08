package com.example.recyclestuggedridlay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private ArrayList<MovieExample> list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list2 = new ArrayList<>();
        list2.add(new MovieExample(R.drawable.spiderman, "Spider Man: Into Spider_Verse"));
        list2.add(new MovieExample(R.drawable.the_matrix, "The Matrix"));
        list2.add(new MovieExample(R.drawable.upgrade, "Upgrade"));
        list2.add(new MovieExample(R.drawable.silent_hill, "Silent Hill"));

        ArrayList<MovieExample> list = new ArrayList<>();
        list.add(new MovieExample(R.drawable.dr_strange,"Dr. Strange"));
        list.add(new MovieExample(R.drawable.hotel_transylvania,"Hotel Transylvania"));
        list.add(new MovieExample(R.drawable.lego_movie,"Lego Movie"));
        list.add(new MovieExample(R.drawable.men_in_black,"Men In Black"));
        list.add(new MovieExample(R.drawable.resident_evil,"Resident Evil"));
        list.add(new MovieExample(R.drawable.jay_and_silent_bob,"Jay and Silent Bob: Strike Back"));

        RecyclerView recyclerView = findViewById(R.id.recycler);
        myAdapter = new MyAdapter(list);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,
                StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);
    }

    public void add(View view){
        if(list2.size() == 0){
            Toast.makeText(this, "No films remained", Toast.LENGTH_LONG).show();
        } else {
            myAdapter.addElement(list2.get(0));
            list2.remove(0);
        }
    }
}
