package com.applovin.impl;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f27987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f27988b;

    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f27987a)) {
            return f27987a;
        }
        try {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                p1.c("ProcessUtils", "No running app processes. Unable to determine process name", null);
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (iMyPid == runningAppProcessInfo.pid) {
                    String str = runningAppProcessInfo.processName;
                    f27987a = str;
                    return str;
                }
            }
            return null;
        } catch (Throwable th) {
            p1.c("ProcessUtils", "Unable to determine process name", th);
        }
    }

    public static boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            p1.c("ProcessUtils", "Exception thrown while getting memory state.", th);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static Boolean b(Context context) {
        h hVar;
        if (context == null) {
            return null;
        }
        Boolean bool = f27988b;
        if (bool != null) {
            return bool;
        }
        try {
            synchronized (h.f28051c) {
                try {
                    if (h.f28050b == null) {
                        h.f28050b = new h(context);
                    }
                    hVar = h.f28050b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str = hVar.f28052a;
            String strA = a(context);
            if (strA == null) {
                return null;
            }
            if (strA.equals(str)) {
                Boolean bool2 = Boolean.TRUE;
                f27988b = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(str) && strA.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f27988b = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f27988b = bool4;
            return bool4;
        } catch (Throwable th2) {
            p1.c("ProcessUtils", "Unable to determine if the current process is the main process", th2);
            return null;
        }
    }
}
