package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2602t3;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f35376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T8.G f35377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2602t3 f35378d;

    C2930c6(String str, Map map, T8.G g10, C2602t3 c2602t3) {
        this.f35375a = str;
        this.f35376b = map;
        this.f35377c = g10;
        this.f35378d = c2602t3;
    }

    public final String a() {
        return this.f35375a;
    }

    public final Map b() {
        Map map = this.f35376b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final T8.G c() {
        return this.f35377c;
    }

    public final C2602t3 d() {
        return this.f35378d;
    }
}
