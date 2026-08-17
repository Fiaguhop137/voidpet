package S;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11277a = new Object();

    public static final F a(int i10, Function1 function1) {
        if (i10 == 0) {
            return new F();
        }
        L.e.a aVarBuilder = L.a.b().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            aVarBuilder.add(function1.invoke(Integer.valueOf(i11)));
        }
        return new F(aVarBuilder.build());
    }

    public static final boolean f(P p10, int i10, L.e eVar, boolean z10) {
        boolean z11;
        synchronized (f11277a) {
            try {
                if (p10.j() == i10) {
                    p10.l(eVar);
                    z11 = true;
                    if (z10) {
                        p10.n(p10.k() + 1);
                    }
                    p10.m(p10.j() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public static final P g(F f10) {
        X xW = f10.w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (P) AbstractC1442w.e0((P) xW, f10);
    }

    public static final int h(F f10) {
        X xW = f10.w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((P) AbstractC1442w.K((P) xW)).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final boolean k(F f10, Function1 function1) {
        int iJ;
        L.e eVarI;
        Object objInvoke;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (f11277a) {
                X xW = f10.w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e.a aVarBuilder = eVarI.builder();
            objInvoke = function1.invoke(aVarBuilder);
            L.e eVarBuild = aVarBuilder.build();
            if (Intrinsics.b(eVarBuild, eVarI)) {
                break;
            }
            X xW2 = f10.w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = f((P) AbstractC1442w.p0(p11, f10, abstractC1432lC), iJ, eVarBuild, true);
            }
            AbstractC1442w.X(abstractC1432lC, f10);
        } while (!zF);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final X l(F f10, L.e eVar) {
        AbstractC1432l abstractC1432lM = AbstractC1442w.M();
        P p10 = new P(abstractC1432lM.i(), eVar);
        if (!(abstractC1432lM instanceof C1422b)) {
            p10.g(new P(r.c(1), eVar));
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }
}
