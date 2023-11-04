package com.azhar.hitungpengeluaran.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.azhar.hitungpengeluaran.R;
import com.google.android.material.tabs.TabLayout;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    int[] tabIcons = {R.drawable.ic_pengeluaran, R.drawable.ic_pemasukan};
    String log = "keterangan activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(log,"onCreate");
        setIdLayout();
        setInitLayout();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(log,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(log,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(log, "onStop");
    }

    private void setIdLayout() {
        tabLayout = findViewById(R.id.tabsLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setInitLayout() {
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

}