package androidx.compose.foundation.layout;

import A.C0766a;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p288q0.AbstractC4054a;
import p288q0.AbstractC4055b;
import p288q0.C4061h;
import p288q0.w;
import p288q0.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    public static final class C0259a extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4054a f21225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f21226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f21227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0259a(AbstractC4054a abstractC4054a, float f10, float f11) {
            super(1);
            this.f21225a = abstractC4054a;
            this.f21226b = f10;
            this.f21227c = f11;
        }

        public final void a(J0 j10) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y c(androidx.compose.ui.layout.k kVar, AbstractC4054a abstractC4054a, float f10, float f11, w wVar, long j10) {
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(e(abstractC4054a) ? O0.b.d(j10, 0, 0, 0, 0, 11, null) : O0.b.d(j10, 0, 0, 0, 0, 14, null));
        int iN0 = pVarD0.n0(abstractC4054a);
        if (iN0 == Integer.MIN_VALUE) {
            iN0 = 0;
        }
        int iA0 = e(abstractC4054a) ? pVarD0.A0() : pVarD0.H0();
        int iK = (e(abstractC4054a) ? O0.b.k(j10) : O0.b.l(j10)) - iA0;
        int iM = kotlin.ranges.e.m((!Float.isNaN(f10) ? kVar.q0(f10) : 0) - iN0, 0, iK);
        int iM2 = kotlin.ranges.e.m(((!Float.isNaN(f11) ? kVar.q0(f11) : 0) - iA0) + iN0, 0, iK - iM);
        int iH0 = e(abstractC4054a) ? pVarD0.H0() : Math.max(pVarD0.H0() + iM + iM2, O0.b.n(j10));
        int iMax = e(abstractC4054a) ? Math.max(pVarD0.A0() + iM + iM2, O0.b.m(j10)) : pVarD0.A0();
        return androidx.compose.ui.layout.k.s0(kVar, iH0, iMax, null, new C0766a(abstractC4054a, f10, iM, iH0, iM2, pVarD0, iMax), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(AbstractC4054a abstractC4054a, float f10, int i10, int i11, int i12, androidx.compose.ui.layout.p pVar, int i13, androidx.compose.ui.layout.p.a aVar) {
        int iH0;
        int i14;
        if (e(abstractC4054a)) {
            iH0 = 0;
        } else {
            iH0 = !O0.h.r(f10, O0.h.f8267b.a()) ? i10 : (i11 - i12) - pVar.H0();
        }
        if (e(abstractC4054a)) {
            if (O0.h.r(f10, O0.h.f8267b.a())) {
                i10 = (i13 - i12) - pVar.A0();
            }
            i14 = i10;
        } else {
            i14 = 0;
        }
        androidx.compose.ui.layout.p.a.T(aVar, pVar, iH0, i14, 0.0f, 4, null);
        return Unit.f48228a;
    }

    private static final boolean e(AbstractC4054a abstractC4054a) {
        return abstractC4054a instanceof C4061h;
    }

    public static final V.k f(V.k kVar, AbstractC4054a abstractC4054a, float f10, float f11) {
        return kVar.then(new AlignmentLineOffsetDpElement(abstractC4054a, f10, f11, I0.b() ? new C0259a(abstractC4054a, f10, f11) : I0.a(), null));
    }

    public static /* synthetic */ V.k g(V.k kVar, AbstractC4054a abstractC4054a, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = O0.h.f8267b.a();
        }
        if ((i10 & 4) != 0) {
            f11 = O0.h.f8267b.a();
        }
        return f(kVar, abstractC4054a, f10, f11);
    }

    public static final V.k h(V.k kVar, float f10, float f11) {
        return kVar.then(!Float.isNaN(f10) ? g(V.k.f13755a, AbstractC4055b.a(), f10, 0.0f, 4, null) : V.k.f13755a).then(!Float.isNaN(f11) ? g(V.k.f13755a, AbstractC4055b.b(), 0.0f, f11, 2, null) : V.k.f13755a);
    }
}
