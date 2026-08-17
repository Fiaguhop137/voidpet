package p195kf;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f48131b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private N[] f48132a;

    private final N[] g() {
        N[] nArr = this.f48132a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f48132a = nArr2;
            return nArr2;
        }
        if (c() < nArr.length) {
            return nArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(nArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        N[] nArr3 = (N[]) objArrCopyOf;
        this.f48132a = nArr3;
        return nArr3;
    }

    private final void k(int i10) {
        f48131b.set(this, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            N[] nArr = this.f48132a;
            Intrinsics.c(nArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                N n10 = nArr[i13];
                Intrinsics.c(n10);
                N n11 = nArr[i12];
                Intrinsics.c(n11);
                if (((Comparable) n10).compareTo(n11) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            N n12 = nArr[i10];
            Intrinsics.c(n12);
            N n13 = nArr[i13];
            Intrinsics.c(n13);
            if (((Comparable) n12).compareTo(n13) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    private final void m(int i10) {
        while (i10 > 0) {
            N[] nArr = this.f48132a;
            Intrinsics.c(nArr);
            int i11 = (i10 - 1) / 2;
            N n10 = nArr[i11];
            Intrinsics.c(n10);
            N n11 = nArr[i10];
            Intrinsics.c(n11);
            if (((Comparable) n10).compareTo(n11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        N[] nArr = this.f48132a;
        Intrinsics.c(nArr);
        N n10 = nArr[i11];
        Intrinsics.c(n10);
        N n11 = nArr[i10];
        Intrinsics.c(n11);
        nArr[i10] = n10;
        nArr[i11] = n11;
        n10.setIndex(i10);
        n11.setIndex(i11);
    }

    public final void a(N n10) {
        n10.h(this);
        N[] nArrG = g();
        int iC = c();
        k(iC + 1);
        nArrG[iC] = n10;
        n10.setIndex(iC);
        m(iC);
    }

    public final N b() {
        N[] nArr = this.f48132a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f48131b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final N f() {
        N nB;
        synchronized (this) {
            nB = b();
        }
        return nB;
    }

    public final boolean h(N n10) {
        boolean z10;
        synchronized (this) {
            if (n10.g() == null) {
                z10 = false;
            } else {
                i(n10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final N i(int i10) {
        N[] nArr = this.f48132a;
        Intrinsics.c(nArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                N n10 = nArr[i10];
                Intrinsics.c(n10);
                N n11 = nArr[i11];
                Intrinsics.c(n11);
                if (((Comparable) n10).compareTo(n11) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            } else {
                l(i10);
            }
        }
        N n12 = nArr[c()];
        Intrinsics.c(n12);
        n12.h(null);
        n12.setIndex(-1);
        nArr[c()] = null;
        return n12;
    }

    public final N j() {
        N nI;
        synchronized (this) {
            nI = c() > 0 ? i(0) : null;
        }
        return nI;
    }
}
