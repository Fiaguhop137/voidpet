package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public final class T3 implements W3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f32728i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f32729j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f32730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f32731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f32732c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Map f32736g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentObserver f32733d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f32734e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f32735f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f32737h = new ArrayList();

    private T3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        B9.n.j(contentResolver);
        B9.n.j(uri);
        this.f32730a = contentResolver;
        this.f32731b = uri;
        this.f32732c = runnable;
    }

    public static T3 c(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        T3 t10 = (T3) f32728i.computeIfAbsent(uri, new S3(contentResolver, uri, runnable));
        try {
            if (!t10.f32734e) {
                return t10;
            }
            synchronized (t10) {
                try {
                    if (t10.f32734e) {
                        Q3 q10 = new Q3(t10, null);
                        t10.f32730a.registerContentObserver(t10.f32731b, false, q10);
                        t10.f32733d = q10;
                        t10.f32734e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t10;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void f() {
        Iterator it = f32728i.values().iterator();
        while (it.hasNext()) {
            T3 t10 = (T3) it.next();
            synchronized (t10) {
                try {
                    if (t10.f32734e) {
                        t10.f32734e = false;
                    } else {
                        ContentObserver contentObserver = t10.f32733d;
                        if (contentObserver != null) {
                            t10.f32730a.unregisterContentObserver(contentObserver);
                            t10.f32733d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ T3 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new T3(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f32736g;
        if (map2 == null) {
            synchronized (this.f32735f) {
                map2 = this.f32736g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) W3.a(new R3(this));
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                        map = Collections.EMPTY_MAP;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    this.f32736g = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f32735f) {
            this.f32736g = null;
            this.f32732c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f32737h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f32730a;
        Uri uri = this.f32731b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f32729j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c4101a = count <= 256 ? new C4101a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c4101a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c4101a;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
