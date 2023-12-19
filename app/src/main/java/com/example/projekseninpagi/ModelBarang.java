package com.example.projekseninpagi;

public class ModelBarang {
    String kode;
    String nama_brg;
    String satuan;
    String harga;
    public ModelBarang(String kode, String nama_brg, String satuan, String
            harga) {
        this.kode = kode;
        this.nama_brg = nama_brg;
        this.satuan = satuan;
        this.harga = harga;
    }
    public String getKode() {

        return kode;
    }
    public void setKode(String kode) {

        this.kode = kode;
    }
    public String getNama_brg() {

        return nama_brg;
    }
    public void setNama_brg(String nama_brg) {

        this.nama_brg = nama_brg;
    }
    public String getSatuan() {

        return satuan;
    }
    public void setSatuan(String satuan) {

        this.satuan = satuan;
    }
    public String getHarga() {

        return harga;
    }
    public void setHarga(String harga) {

        this.harga = harga;
    }
}
