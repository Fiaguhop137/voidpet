package com.applovin.impl;

import android.os.Build;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static String a() {
        String name;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.VERSION.RELEASE);
            sb2.append(" (");
            try {
                for (Field field : Build.VERSION_CODES.class.getFields()) {
                    if (field.getInt(null) == Build.VERSION.SDK_INT) {
                        name = field.getName();
                        sb2.append(name);
                        sb2.append(" - API ");
                        sb2.append(Build.VERSION.SDK_INT);
                        sb2.append(")");
                        return sb2.toString();
                    }
                }
            } catch (Throwable th) {
                p1.c("AndroidUtils", "Unable to get Android SDK codename", th);
            }
            name = "";
            sb2.append(name);
            sb2.append(" - API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(")");
            return sb2.toString();
        } catch (Throwable th2) {
            p1.c("AndroidUtils", "Unable to get Android OS info", th2);
            return "";
        }
    }
}
