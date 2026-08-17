package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f28290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f28291b;

    public p2(p pVar) {
        if (!((Boolean) a("com.applovin.sdk.preferences_migration_complete", Boolean.FALSE, Boolean.class, a(p.f28247J), true)).booleanValue()) {
            SharedPreferences sharedPreferences = p.f28247J.getSharedPreferences("com.applovin.sdk.preferences." + pVar.f28258a, 0);
            SharedPreferences sharedPreferencesA = a(p.f28247J);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                a(entry.getKey(), entry.getValue(), sharedPreferencesA, editorEdit);
            }
            a(editorEdit);
            a(sharedPreferences.edit().clear());
            a("com.applovin.sdk.preferences_migration_complete", Boolean.TRUE, a(p.f28247J), null);
        }
        f28290a = pVar;
    }

    public static SharedPreferences a(Context context) {
        if (f28291b == null) {
            f28291b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f28291b;
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object stringSet;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                stringSet = obj != null ? Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue())) : Boolean.valueOf(sharedPreferences.getBoolean(str, false));
            } else if (Float.class.equals(cls)) {
                stringSet = obj != null ? Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue())) : Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, obj.getClass().equals(Long.class) ? ((Long) obj).intValue() : ((Integer) obj).intValue()));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, obj.getClass().equals(Integer.class) ? ((Integer) obj).longValue() : ((Long) obj).longValue()));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                stringSet = obj != null ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue())))) : Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            if (stringSet == null) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            Object objCast = cls.cast(stringSet);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return objCast;
        } catch (Throwable th) {
            if (z10) {
                try {
                    p1.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        try {
            Handler handler = i3.f28069a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                editor.commit();
                return;
            }
            p pVar = f28290a;
            if (pVar == null || pVar.n() == null) {
                editor.apply();
                return;
            }
            p pVar2 = f28290a;
            Objects.requireNonNull(editor);
            f28290a.n().a(new g3(pVar2, true, "commitSharedPreferencesChanges", new p184k4.i0(editor)), 0L);
        } catch (Throwable th) {
            p1.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    public static void a(o2 o2Var, Object obj) {
        a(o2Var.f28243a, obj, a(p.f28247J), null);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = editor != null;
        if (!z10) {
            editor = sharedPreferences.edit();
        }
        if (obj == null) {
            editor.remove(str);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            if (!(obj instanceof Set)) {
                p1.c("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj, null);
                return;
            }
            editor.putStringSet(str, (Set) obj);
        }
        if (z10) {
            return;
        }
        a(editor);
    }
}
