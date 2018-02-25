package habin.sygo;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutmain);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_viewmain);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutmain);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
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


            case (R.id.nav_setting):
                Intent intent_06 = new Intent(getApplicationContext(),set.class);
                startActivity(intent_06);
                break;


            case (R.id.nav_info):
                Intent intent_09= new Intent (Intent.ACTION_VIEW,
                        Uri.parse("http://www.sy.caehs.kr/main.do"));
                startActivity(intent_09);
                break;



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutmain);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick_001(View v) {
        Intent intent_10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/sub/info.do?m=0101&s=sy"));
        startActivity(intent_10);
    }

    public void onClick_002(View v) {
        Intent intent_11 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/schdList.do?m=0203&s=sy"));
        startActivity(intent_11);
    }

    public void onClick_003(View v) {
        Intent intent_12 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/boardCnts/list.do?boardID=1303&m=0201&s=sy"));
        startActivity(intent_12);
    }

    public void onClick_004(View v) {
        Intent intent_13 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/place/%EC%B2%9C%EC%95%88%EC%8C%8D%EC%9A%A9%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90/@36.7880807,127.1115115,17z/data=!3m1!4b1!4m5!3m4!1s0x357ad8174639fd87:0x588c0af013ea1f55!8m2!3d36.7880764!4d127.1137002"));
        startActivity(intent_13);
    }
    public void onClick_005(View v) {
        Intent intent_14 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/boardCnts/list.do?boardID=1333&m=0506&s=sy"));
        startActivity(intent_14);
    }
    public void onClick_006(View v) {
        Intent intent_15 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/boardCnts/list.do?boardID=1312&m=0401&s=sy"));
        startActivity(intent_15);
    }
    public void onClick_007(View v) {
        Intent intent_16 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sy.caehs.kr/sub/info.do?m=080101&s=sy"));
        startActivity(intent_16);
    }
    public void onClick_008(View v) {
        Intent intent_17 = new Intent(getApplicationContext(), image.class);
        startActivity(intent_17);
    }
    public void onClick_009(View v) {
       Toast.makeText(getApplicationContext(), "개발중입니다.", Toast.LENGTH_SHORT).show();
    }
}
