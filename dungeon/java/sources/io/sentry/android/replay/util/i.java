package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f45581a;

    public i(Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f45581a = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Looper looper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        }
        this(looper);
    }

    public final Handler a() {
        return this.f45581a;
    }

    public final boolean b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return this.f45581a.post(runnable);
    }

    public final boolean c(Runnable runnable, long j10) {
        Handler handler = this.f45581a;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, j10);
    }

    public final void d(Runnable runnable) {
        Handler handler = this.f45581a;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }
}
