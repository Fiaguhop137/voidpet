package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p323s.O f4422a = K.b.e(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p323s.O f4423b = K.b.e(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(C1084w0 c1084w0, D0 d10) {
        return Intrinsics.b(d10.a(), c1084w0);
    }

    public final void b() {
        K.b.c(this.f4422a);
        K.b.c(this.f4423b);
    }

    public final boolean c(AbstractC1078u0 abstractC1078u0) {
        return K.b.f(this.f4422a, abstractC1078u0);
    }

    public final D0 d(AbstractC1078u0 abstractC1078u0) {
        D0 d10 = (D0) K.b.l(this.f4422a, abstractC1078u0);
        if (K.b.i(this.f4422a)) {
            K.b.c(this.f4423b);
        }
        return d10;
    }

    public final void e(C1084w0 c1084w0) {
        Object objE = this.f4423b.e(c1084w0);
        if (objE != null) {
            if (!(objE instanceof p323s.L)) {
                Intrinsics.d(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                android.support.v4.media.session.b.a(objE);
                K.b.m(this.f4422a, null, new B0(c1084w0));
                return;
            }
            p323s.U u10 = (p323s.U) objE;
            Object[] objArr = u10.f52645a;
            int i10 = u10.f52646b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                Intrinsics.d(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                android.support.v4.media.session.b.a(obj);
                K.b.m(this.f4422a, null, new B0(c1084w0));
            }
        }
    }
}
