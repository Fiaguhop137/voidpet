package io.sentry.android.core.internal.util;

import io.sentry.protocol.C3761e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static C3761e.b a(int i10) {
        if (i10 == 1) {
            return C3761e.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return C3761e.b.LANDSCAPE;
    }
}
