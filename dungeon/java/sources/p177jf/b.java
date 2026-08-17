package p177jf;

import Ad.q;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p142hf.H;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f47381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f47384d;

    public final H e() {
        x xVar;
        synchronized (this) {
            xVar = this.f47384d;
            if (xVar == null) {
                xVar = new x(this.f47382b);
                this.f47384d = xVar;
            }
        }
        return xVar;
    }

    protected final d h() {
        d dVarI;
        x xVar;
        synchronized (this) {
            try {
                d[] dVarArrJ = this.f47381a;
                if (dVarArrJ == null) {
                    dVarArrJ = j(2);
                    this.f47381a = dVarArrJ;
                } else if (this.f47382b >= dVarArrJ.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrJ, dVarArrJ.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f47381a = (d[]) objArrCopyOf;
                    dVarArrJ = (d[]) objArrCopyOf;
                }
                int i10 = this.f47383c;
                do {
                    dVarI = dVarArrJ[i10];
                    if (dVarI == null) {
                        dVarI = i();
                        dVarArrJ[i10] = dVarI;
                    }
                    i10++;
                    if (i10 >= dVarArrJ.length) {
                        i10 = 0;
                    }
                    Intrinsics.d(dVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarI.a(this));
                this.f47383c = i10;
                this.f47382b++;
                xVar = this.f47384d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null) {
            xVar.Z(1);
        }
        return dVarI;
    }

    protected abstract d i();

    protected abstract d[] j(int i10);

    protected final void k(d dVar) {
        x xVar;
        int i10;
        Ed.b[] bVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f47382b - 1;
                this.f47382b = i11;
                xVar = this.f47384d;
                if (i11 == 0) {
                    this.f47383c = 0;
                }
                Intrinsics.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                bVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Ed.b bVar : bVarArrB) {
            if (bVar != null) {
                q.a aVar = q.f327b;
                bVar.resumeWith(q.b(Unit.f48228a));
            }
        }
        if (xVar != null) {
            xVar.Z(-1);
        }
    }

    protected final int l() {
        return this.f47382b;
    }

    protected final d[] m() {
        return this.f47381a;
    }
}
