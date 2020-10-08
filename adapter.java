package com.example.myapplication1_recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//1-ilk olarak    class olusturuluyor ve RecyclerView.Adapter den  extend ediliyor .
// adapter.tanimla  deki adapter class ismi digeride iceride olsuturulacak class ismi
//metodlari implemente ediliyor onCreateViewHolder,onBindViewHolder bu metoldar  geliyor.
public class adapter extends RecyclerView.Adapter<adapter.tanimla> {
    //5-List ve context tanimlari yapilip constructor olusturuluyor
    List<mesajModel>list;
    Context context;

    public adapter(List<mesajModel> list, Context context) {
        this.list = list;
        this.context = context;
    }
    //3 birada View den view olusturuluyor  ve view  tanimlaya parametre olarak gonderiliyor
    @NonNull
    @Override
    public tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        return new tanimla(view);
    }
    //4  holder uzerinden  mesaj modeldeki elamanlara set ediliyor listedeki degerlere gore
    @Override
    public void onBindViewHolder(@NonNull tanimla holder, final int position) {
    holder.mesaj.setText(list.get(position).getMesaj());
    holder.isim.setText(list.get(position).getIsim());
    holder.img.setImageResource(list.get(position).getResimid());
    // resime tiklaninca  toast mesaj  vermesi icin tanimlama yapiliyor.
    holder.img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context,list.get(position).getIsim()+"resmine tikladiniz",Toast.LENGTH_LONG).show();
        }
    });
    }
// 6 list. size donduruluyor
    @Override
    public int getItemCount() {
        return list.size();
    }
//2 olusturulan tanimla class da  RecyclerView.ViewHolder dan  extend edilmesi gerekiyor ve super metodu implemente edilmeli.
// sonra mesaj modeldeki  elemanlar tanimlanip  tanimlari yapiliyor
    public class tanimla extends RecyclerView.ViewHolder {
        ImageView img;
        TextView isim;
        TextView mesaj;
        public tanimla(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.mesajresim);
            isim=itemView.findViewById(R.id.isim);
            mesaj=itemView.findViewById(R.id.mesaj);
        }
    }
}
