package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f28388a = new HashMap(2);

    public static Point a(Context context) {
        Resources resources;
        Configuration configuration;
        int i10 = (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.orientation;
        PackageManager packageManager = context.getPackageManager();
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.type.foldable");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        if (!zHasSystemFeature && !zHasSystemFeature2) {
            HashMap map = f28388a;
            if (map.containsKey(Integer.valueOf(i10))) {
                return (Point) map.get(Integer.valueOf(i10));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f28388a.put(Integer.valueOf(i10), point);
        return point;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
