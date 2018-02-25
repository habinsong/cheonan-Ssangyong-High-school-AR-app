package habin.sygo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class image extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("360 이미지");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarimage);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutimage);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_viewimage);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

    }

    public static  final int NOTIFICATION_ID = 1;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutimage);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case (R.id.nav_home):
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;
            case (R.id.nav_meal):
                Intent intent_02 = new Intent (Intent.ACTION_VIEW,
                        Uri.parse("http://pf.kakao.com/_eSnwd"));
                startActivity(intent_02);
                break;
                //

            case (R.id.nav_setting):
                Intent intent_06 = new Intent(getApplicationContext(),set.class);
                startActivity(intent_06);
                break;


            case (R.id.nav_info):
                Intent intent_09= new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/main.do"));
                startActivity(intent_09);
                break;

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutimage);
        drawer.closeDrawer(GravityCompat.START);


        return true;
    }

    public void onClick_image1(View v) {
        Intent intent_10 = new Intent(getApplicationContext(), image1.class);
        startActivity(intent_10);
    }
    public void onClick_image2(View v) {
        Intent intent_10 = new Intent(getApplicationContext(), image2.class);
        startActivity(intent_10);
    }
    public void onClick_image3(View v) {
        Intent intent_10 = new Intent(getApplicationContext(), image3.class);
        startActivity(intent_10);
    }
    public void onClick_image4(View v) {
        Intent intent_10 = new Intent(getApplicationContext(), image4.class);
        startActivity(intent_10);
    }
    public void onClick_image5(View v) {
        Intent intent_i1 = new Intent(getApplicationContext(), image5.class);
        startActivity(intent_i1);
    }

}
