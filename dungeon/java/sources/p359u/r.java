package p359u;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final C4214m a(float f10) {
        return new C4214m(f10);
    }

    public static final C4215n b(float f10, float f11) {
        return new C4215n(f10, f11);
    }

    public static final C4216o c(float f10, float f11, float f12) {
        return new C4216o(f10, f11, f12);
    }

    public static final C4217p d(float f10, float f11, float f12, float f13) {
        return new C4217p(f10, f11, f12, f13);
    }

    public static final AbstractC4218q e(AbstractC4218q abstractC4218q) {
        AbstractC4218q abstractC4218qG = g(abstractC4218q);
        int iB = abstractC4218qG.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC4218qG.e(i10, abstractC4218q.a(i10));
        }
        return abstractC4218qG;
    }

    public static final void f(AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2) {
        int iB = abstractC4218q.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC4218q.e(i10, abstractC4218q2.a(i10));
        }
    }

    public static final AbstractC4218q g(AbstractC4218q abstractC4218q) {
        AbstractC4218q abstractC4218qC = abstractC4218q.c();
        Intrinsics.d(abstractC4218qC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return abstractC4218qC;
    }
}
