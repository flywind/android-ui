package com.uxdpen.ui.android.activity.examples;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;

import com.uxdpen.ui.android.R;
import com.uxdpen.ui.android.activity.base.SwipeBackActivity;
import com.wuhenzhizao.titlebar.widget.CommonTitleBar;

public class QuickPreviewActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_preview);

        ((CommonTitleBar) findViewById(R.id.titlebar)).setListener(new CommonTitleBar.OnTitleBarListener(){

            @Override
            public void onClicked(View v, int action, String extra) {
                if(action == CommonTitleBar.ACTION_LEFT_TEXT){
                    onBackPressed();
                }
            }
        });
        ((CommonTitleBar) findViewById(R.id.titlebar_3)).showCenterProgress();
    }
}
