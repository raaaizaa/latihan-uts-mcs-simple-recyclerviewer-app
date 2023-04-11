package com.example.latihanuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class main extends AppCompatActivity {

    ImageButton account, back;
    private SQLiteDatabaseHandler db;
    Vector<album> albums;
    private RecyclerView recyclerView;
    private albumAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        db = new SQLiteDatabaseHandler(this);
        recyclerView = (RecyclerView) findViewById(R.id.albumsRV);
    }

    public void initialize(){
        back = findViewById(R.id.backButton);
        account = findViewById(R.id.accountButton);
        setNavbar();
    }

    public void setNavbar(){
        back.setOnClickListener(e -> {
            openLoginPage();
        });

        account.setOnClickListener(e -> {
            Toast.makeText(this, "Sorry, this service currently not available!", Toast.LENGTH_SHORT).show();
        });
    }

    public void openLoginPage(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}