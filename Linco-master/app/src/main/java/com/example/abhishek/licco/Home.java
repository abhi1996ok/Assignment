package com.example.abhishek.licco;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(Home.this, drawerLayout, toolbar, R.string.navgiation_drawer_open,
                R.string.navgiation_drawer_close);
        toggle.syncState();
        if (savedInstanceState == null) {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new DashBoard());
            fragmentTransaction.commit();
            navigationView.setCheckedItem(R.id.Dashboard);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        switch (item.getItemId()) {
            case R.id.Dashboard:
                fragmentTransaction.replace(R.id.fragment_container, new DashBoard());
                fragmentTransaction.commit();
                break;

            case R.id.DailyReport:
                fragmentTransaction.replace(R.id.fragment_container, new DailyReport());
                fragmentTransaction.commit();
                break;

            case R.id.Equipment:
                fragmentTransaction.replace(R.id.fragment_container, new Equipment());
                fragmentTransaction.commit();
                break;

            case R.id.Team:
                fragmentTransaction.replace(R.id.fragment_container, new Team());
                fragmentTransaction.commit();
                break;

            case R.id.Additional:
                fragmentTransaction.replace(R.id.fragment_container, new Additional());
                fragmentTransaction.commit();
                break;

            case R.id.receipts:
                fragmentTransaction.replace(R.id.fragment_container, new Receipts());
                fragmentTransaction.commit();
                break;

            case R.id.procurement:
                fragmentTransaction.replace(R.id.fragment_container, new Promnt());
                fragmentTransaction.commit();
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}
