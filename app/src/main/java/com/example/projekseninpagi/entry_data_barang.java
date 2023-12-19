package com.example.projekseninpagi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class entry_data_barang extends AppCompatActivity implements View.OnClickListener {
    EditText ekode, enama, esatuan, eharga;
    Button btnsimpan, btnview;
    DatabaseHelper dbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_data_barang);

        dbh = new DatabaseHelper(this);

        ekode = findViewById(R.id.editkode);
        enama = findViewById(R.id.editnama);
        esatuan = findViewById(R.id.editsatuan);
        eharga = findViewById(R.id.editharga);

        btnsimpan = findViewById(R.id.tombolsave);
        btnview = findViewById(R.id.tombolview);
        btnsimpan.setOnClickListener(this);
        btnview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tombolsave) {
            String kode = ekode.getText().toString();
            String nama = enama.getText().toString();
            String satuan = esatuan.getText().toString();
            String harga = eharga.getText().toString();
            dbh.entri_data(kode, nama, satuan, harga);
            ekode.setText("");
            enama.setText("");
            esatuan.setText("");
            eharga.setText("");
        }
        else{
            Intent intent=new
                    Intent(entry_data_barang.this, baca_sqlite.class);
            startActivity(intent);
        }
    }
}
