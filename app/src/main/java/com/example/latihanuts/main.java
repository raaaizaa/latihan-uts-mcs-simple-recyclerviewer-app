package com.example.latihanuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Vector;

public class main extends AppCompatActivity {

    ImageButton account, back;
    Vector<album> albums;
    static int[] imageList= {
        R.drawable.howdidwegetsodark, R.drawable.suckitandsee, R.drawable.kida, R.drawable.isthisit, R.drawable.songsforthedeaf, R.drawable.peripheralvision
    };
    RecyclerView albumsRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

    }

    public void initialize(){
        back = findViewById(R.id.backButton);
        account = findViewById(R.id.accountButton);
        setNavbar();

        addItemtoRV();
    }

    public void setNavbar(){
        back.setOnClickListener(e -> {
            openLoginPage();
        });

        account.setOnClickListener(e -> {
            Toast.makeText(this, "Sorry, this service currently not available!", Toast.LENGTH_SHORT).show();
        });

    }

    public void addItemtoRV(){
        albums = new Vector<>();
        albums.add(new album("How Did We Get So Dark?", "Royal Blood", "2017", imageList[0]));
        albums.add(new album("Suck It And See", "Arctic Monkeys", "2011", imageList[1]));
        albums.add(new album("Kid A", "Radiohead", "2000", imageList[2]));
        albums.add(new album("Is This It", "The Strokes", "2001", imageList[3]));
        albums.add(new album("Songs for The Deaf", "Queens of The Stone Age", "2002", imageList[4]));
        albums.add(new album("Peripheral Vision", "Turnover", "2015", imageList[5]));

        albumsRV = findViewById(R.id.albumsRV);

        albumAdapter adapter = new albumAdapter(albums, this);
        albumsRV.setAdapter(adapter);

        albumsRV.setLayoutManager(new LinearLayoutManager(this));
    }


    public void openLoginPage(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}