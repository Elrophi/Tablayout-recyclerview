package com.example.root.lta;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewpageAdapter viewpageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpage);
        viewpageAdapter = new ViewpageAdapter(getSupportFragmentManager());


        viewpageAdapter.Addfragment(new Fragmentfood(), "");
        viewpageAdapter.Addfragment(new Fragmentdrinks(), "");
        viewPager.setAdapter(viewpageAdapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_room_service);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_drink);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
