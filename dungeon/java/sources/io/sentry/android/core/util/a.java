package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f45171a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0521a f45172b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0521a {
        Object a(Context context);
    }

    public a(InterfaceC0521a interfaceC0521a) {
        this.f45172b = interfaceC0521a;
    }

    public Object a(Context context) {
        if (this.f45171a == null) {
            synchronized (this) {
                try {
                    if (this.f45171a == null) {
                        this.f45171a = this.f45172b.a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f45171a;
    }
}
