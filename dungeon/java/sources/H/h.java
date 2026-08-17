package H;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4073a = O0.h.o(10);

    public static final float a(O0.d getRippleEndRadius, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float fK = p019b0.e.k(p019b0.f.a(p019b0.k.i(j10), p019b0.k.g(j10))) / 2.0f;
        return z10 ? fK + getRippleEndRadius.e1(f4073a) : fK;
    }

    public static final float b(long j10) {
        return Math.max(p019b0.k.i(j10), p019b0.k.g(j10)) * 0.3f;
    }
}
