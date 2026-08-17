package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2386l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap f32415f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f32420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static boolean f32421l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f32410a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f32411b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f32412c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f32413d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f32414e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f32416g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap f32417h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f32418i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap f32419j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f32422m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC2386l.class) {
            try {
                String str3 = null;
                if (f32415f == null) {
                    f32414e.set(false);
                    f32415f = new HashMap(16, 1.0f);
                    f32420k = new Object();
                    f32421l = false;
                    contentResolver.registerContentObserver(f32410a, true, new C2383k(null));
                } else if (f32414e.getAndSet(false)) {
                    f32415f.clear();
                    f32416g.clear();
                    f32417h.clear();
                    f32418i.clear();
                    f32419j.clear();
                    f32420k = new Object();
                    f32421l = false;
                }
                Object obj = f32420k;
                if (f32415f.containsKey(str)) {
                    String str4 = (String) f32415f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f32422m.length;
                Cursor cursorQuery = contentResolver.query(f32410a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC2386l.class) {
            try {
                if (obj == f32420k) {
                    f32415f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
