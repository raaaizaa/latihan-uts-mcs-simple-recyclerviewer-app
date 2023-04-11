package com.example.latihanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class clickedCard extends AppCompatActivity {

    private TextView title, detail;
    private ImageView cover;
    private ImageButton back, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_card);

        initialize();
    }

    public void initialize(){
        back = findViewById(R.id.backButton);
        account = findViewById(R.id.accountButton);
        setNavbar();

        cover = findViewById(R.id.albumCoverDetail);
        title = findViewById(R.id.albumTitleDetail);
        detail = findViewById(R.id.albumDetail);
        setDetail();
    }

    public void setDetail(){
        Intent intent = getIntent();

        int defaultImage = intent.getIntExtra("DefaultImage", 0);
        String defaultTitle = intent.getStringExtra("DefaultTitle");
        String defaultDetail = intent.getStringExtra("DefaultDetail");

        cover.setImageResource(defaultImage);
        title.setText(defaultTitle);
        detail.setText(defaultDetail);
    }

    public void setNavbar(){
        back.setOnClickListener(e -> {
            openHomePage();
        });

        account.setOnClickListener(e -> {
            Toast.makeText(this, "Sorry, this service currently not available!", Toast.LENGTH_SHORT).show();
        });

    }

    public void openHomePage(){
        Intent intent = new Intent(this, main.class);
        startActivity(intent);
    }
}