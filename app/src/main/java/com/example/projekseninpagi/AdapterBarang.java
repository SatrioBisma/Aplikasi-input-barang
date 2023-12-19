package com.example.projekseninpagi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterBarang extends
        RecyclerView.Adapter<AdapterBarang.myViewHolder> {
    Context context;
    ArrayList<ModelBarang> barangArrayList;
    public AdapterBarang(Context context, ArrayList<ModelBarang>
            barangArrayList) {
        this.context = context;
        this.barangArrayList = barangArrayList;
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View
                view=inflater.inflate(R.layout.activity_format_tampilan_barang,parent,false);
        return new AdapterBarang.myViewHolder(view);
    }
    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.ckode.setText(barangArrayList.get(position).kode);
        holder.cnama.setText(barangArrayList.get(position).nama_brg);
        holder.csatuan.setText(barangArrayList.get(position).satuan);
        holder.charga.setText(barangArrayList.get(position).harga);
        //holder.ckode.setOnClickListener(new View.OnClickListener()
        //holder.akurela.setOnClickListener(new View.OnClickListener() {
    }
    @Override
    public int getItemCount() {
        return barangArrayList.size();
    }
    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView ckode,cnama,csatuan,charga;
        RelativeLayout akurela;
        public myViewHolder( View itemView) {
            super(itemView);
            ckode=itemView.findViewById(R.id.kodebrg);
            cnama=itemView.findViewById(R.id.namabrg);
            csatuan=itemView.findViewById(R.id.satuanbrg);
            charga=itemView.findViewById(R.id.hargabrg);
            akurela=itemView.findViewById(R.id.rela01);
        }
    }
}
