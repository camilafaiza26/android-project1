package com.example.camilafaiza;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private Toolbar toolbar_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        this.setTitle("Info Detail");
        toolbar_detail = findViewById(R.id.MyToolBar);
        setSupportActionBar(toolbar_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        wisata wisata = intent.getParcelableExtra("pilih");
        assert wisata != null;
        int foto = wisata.getFoto();
        String nama = wisata.getNama();
        String desc = wisata.getDesc();
        String alamat = wisata.getAlamat();

        ImageView imageView = findViewById(R.id.detail_foto);
        imageView.setImageResource(foto);
        TextView textView = findViewById(R.id.detail_nama2);
        textView.setText(nama);
        TextView textView1 = findViewById(R.id.detail_desc1);
        textView1.setText(desc);
        TextView textView2 = findViewById(R.id.detail_alamat1);
        textView2.setText(alamat);
    }


}
