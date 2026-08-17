package I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class D1 implements U.e, Iterable, Nd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4441b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4444e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4447h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HashMap f4449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p323s.F f4450k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f4440a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f4442c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f4445f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f4448i = new ArrayList();

    private final C1021b H(int i10) {
        int i11;
        if (this.f4446g) {
            AbstractC1083w.t("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f4441b)) {
            return null;
        }
        return F1.n(this.f4448i, i10, i11);
    }

    public final boolean A(int i10, C1021b c1021b) {
        if (this.f4446g) {
            AbstractC1083w.t("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f4441b)) {
            AbstractC1083w.t("Invalid group index");
        }
        if (E(c1021b)) {
            int iO = F1.o(this.f4440a, i10) + i10;
            int iA = c1021b.a();
            if (i10 <= iA && iA < iO) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(C1021b c1021b, C1021b c1021b2) {
        int iA = c1021b.a();
        int iO = F1.o(this.f4440a, iA) + iA;
        int iA2 = c1021b2.a();
        return iA <= iA2 && iA2 < iO;
    }

    public final C1 C() {
        if (this.f4446g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4444e++;
        return new C1(this);
    }

    public final G1 D() {
        if (this.f4446g) {
            AbstractC1083w.t("Cannot start a writer when another writer is pending");
        }
        if (!(this.f4444e <= 0)) {
            AbstractC1083w.t("Cannot start a writer when a reader is pending");
        }
        this.f4446g = true;
        this.f4447h++;
        return new G1(this);
    }

    public final boolean E(C1021b c1021b) {
        int iS;
        return c1021b.b() && (iS = F1.s(this.f4448i, c1021b.a(), this.f4441b)) >= 0 && Intrinsics.b(this.f4448i.get(iS), c1021b);
    }

    public final void F(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, p323s.F f10) {
        this.f4440a = iArr;
        this.f4441b = i10;
        this.f4442c = objArr;
        this.f4443d = i11;
        this.f4448i = arrayList;
        this.f4449j = map;
        this.f4450k = f10;
    }

    public final AbstractC1040h0 G(int i10) {
        C1021b c1021bH;
        HashMap map = this.f4449j;
        if (map == null || (c1021bH = H(i10)) == null) {
            return null;
        }
        return (AbstractC1040h0) map.get(c1021bH);
    }

    public final C1021b a(int i10) {
        if (this.f4446g) {
            AbstractC1083w.t("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f4441b) {
            z10 = true;
        }
        if (!z10) {
            T0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f4448i;
        int iS = F1.s(arrayList, i10, this.f4441b);
        if (iS >= 0) {
            return (C1021b) arrayList.get(iS);
        }
        C1021b c1021b = new C1021b(i10);
        arrayList.add(-(iS + 1), c1021b);
        return c1021b;
    }

    public final int c(C1021b c1021b) {
        if (this.f4446g) {
            AbstractC1083w.t("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1021b.b()) {
            T0.a("Anchor refers to a group that was removed");
        }
        return c1021b.a();
    }

    public final void e(C1 c10, HashMap map) {
        if (!(c10.z() == this && this.f4444e > 0)) {
            AbstractC1083w.t("Unexpected reader close()");
        }
        this.f4444e--;
        if (map != null) {
            synchronized (this.f4445f) {
                try {
                    HashMap map2 = this.f4449j;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f4449j = map;
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(G1 g10, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, p323s.F f10) {
        if (!(g10.c0() == this && this.f4446g)) {
            T0.a("Unexpected writer close()");
        }
        this.f4446g = false;
        F(iArr, i10, objArr, i11, arrayList, map, f10);
    }

    public final void h() {
        this.f4450k = new p323s.F(0, 1, null);
    }

    public final void i() {
        this.f4449j = new HashMap();
    }

    public boolean isEmpty() {
        return this.f4441b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1034f0(this, 0, this.f4441b);
    }

    public final boolean k() {
        return this.f4441b > 0 && (this.f4440a[1] & 67108864) != 0;
    }

    public final ArrayList n() {
        return this.f4448i;
    }

    public final p323s.F p() {
        return this.f4450k;
    }

    public final int[] q() {
        return this.f4440a;
    }

    public final int s() {
        return this.f4441b;
    }

    public final Object[] t() {
        return this.f4442c;
    }

    public final int v() {
        return this.f4443d;
    }

    public final HashMap w() {
        return this.f4449j;
    }

    public final int x() {
        return this.f4447h;
    }

    public final boolean y() {
        return this.f4446g;
    }
}
