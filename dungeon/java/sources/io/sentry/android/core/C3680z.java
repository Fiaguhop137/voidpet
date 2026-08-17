package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3680z implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45213a;

    /* JADX INFO: renamed from: io.sentry.android.core.z$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45214a;

        static {
            int[] iArr = new int[EnumC3721i3.values().length];
            f45214a = iArr;
            try {
                iArr[EnumC3721i3.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45214a[EnumC3721i3.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45214a[EnumC3721i3.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45214a[EnumC3721i3.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45214a[EnumC3721i3.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C3680z() {
        this("Sentry");
    }

    public C3680z(String str) {
        this.f45213a = str;
    }

    private int e(EnumC3721i3 enumC3721i3) {
        int i10 = a.f45214a[enumC3721i3.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
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
        int i10 = a.f45214a[enumC3721i3.ordinal()];
        if (i10 == 1) {
            Log.i(this.f45213a, str, th);
            return;
        }
        if (i10 == 2) {
            Log.w(this.f45213a, str, th);
            return;
        }
        if (i10 == 3) {
            Log.e(this.f45213a, str, th);
        } else if (i10 != 4) {
            Log.d(this.f45213a, str, th);
        } else {
            Log.wtf(this.f45213a, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC3721i3 enumC3721i3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC3721i3), this.f45213a, str);
        } else {
            Log.println(e(enumC3721i3), this.f45213a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC3721i3 enumC3721i3) {
        return true;
    }
}
