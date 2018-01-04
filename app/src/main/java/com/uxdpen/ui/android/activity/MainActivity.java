package com.uxdpen.ui.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uxdpen.ui.android.R;
import com.uxdpen.ui.android.activity.base.SwipeBackActivity;
import com.uxdpen.ui.android.activity.carrier.LoginActivity;
import com.uxdpen.ui.android.activity.examples.FontsActivity;
import com.uxdpen.ui.android.activity.examples.KolinActivity;
import com.uxdpen.ui.android.activity.examples.NavigationActivity;
import com.uxdpen.ui.android.activity.examples.TitlebarsActivity;


public class MainActivity extends SwipeBackActivity {

    private Button navigationBtn;
    private Button toolbarBtn;
    private Button kolinBtn;
    private Button fonticonBtn;
    private Button loginBtn;

    @Override
    protected boolean isSwipeBackEnable(){
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        navigationBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                intent.putExtra("name","flywind");
                intent.putExtra("age",18);
                startActivity(intent);
            }
        });
        toolbarBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TitlebarsActivity.class);
                startActivity(intent);
            }
        });
        kolinBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KolinActivity.class));
            }
        });
        fonticonBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FontsActivity.class));
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

    private void initViews(){
        navigationBtn = (Button) findViewById(R.id.navigation_btn);
        toolbarBtn = (Button) findViewById(R.id.toolbar_btn);
        kolinBtn = (Button) findViewById(R.id.kolin_btn);
        fonticonBtn = (Button) findViewById(R.id.fonticon_btn);
        loginBtn = (Button) findViewById(R.id.login_btn);
    }

}
