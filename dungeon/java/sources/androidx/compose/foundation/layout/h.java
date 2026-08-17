package androidx.compose.foundation.layout;

import A.A;
import A.B;
import A.C;
import A.D;
import A.E;
import A.F;
import androidx.compose.ui.platform.J0;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final E e(float f10, float f11, float f12, float f13) {
        return new F(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ E f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = O0.h.o(0);
        }
        if ((i10 & 2) != 0) {
            f11 = O0.h.o(0);
        }
        if ((i10 & 4) != 0) {
            f12 = O0.h.o(0);
        }
        if ((i10 & 8) != 0) {
            f13 = O0.h.o(0);
        }
        return e(f10, f11, f12, f13);
    }

    public static final V.k g(V.k kVar, E e10) {
        return kVar.then(new PaddingValuesElement(e10, new B(e10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(E e10, J0 j10) {
        throw null;
    }

    public static final V.k i(V.k kVar, float f10) {
        return kVar.then(new PaddingElement(f10, f10, f10, f10, true, new D(f10), null));
    }

    public static final V.k j(V.k kVar, float f10, float f11) {
        return kVar.then(new PaddingElement(f10, f11, f10, f11, true, new C(f10, f11), null));
    }

    public static /* synthetic */ V.k k(V.k kVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = O0.h.o(0);
        }
        if ((i10 & 2) != 0) {
            f11 = O0.h.o(0);
        }
        return j(kVar, f10, f11);
    }

    public static final V.k l(V.k kVar, float f10, float f11, float f12, float f13) {
        return kVar.then(new PaddingElement(f10, f11, f12, f13, true, new A(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ V.k m(V.k kVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = O0.h.o(0);
        }
        if ((i10 & 2) != 0) {
            f11 = O0.h.o(0);
        }
        if ((i10 & 4) != 0) {
            f12 = O0.h.o(0);
        }
        if ((i10 & 8) != 0) {
            f13 = O0.h.o(0);
        }
        return l(kVar, f10, f11, f12, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(float f10, J0 j10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(float f10, float f11, J0 j10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(float f10, float f11, float f12, float f13, J0 j10) {
        throw null;
    }
}
