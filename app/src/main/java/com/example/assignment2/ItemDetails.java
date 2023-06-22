package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        // local variables since it used just here
        ImageView image = findViewById(R.id.item_image);
        TextView name = findViewById(R.id.item_name);
        TextView description = findViewById(R.id.item_descriptions);

        Item f = Item.list[Integer.parseInt(getIntent().getData().toString())];
        image.setImageResource(f.getImageID());
        name.setText(f.getName());
        description.setText(String.valueOf(f.getDescription()));


    }

}
