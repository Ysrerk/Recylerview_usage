package com.example.myapplication1_recy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ///recylerview de layout manager kullanmak gerekiyor o nedenle tanimlamasi yapildi
    RecyclerView.LayoutManager layoutManager;
    List<mesajModel> list=new ArrayList<>();
    RecyclerView recyclerView;
    adapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listedoldur();
    }
    private void tanimla(){
        recyclerView=findViewById(R.id.recy);

        ///recylerview de layout manager kullanmak gerekiyor o nedenle tanimlamasi yapildi
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
    private void listedoldur(){
        mesajModel ms1=new mesajModel("mete","merhaba mete naber",R.drawable.password);
        mesajModel ms2=new mesajModel("mert","merhaba mert naber",R.drawable.group);
        mesajModel ms3=new mesajModel("elif","merhaba mete naber",R.drawable.skype);

        list.add(ms1);
        list.add(ms2);
        list.add(ms3);
        adp=new adapter(list,this);
        recyclerView.setAdapter(adp);
    }


}