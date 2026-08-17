package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3678y implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45209a;

    public C3678y() {
        this("Sentry");
    }

    public C3678y(String str) {
        this.f45209a = str;
    }

    private int e(EnumC3721i3 enumC3721i3) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC3721i3 enumC3721i3, Throwable th, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            b(enumC3721i3, str, th);
        } else {
            b(enumC3721i3, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC3721i3 enumC3721i3, String str, Throwable th) {
        Log.wtf(this.f45209a, str, th);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC3721i3 enumC3721i3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC3721i3), this.f45209a, str);
        } else {
            Log.println(e(enumC3721i3), this.f45209a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC3721i3 enumC3721i3) {
        return true;
    }
}
