package habin.sygo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class info extends AppCompatActivity {
    TabHost tabHost;

    FrameLayout frameLayout;

    Button btn1, btn2, btn3;

    EditText editText1, editText2, editText3;

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setTitle("학교소개");

        tabHost = (TabHost) findViewById(R.id.tabhost1);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("1").setContent(R.id.tab1).setIndicator("학교장 인사말");

        TabHost.TabSpec tab2 = tabHost.newTabSpec("2").setContent(R.id.tab2).setIndicator("교목,교화");

        TabHost.TabSpec tab3 = tabHost.newTabSpec("3").setContent(R.id.tab3).setIndicator("교가");


        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        init();






    }


    void init(){

    }
}
