package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f29270a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, V5.g gVar) {
        if (gVar == null) {
            return ((float) a(i10)) >= 2048.0f && a(i11) >= 2048;
        }
        return a(i10) >= gVar.f14102a && a(i11) >= gVar.f14103b;
    }

    public static final boolean c(p025b6.k kVar, V5.g gVar) {
        if (kVar == null) {
            return false;
        }
        int iA2 = kVar.A2();
        return (iA2 == 90 || iA2 == 270) ? b(kVar.getHeight(), kVar.getWidth(), gVar) : b(kVar.getWidth(), kVar.getHeight(), gVar);
    }
}
