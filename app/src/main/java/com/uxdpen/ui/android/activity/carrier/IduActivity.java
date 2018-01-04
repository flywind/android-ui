package com.uxdpen.ui.android.activity.carrier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uxdpen.ui.android.R;
import com.wuhenzhizao.titlebar.utils.AppUtils;
import com.zhy.autolayout.AutoLayoutActivity;

public class IduActivity extends AutoLayoutActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idu);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        // 状态栏文字颜色修改为黑色
        AppUtils.StatusBarLightMode(getWindow());
        // 透明化状态栏背景
        AppUtils.transparencyBar(getWindow());
    }
}
