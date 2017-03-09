package com.example.vamsirao.statblock;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.LinearLayout;

/**
 * Created by Vamsi Rao on 3/9/2017.
 */

public class Statblock extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

        WindowManager manager=((WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE));

        WindowManager.LayoutParams localLayoutParams= new WindowManager.LayoutParams();
        localLayoutParams.type= WindowManager.LayoutParams.TYPE_SYSTEM_ERROR;
        localLayoutParams.gravity= Gravity.TOP;
        localLayoutParams.flags= WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE| WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL|WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN;

        localLayoutParams.width=WindowManager.LayoutParams.MATCH_PARENT;
        localLayoutParams.height=(int)(50*getResources().getDisplayMetrics().scaledDensity);
        localLayoutParams.format= PixelFormat.TRANSPARENT;

        LinearLayout view= new LinearLayout(this);
        manager.addView(view,localLayoutParams);



    }
}
