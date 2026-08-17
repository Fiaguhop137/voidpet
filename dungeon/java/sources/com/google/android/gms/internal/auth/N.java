package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N implements InterfaceC2412u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f32253a = new C4101a();

    static N b(Context context, String str, Runnable runnable) {
        if (AbstractC2389m.b()) {
            throw null;
        }
        synchronized (N.class) {
            android.support.v4.media.session.b.a(f32253a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    static synchronized void c() {
        Map map = f32253a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        map.clear();
    }
}
