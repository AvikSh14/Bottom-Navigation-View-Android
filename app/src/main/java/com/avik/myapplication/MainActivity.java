package com.avik.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.itemMusic:
                                Toast.makeText(context, "Clicked music", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.itemGallery:
                                Toast.makeText(context, "Clicked gallery", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.itemShoppingCart:
                                Toast.makeText(context, "Clicked cart", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return true;
                    }
                }
        );
    }
}
