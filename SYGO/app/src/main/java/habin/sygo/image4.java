package habin.sygo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class image4 extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image4);
        gyroscopeObserver = new GyroscopeObserver();
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView) findViewById(R.id.front4);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }
}

