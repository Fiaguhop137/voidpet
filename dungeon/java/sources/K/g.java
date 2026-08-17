package K;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p323s.O;
import p323s.P;
import p323s.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final void a(O o10, Object obj, Object obj2) {
        int iN = o10.n(obj);
        boolean z10 = iN < 0;
        Object obj3 = z10 ? null : o10.f52662c[iN];
        if (obj3 != null) {
            if (obj3 instanceof P) {
                Intrinsics.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((P) obj3).h(obj2);
            } else if (obj3 != obj2) {
                P p10 = new P(0, 1, null);
                Intrinsics.d(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                p10.h(obj3);
                p10.h(obj2);
                obj2 = p10;
            }
            obj2 = obj3;
        }
        if (!z10) {
            o10.f52662c[iN] = obj2;
            return;
        }
        int i10 = ~iN;
        o10.f52661b[i10] = obj;
        o10.f52662c[i10] = obj2;
    }

    public static final void b(O o10) {
        o10.k();
    }

    public static O c(O o10) {
        return o10;
    }

    public static /* synthetic */ O d(O o10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            o10 = a0.b();
        }
        return c(o10);
    }

    public static final boolean e(O o10, Object obj) {
        return o10.c(obj);
    }

    public static final int f(O o10) {
        return o10.g();
    }

    public static final boolean g(O o10, Object obj, Object obj2) {
        Object objE = o10.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof P)) {
            if (!Intrinsics.b(objE, obj2)) {
                return false;
            }
            o10.u(obj);
            return true;
        }
        P p10 = (P) objE;
        boolean zY = p10.y(obj2);
        if (zY && p10.d()) {
            o10.u(obj);
        }
        return zY;
    }

    public static final void h(O o10, Object obj) {
        boolean zD;
        long[] jArr = o10.f52660a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = o10.f52661b[i13];
                        Object obj3 = o10.f52662c[i13];
                        if (obj3 instanceof P) {
                            Intrinsics.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            P p10 = (P) obj3;
                            p10.y(obj);
                            zD = p10.d();
                        } else {
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            o10.v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void i(O o10, Object obj, Object obj2) {
        o10.x(obj, obj2);
    }
}
