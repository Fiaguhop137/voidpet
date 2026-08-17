package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2421x implements InterfaceC2412u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C2421x f32468c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f32470b;

    private C2421x() {
        this.f32469a = null;
        this.f32470b = null;
    }

    private C2421x(Context context) {
        this.f32469a = context;
        C2418w c2418w = new C2418w(this, null);
        this.f32470b = c2418w;
        context.getContentResolver().registerContentObserver(AbstractC2386l.f32410a, true, c2418w);
    }

    static C2421x b(Context context) {
        C2421x c2421x;
        synchronized (C2421x.class) {
            try {
                if (f32468c == null) {
                    f32468c = Z0.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2421x(context) : new C2421x();
                }
                c2421x = f32468c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2421x;
    }

    static synchronized void e() {
        Context context;
        try {
            C2421x c2421x = f32468c;
            if (c2421x != null && (context = c2421x.f32469a) != null && c2421x.f32470b != null) {
                context.getContentResolver().unregisterContentObserver(f32468c.f32470b);
            }
            f32468c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2412u
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(String str) {
        Context context = this.f32469a;
        if (context != null && !AbstractC2389m.a(context)) {
            try {
                return (String) AbstractC2406s.a(new C2415v(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return AbstractC2386l.a(this.f32469a.getContentResolver(), str, null);
    }
}
