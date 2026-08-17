package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 implements J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32654a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f32655b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f32656c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f32657d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f32658e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f32659f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f32660g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32661h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f32662i = new String[0];

    @Override // com.google.android.gms.internal.measurement.J3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f32655b == null) {
                    this.f32654a.set(false);
                    this.f32655b = new HashMap(16, 1.0f);
                    this.f32660g = new Object();
                    contentResolver.registerContentObserver(I3.f32535a, true, new L3(this, null));
                } else if (this.f32654a.getAndSet(false)) {
                    this.f32655b.clear();
                    this.f32656c.clear();
                    this.f32657d.clear();
                    this.f32658e.clear();
                    this.f32659f.clear();
                    this.f32660g = new Object();
                    this.f32661h = false;
                }
                Object obj = this.f32660g;
                if (this.f32655b.containsKey(str)) {
                    String str4 = (String) this.f32655b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = I3.f32535a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new M3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new M3("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f32660g) {
                                            this.f32655b.put(str, string);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th2) {
                                if (cursorQuery == null) {
                                    throw th2;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (RemoteException e10) {
                            throw new M3("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } catch (M3 unused) {
                    return null;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f32654a;
    }
}
