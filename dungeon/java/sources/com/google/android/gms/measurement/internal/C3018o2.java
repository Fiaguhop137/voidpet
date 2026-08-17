package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3018o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3032q2 f35717d;

    C3018o2(C3032q2 c3032q2, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(c3032q2);
        this.f35717d = c3032q2;
        this.f35714a = i10;
        this.f35715b = z10;
        this.f35716c = z11;
    }

    public final void a(String str) {
        this.f35717d.y(this.f35714a, this.f35715b, this.f35716c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f35717d.y(this.f35714a, this.f35715b, this.f35716c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f35717d.y(this.f35714a, this.f35715b, this.f35716c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f35717d.y(this.f35714a, this.f35715b, this.f35716c, str, obj, obj2, obj3);
    }
}
