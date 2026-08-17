package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2401q implements InterfaceC2412u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f32434h = new C4101a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f32435i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f32436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f32437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f32438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f32439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f32440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f32441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f32442g;

    private C2401q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2398p c2398p = new C2398p(this, null);
        this.f32439d = c2398p;
        this.f32440e = new Object();
        this.f32442g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f32436a = contentResolver;
        this.f32437b = uri;
        this.f32438c = runnable;
        contentResolver.registerContentObserver(uri, false, c2398p);
    }

    public static C2401q b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2401q c2401q;
        synchronized (C2401q.class) {
            Map map = f32434h;
            c2401q = (C2401q) map.get(uri);
            if (c2401q == null) {
                try {
                    C2401q c2401q2 = new C2401q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c2401q2);
                    } catch (SecurityException unused) {
                    }
                    c2401q = c2401q2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c2401q;
    }

    static synchronized void d() {
        try {
            for (C2401q c2401q : f32434h.values()) {
                c2401q.f32436a.unregisterContentObserver(c2401q.f32439d);
            }
            f32434h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.google.android.gms.internal.auth.InterfaceC2412u
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        ?? r10;
        Map map2 = this.f32441f;
        Map map3 = map2;
        if (map2 == null) {
            synchronized (this.f32440e) {
                Map map4 = this.f32441f;
                if (map4 != null) {
                    r10 = map4;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) AbstractC2406s.a(new C2395o(this));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f32441f = map;
                        threadPolicyAllowThreadDiskReads = map;
                        r10 = threadPolicyAllowThreadDiskReads;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
            map3 = r10;
        }
        if (map3 == 0) {
            map3 = Collections.EMPTY_MAP;
        }
        return (String) map3.get(str);
    }

    final /* synthetic */ Map c() {
        Cursor cursorQuery = this.f32436a.query(this.f32437b, f32435i, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map c4101a = count <= 256 ? new C4101a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c4101a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c4101a;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.f32440e) {
            this.f32441f = null;
            M.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f32442g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
