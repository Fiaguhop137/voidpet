package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class Z3 implements W3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Z3 f32847d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f32849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32850c;

    private Z3() {
        this.f32850c = false;
        this.f32848a = null;
        this.f32849b = null;
    }

    private Z3(Context context) {
        this.f32850c = false;
        this.f32848a = context;
        this.f32849b = new X3(this, null);
    }

    static Z3 c(Context context) {
        Z3 z10;
        synchronized (Z3.class) {
            try {
                if (f32847d == null) {
                    f32847d = Z0.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new Z3(context) : new Z3();
                }
                Z3 z11 = f32847d;
                if (z11 != null && z11.f32849b != null && !z11.f32850c) {
                    try {
                        context.getContentResolver().registerContentObserver(I3.f32535a, true, f32847d.f32849b);
                        ((Z3) B9.n.j(f32847d)).f32850c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                z10 = (Z3) B9.n.j(f32847d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    static synchronized void e() {
        Context context;
        try {
            Z3 z10 = f32847d;
            if (z10 != null && (context = z10.f32848a) != null && z10.f32849b != null && z10.f32850c) {
                context.getContentResolver().unregisterContentObserver(f32847d.f32849b);
            }
            f32847d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String b(String str) {
        Context context = this.f32848a;
        if (context != null && !O3.b(context)) {
            try {
                return (String) W3.a(new Y3(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return H3.a(((Context) B9.n.j(this.f32848a)).getContentResolver(), str, null);
    }
}
