package com.example.student.express;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private AllProductFragment allProductFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton openFavouriteButton = (FloatingActionButton) findViewById(R.id.open_favourites);
        FloatingActionButton openStoreButton = (FloatingActionButton) findViewById(R.id.open_store);
        openFavouriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllProductFragment.setList(DataProvider.returnFavourites());
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
            }
        });
        openStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllProductFragment.setList(DataProvider.returnStores());
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), true));

            }
        });


        DataProvider.initData();
        AllProductFragment.setList(DataProvider.getList());
        // Collections.shuffle(AllProductFragment.getList());
        allProductFragment = new AllProductFragment();
        loadfragment(allProductFragment);
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                allProductFragment.allProductAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                allProductFragment.allProductAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case R.id.cars:
                AllProductFragment.setList(DataProvider.updatedList(Constant.CATEGORY_CARS));
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;

            case R.id.all:
                AllProductFragment.setList(DataProvider.getList());
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;

            case R.id.phones:
                AllProductFragment.setList(DataProvider.updatedList(Constant.CATEGORY_PHONES));
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;

            case R.id.computers:
                AllProductFragment.setList(DataProvider.updatedList(Constant.CATEGORY_COMPUTERS));
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;

            case R.id.watches:
                AllProductFragment.setList(DataProvider.updatedList(Constant.CATEGORY_WATCHES));
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;

            case R.id.shopping:
                AllProductFragment.setList(DataProvider.returnStores());
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), true));
                break;

            case R.id.favourite:
                AllProductFragment.setList(DataProvider.returnFavourites());
                allProductFragment.updateList(new AllProductAdapter(MainActivity.this, AllProductFragment.getList(), false));
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadfragment(final Fragment fragment) {

        getSupportFragmentManager().beginTransaction().add(R.id.container_for_fragment, fragment).commit();
    }
}
