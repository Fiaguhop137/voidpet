package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class R4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile R4 f32713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final R4 f32714c = new R4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32715a = Collections.EMPTY_MAP;

    R4(boolean z10) {
    }

    public static R4 a() {
        R4 r10 = f32713b;
        if (r10 != null) {
            return r10;
        }
        synchronized (R4.class) {
            try {
                R4 r11 = f32713b;
                if (r11 != null) {
                    return r11;
                }
                int i10 = M5.f32575d;
                R4 r4A = Y4.a(R4.class);
                f32713b = r4A;
                return r4A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2452c5 b(E5 e10, int i10) {
        android.support.v4.media.session.b.a(this.f32715a.get(new Q4(e10, i10)));
        return null;
    }
}
