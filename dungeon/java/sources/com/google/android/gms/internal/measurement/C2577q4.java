package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2577q4 implements W3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f33095f = new C4101a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f33096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f33097b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f33099d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33098c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f33100e = new ArrayList();

    private C2577q4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f33096a = sharedPreferences;
    }

    static C2577q4 c(Context context, String str, Runnable runnable) {
        C2577q4 c2577q4;
        SharedPreferences sharedPreferencesA;
        if (O3.a() && !str.startsWith("direct_boot:") && !O3.c(context)) {
            return null;
        }
        synchronized (C2577q4.class) {
            Map map = f33095f;
            c2577q4 = (C2577q4) map.get(str);
            if (c2577q4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (O3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = AbstractC2519k0.a(context, str.substring(12), 0, AbstractC2483g0.f32912a);
                    } else {
                        sharedPreferencesA = AbstractC2519k0.a(context, str, 0, AbstractC2483g0.f32912a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c2577q4 = new C2577q4(sharedPreferencesA, runnable);
                    SharedPreferencesOnSharedPreferenceChangeListenerC2568p4 sharedPreferencesOnSharedPreferenceChangeListenerC2568p4 = new SharedPreferencesOnSharedPreferenceChangeListenerC2568p4(c2577q4);
                    c2577q4.f33097b = sharedPreferencesOnSharedPreferenceChangeListenerC2568p4;
                    c2577q4.f33096a.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2568p4);
                    map.put(str, c2577q4);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c2577q4;
    }

    static synchronized void d() {
        try {
            Map map = f33095f;
            for (C2577q4 c2577q4 : map.values()) {
                c2577q4.f33096a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) B9.n.j(c2577q4.f33097b));
            }
            map.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final Object b(String str) {
        Map<String, ?> map = this.f33099d;
        if (map == null) {
            synchronized (this.f33098c) {
                try {
                    map = this.f33099d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f33096a.getAll();
                            this.f33099d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f33098c) {
            this.f33099d = null;
            AbstractC2559o4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f33100e.iterator();
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
