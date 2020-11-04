package com.lenovo.souvik.wallpaper;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private List<Custom_Items> list;
    public CustomAdapter adapter;
    private Toolbar toolbar;
    private TextView textView;
    NetworkInfo info;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        dialog = new ProgressDialog(this);


        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {


            Toast.makeText(MainActivity.this, "Loading..", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();

        }

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        list = new ArrayList<>();


        list.add(new Custom_Items("https://images.pexels.com/photos/1535162/pexels-photo-1535162.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1156684/pexels-photo-1156684.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1034662/pexels-photo-1034662.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1236701/pexels-photo-1236701.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1433052/pexels-photo-1433052.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items( "https://images.pexels.com/photos/1820563/pexels-photo-1820563.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1823743/pexels-photo-1823743.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1775302/pexels-photo-1775302.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items( "https://images.pexels.com/photos/264109/pexels-photo-264109.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/814830/pexels-photo-814830.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/845405/pexels-photo-845405.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1707820/pexels-photo-1707820.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1837591/pexels-photo-1837591.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/597049/paris-france-eiffel-tower-597049.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769311/pexels-photo-1769311.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769312/pexels-photo-1769312.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769313/pexels-photo-1769313.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769314/pexels-photo-1769314.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769315/pexels-photo-1769315.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769316/pexels-photo-1769316.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769317/pexels-photo-1769317.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769318/pexels-photo-1769318.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769319/pexels-photo-1769319.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769326/pexels-photo-1769326.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769321/pexels-photo-1769321.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769325/pexels-photo-1769325.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769327/pexels-photo-1769327.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769324/pexels-photo-1769324.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769328/pexels-photo-1769328.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1769329/pexels-photo-1769329.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));


        getdata();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    private void getdata() {


        adapter = new CustomAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));

        }
        if (id == R.id.action_exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        if (id == R.id.action_search) {

            finish();
            startActivity(getIntent());
            if (info != null) {
                getdata();

            } else {


                Toast.makeText(this, "Internet Not Connected!", Toast.LENGTH_SHORT).show();
            }


        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.wallpaper) {

            getdata();


        }

        else if (id == R.id.Settings) {

            startActivity(new Intent(MainActivity.this, SettingsActivity.class));


        } else if (id == R.id.rate_us) {

        } else if (id == R.id.more_app) {




        }

//



        else if (id == R.id.share) {


            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plan");

            String shareBoday = "Your Boday Here";

            String shareSub =  getPackageName();
            myintent.putExtra(Intent.EXTRA_SUBJECT, shareBoday);
            myintent.putExtra(Intent.EXTRA_TEXT, shareSub);
            startActivity(Intent.createChooser(myintent, "share Using"));

        }





        else if (id == R.id.exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void MoreApp() {

    }




    public void rateme() {

    }


}