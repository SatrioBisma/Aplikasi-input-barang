package com.example.projekseninpagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class baca_sqlite extends AppCompatActivity {
    Button btninput;
    RecyclerView recyclerView_barang;
    ArrayList<ModelBarang> barangArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca_sqlite);
        recyclerView_barang = findViewById(R.id.recyclerview_brg);
        btninput = findViewById(R.id.buttonentry);
        DatabaseHelper dbh = new DatabaseHelper(this);
        Cursor cursor = dbh.baca_data();
        cursor.moveToPrevious();
        while (cursor.moveToNext()) {
            barangArrayList.add(new ModelBarang(cursor.getString(0),
                    cursor.getString(1),
                    cursor.getString(2), cursor.getString(3)));
        }
        AdapterBarang adapterBarang = new AdapterBarang(this, barangArrayList);
        recyclerView_barang.setAdapter(adapterBarang);
        recyclerView_barang.setLayoutManager(new LinearLayoutManager(this));
        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new
                        Intent(baca_sqlite.this, entry_data_barang.class));
                startActivity(intent);
            }
        });
    }
}