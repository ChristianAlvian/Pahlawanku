package com.chris.pahlawanku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptercard extends RecyclerView.Adapter<adaptercard.ClassViewHolder>{
    private ArrayList<modelpahlawan> datapahlawan;

    public adaptercard(ArrayList<modelpahlawan> datapahlawan) {
        this.datapahlawan = datapahlawan;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ClassViewHolder(varview);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        modelpahlawan pahlawan = datapahlawan.get(position);
        holder.tvNama.setText((pahlawan.getNama());
        holder.tvTentang.setText(pahlawan.getTentang());


    }

    @Override
    public int getItemCount() {
        return datapahlawan.size();
    }

    public class ClassViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang;
        ImageView ivFoto;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
