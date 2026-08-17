package io.sentry.util;

import java.util.Set;

/* JADX INFO: renamed from: io.sentry.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3806h {
    public static Throwable a(Throwable th) {
        w.c(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean b(Set set, Throwable th) {
        return set.contains(th.getClass());
    }
}
