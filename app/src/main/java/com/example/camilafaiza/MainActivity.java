package com.example.camilafaiza;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Toast;



import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements adapterlist.OnClickListener {
    private Toolbar toolbar;
    private RecyclerView RVWISATA;
    private ArrayList<wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Home");
        toolbar = findViewById(R.id.MyToolBar);
        setSupportActionBar(toolbar);

        RVWISATA = findViewById(R.id.rwisata);
        RVWISATA.setHasFixedSize(true);

        list.addAll(wisatalist.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        RVWISATA.setLayoutManager(new LinearLayoutManager(this));
        adapterlist adapterlist2 = new adapterlist(list, this);
        RVWISATA.setAdapter(adapterlist2);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            Intent AboutIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(AboutIntent);
        }
        return true;
    }
    @Override
    public void onClickListener(int position) {
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        intent.putExtra("pilih", list.get(position));
        startActivity(intent);
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }
}