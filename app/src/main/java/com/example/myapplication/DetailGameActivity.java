package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailGameActivity extends AppCompatActivity {

    TextView txtName, txtDesc;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game);

        txtName = findViewById(R.id.txt_name);
        picture = findViewById(R.id.picture);
        txtDesc = findViewById(R.id.txt_desc);

        Intent intent = getIntent();
        String name = intent.getStringExtra("judul");
        int pictures = intent.getIntExtra("gambar", 0);
        String desc = intent.getStringExtra("desc");

        txtName.setText(name);
        picture.setImageResource(pictures);
        txtDesc.setText(desc);
    }








}
