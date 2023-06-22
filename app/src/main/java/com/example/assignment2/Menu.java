package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recycler = findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(Item.list);
        recycler.setAdapter(adapter);
    }

    public void getItem(View view) {
        recycler.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(Item.list);
        recycler.setAdapter(adapter);
    }

}
