package com.example.projekseninpagi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
        public final static String NAMA_DATA_BASE="STOK_BRG";
        public final static String NAMA_TABLE="BARANG";
        public final static String fiel01="kode";
        public final static String fiel02="nama_brg";
        public final static String fiel03="satuan";
        public final static String fiel04="harga";
        public DatabaseHelper(Context context) {
            super(context, NAMA_DATA_BASE, null, 1);
            SQLiteDatabase db=this.getWritableDatabase();
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table "+NAMA_TABLE+"(kode text primary key," +
                    "nama_brg text," +
                    "satuan text," +
                    "harga text)");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS "+NAMA_TABLE);
            onCreate(db);
        }
        public void entri_data(String kode, String nama, String satuan, String
                harga) {
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues contentValues=new ContentValues();
            contentValues.put(fiel01,kode);
            contentValues.put(fiel02,nama);
            contentValues.put(fiel03,satuan);
            contentValues.put(fiel04,harga);
            db.insert(NAMA_TABLE,null,contentValues);
        }
        public Cursor baca_data() {
            SQLiteDatabase db=this.getReadableDatabase();
            Cursor cur=db.rawQuery("select * from "+NAMA_TABLE,null);
            return cur;
        }
    }


