package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2639x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2631w5 f33184a;

    private C2639x5(EnumC2534l6 enumC2534l6, Object obj, EnumC2534l6 enumC2534l7, Object obj2) {
        this.f33184a = new C2631w5(enumC2534l6, "", enumC2534l7, "");
    }

    public static C2639x5 a(EnumC2534l6 enumC2534l6, Object obj, EnumC2534l6 enumC2534l7, Object obj2) {
        return new C2639x5(enumC2534l6, "", enumC2534l7, "");
    }

    static void b(N4 n10, C2631w5 c2631w5, Object obj, Object obj2) {
        W4.c(n10, c2631w5.f33167a, 1, obj);
        W4.c(n10, c2631w5.f33169c, 2, obj2);
    }

    static int c(C2631w5 c2631w5, Object obj, Object obj2) {
        return W4.d(c2631w5.f33167a, 1, obj) + W4.d(c2631w5.f33169c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C2631w5 c2631w5 = this.f33184a;
        int iE = N4.E(i10 << 3);
        int iC = c(c2631w5, obj, obj2);
        return iE + N4.E(iC) + iC;
    }

    final C2631w5 e() {
        return this.f33184a;
    }
}
