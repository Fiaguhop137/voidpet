package Ee;

import Qe.f;
import Qe.n;
import Re.AbstractC1420z;
import Re.B0;
import Re.D0;
import Re.E0;
import Re.M;
import Re.N0;
import Re.S;
import Re.Y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static final class a extends AbstractC1420z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0 e10, boolean z10) {
            super(e10);
            this.f2782d = z10;
        }

        @Override // Re.E0
        public boolean b() {
            return this.f2782d;
        }

        @Override // Re.AbstractC1420z, Re.E0
        public B0 e(S key) {
            Intrinsics.checkNotNullParameter(key, "key");
            B0 b0E = super.e(key);
            if (b0E == null) {
                return null;
            }
            InterfaceC1794h interfaceC1794hP = key.N0().p();
            return e.c(b0E, interfaceC1794hP instanceof m0 ? (m0) interfaceC1794hP : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B0 c(B0 b10, m0 m0Var) {
        if (m0Var == null || b10.b() == N0.INVARIANT) {
            return b10;
        }
        if (m0Var.m() != b10.b()) {
            return new D0(e(b10));
        }
        if (!b10.a()) {
            return new D0(b10.getType());
        }
        n NO_LOCKS = f.f9575e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new D0(new Y(NO_LOCKS, new d(b10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(B0 b10) {
        S type = b10.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    public static final S e(B0 typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new Ee.a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return s10.N0() instanceof b;
    }

    public static final E0 g(E0 e10, boolean z10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        if (!(e10 instanceof M)) {
            return new a(e10, z10);
        }
        M m10 = (M) e10;
        m0[] m0VarArrJ = m10.j();
        List<Pair> listB1 = AbstractC3952n.b1(m10.i(), m10.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listB1, 10));
        for (Pair pair : listB1) {
            arrayList.add(c((B0) pair.c(), (m0) pair.d()));
        }
        return new M(m0VarArrJ, (B0[]) arrayList.toArray(new B0[0]), z10);
    }

    public static /* synthetic */ E0 h(E0 e10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(e10, z10);
    }
}
