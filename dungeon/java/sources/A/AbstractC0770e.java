package A;

import I.AbstractC1083w;
import I.InterfaceC1054m;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: A.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0770e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p323s.O f48a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p323s.O f49b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p288q0.x f50c = new C0774i(V.d.f13710a.n(), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p288q0.x f51d = a.f52a;

    /* JADX INFO: renamed from: A.e$a */
    static final class a implements p288q0.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(androidx.compose.ui.layout.p.a aVar) {
            return Unit.f48228a;
        }

        @Override // p288q0.x
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final p288q0.y mo0measure3p2s80s(androidx.compose.ui.layout.k kVar, List list, long j10) {
            return androidx.compose.ui.layout.k.s0(kVar, O0.b.n(j10), O0.b.m(j10), null, new C0769d(), 4, null);
        }
    }

    private static final p323s.O c(boolean z10) {
        p323s.O o10 = new p323s.O(9);
        V.d.a aVar = V.d.f13710a;
        o10.x(aVar.n(), new C0774i(aVar.n(), z10));
        o10.x(aVar.l(), new C0774i(aVar.l(), z10));
        o10.x(aVar.m(), new C0774i(aVar.m(), z10));
        o10.x(aVar.g(), new C0774i(aVar.g(), z10));
        o10.x(aVar.d(), new C0774i(aVar.d(), z10));
        o10.x(aVar.e(), new C0774i(aVar.e(), z10));
        o10.x(aVar.c(), new C0774i(aVar.c(), z10));
        o10.x(aVar.a(), new C0774i(aVar.a(), z10));
        o10.x(aVar.b(), new C0774i(aVar.b(), z10));
        return o10;
    }

    private static final AbstractC0768c d(p288q0.w wVar) {
        wVar.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(p288q0.w wVar) {
        d(wVar);
        return false;
    }

    public static final p288q0.x f(V.d dVar, boolean z10) {
        p288q0.x xVar = (p288q0.x) (z10 ? f48a : f49b).e(dVar);
        return xVar == null ? new C0774i(dVar, z10) : xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.ui.layout.p.a aVar, androidx.compose.ui.layout.p pVar, p288q0.w wVar, O0.t tVar, int i10, int i11, V.d dVar) {
        d(wVar);
        androidx.compose.ui.layout.p.a.O(aVar, pVar, dVar.a(O0.r.c((((long) pVar.H0()) << 32) | (((long) pVar.A0()) & 4294967295L)), O0.r.c((((long) i10) << 32) | (((long) i11) & 4294967295L)), tVar), 0.0f, 2, null);
    }

    public static final p288q0.x h(V.d dVar, boolean z10, InterfaceC1054m interfaceC1054m, int i10) {
        p288q0.x xVar;
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!Intrinsics.b(dVar, V.d.f13710a.n()) || z10) {
            interfaceC1054m.V(244414741);
            boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC1054m.U(dVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1054m.a(z10)) || (i10 & 48) == 32);
            Object objD = interfaceC1054m.D();
            if (z11 || objD == InterfaceC1054m.f4688a.a()) {
                objD = new C0774i(dVar, z10);
                interfaceC1054m.t(objD);
            }
            xVar = (C0774i) objD;
            interfaceC1054m.O();
        } else {
            interfaceC1054m.V(244367063);
            interfaceC1054m.O();
            xVar = f50c;
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
        return xVar;
    }
}
