package com.uxdpen.ui.android.activity.examples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import android.widget.Toast;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;
import com.uxdpen.ui.android.R;
import com.uxdpen.ui.android.activity.base.SwipeBackActivity;

public class NavigationActivity extends SwipeBackActivity {

    private TextView mTextMessage;
    private TextView infoTextView;
    private BottomNavigationView bottomNavigationView;

    TextView bar_title;
    TextView right_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        initViews();
        createNavigation();
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        infoTextView.setText("Your name is " + name + " and age is " + age);
    }

    private void initViews(){
        mTextMessage = (TextView) findViewById(R.id.message);
        infoTextView = (TextView) findViewById(R.id.info);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
    }

    private void createNavigation(){
        int[] image = {
                R.drawable.progress_circular_ic,
                R.drawable.progress_circular_ic,
                R.drawable.progress_circular_ic,
                R.drawable.progress_circular_ic,
                R.drawable.progress_circular_ic
        };

        int[] color = {
                ContextCompat.getColor(this, R.color.colorWhite),
                ContextCompat.getColor(this, R.color.colorPrimary),
                ContextCompat.getColor(this, R.color.colorWhite),
                ContextCompat.getColor(this, R.color.colorWhite),
                ContextCompat.getColor(this, R.color.colorWhite)
        };

        if(bottomNavigationView != null){

            //文字是否一直显示:(false:显示选中的；true全部显示)
            //bottomNavigationView.isWithText(true);

            //在左边位置
            //bottomNavigationView.activateTabletMode();

            //切换背景色
            //bottomNavigationView.isColoredBackground(true);

            //当 bottomNavigationView.isColoredBackground(true);设置为false时icon和文字显示颜色能用
            //bottomNavigationView.setItemActiveColorWithoutColoredBackground(ContextCompat.getColor(this, R.color.colorPrimaryDark));

            //选中字体的大小
            //bottomNavigationView.setTextActiveSize(getResources().getDimension(R.dimen.nav_title));

            //未选中字体的大小
            //bottomNavigationView.setTextInactiveSize(getResources().getDimension(R.dimen.nav_title));

            //设置字体
            //bottomNavigationView.setFont(Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Noh_normal.ttf"));

            //去掉阴影
            //bottomNavigationView.disableShadow();

            //使用viewpager
            //bottomNavigationView.setUpWithViewPager(yourPager , colorResources , imageResources);
        }

        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem(getResources().getString(R.string.title_home), color[0], image[0]);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem(getResources().getString(R.string.title_trending), color[1], image[1]);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem(getResources().getString(R.string.title_subscriptions), color[2], image[2]);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem(getResources().getString(R.string.title_activity), color[3], image[3]);
        BottomNavigationItem bottomNavigationItem4 = new BottomNavigationItem(getResources().getString(R.string.title_library), color[4], image[4]);
        bottomNavigationView.addTab(bottomNavigationItem);
        bottomNavigationView.addTab(bottomNavigationItem1);
        bottomNavigationView.addTab(bottomNavigationItem2);
        bottomNavigationView.addTab(bottomNavigationItem3);
        bottomNavigationView.addTab(bottomNavigationItem4);

        bottomNavigationView.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                Toast.makeText(NavigationActivity.this, "Item " +index +" clicked", Toast.LENGTH_SHORT).show();
                switch (index){
                    case 0 : mTextMessage.setText(R.string.title_home); break;
                    case 1 : mTextMessage.setText(R.string.title_trending); break;
                    case 2 : mTextMessage.setText(R.string.title_subscriptions); break;
                    case 3 : mTextMessage.setText(R.string.title_activity); break;
                    case 4 : mTextMessage.setText(R.string.title_library); break;
                }
            }
        });

        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
