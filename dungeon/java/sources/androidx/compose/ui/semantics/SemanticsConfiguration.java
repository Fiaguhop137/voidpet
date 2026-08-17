package androidx.compose.ui.semantics;

import Ad.InterfaceC0795e;
import Nd.a;
import androidx.compose.ui.platform.M0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p323s.O;
import p323s.P;
import p323s.a0;
import p323s.b0;
import p323s.c0;
import p450z0.A;
import p450z0.B;
import p450z0.C4362a;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfiguration implements B, Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f22276a = a0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f22277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P f22278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22280e;

    @Override // p450z0.B
    public void a(A a10, Object obj) {
        if ((obj instanceof C4362a) && e(a10)) {
            Object objE = this.f22276a.e(a10);
            Intrinsics.d(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C4362a c4362a = (C4362a) objE;
            O o10 = this.f22276a;
            C4362a c4362a2 = (C4362a) obj;
            String strB = c4362a2.b();
            if (strB == null) {
                strB = c4362a.b();
            }
            InterfaceC0795e interfaceC0795eA = c4362a2.a();
            if (interfaceC0795eA == null) {
                interfaceC0795eA = c4362a.a();
            }
            o10.x(a10, new C4362a(strB, interfaceC0795eA));
        } else {
            this.f22276a.x(a10, obj);
        }
        if (a10.a() != null) {
            if (this.f22278c == null) {
                this.f22278c = c0.b();
            }
            P p10 = this.f22278c;
            if (p10 != null) {
                p10.h(a10);
            }
        }
    }

    public final void c(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.f22279d) {
            this.f22279d = true;
        }
        if (semanticsConfiguration.f22280e) {
            this.f22280e = true;
        }
        O o10 = semanticsConfiguration.f22276a;
        Object[] objArr = o10.f52661b;
        Object[] objArr2 = o10.f52662c;
        long[] jArr = o10.f52660a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        A a10 = (A) obj;
                        if (!this.f22276a.b(a10)) {
                            this.f22276a.x(a10, obj2);
                        } else if (obj2 instanceof C4362a) {
                            Object objE = this.f22276a.e(a10);
                            Intrinsics.d(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C4362a c4362a = (C4362a) objE;
                            O o11 = this.f22276a;
                            String strB = c4362a.b();
                            if (strB == null) {
                                strB = ((C4362a) obj2).b();
                            }
                            String str = strB;
                            InterfaceC0795e interfaceC0795eA = c4362a.a();
                            if (interfaceC0795eA == null) {
                                interfaceC0795eA = ((C4362a) obj2).a();
                            }
                            o11.x(a10, new C4362a(str, interfaceC0795eA));
                        }
                    }
                    j10 >>= i11;
                    i13++;
                    i11 = i11;
                }
                if (i12 != i11) {
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

    public final boolean e(A a10) {
        return this.f22276a.c(a10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.b(this.f22276a, semanticsConfiguration.f22276a) && this.f22279d == semanticsConfiguration.f22279d && this.f22280e == semanticsConfiguration.f22280e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:5:0x000f->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[SYNTHETIC] */
    public final boolean g() {
        O o10 = this.f22276a;
        Object[] objArr = o10.f52661b;
        Object[] objArr2 = o10.f52662c;
        long[] jArr = o10.f52660a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (((A) obj).c()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final SemanticsConfiguration h() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f22279d = this.f22279d;
        semanticsConfiguration.f22280e = this.f22280e;
        semanticsConfiguration.f22276a.t(this.f22276a);
        return semanticsConfiguration;
    }

    public int hashCode() {
        return (((this.f22276a.hashCode() * 31) + Boolean.hashCode(this.f22279d)) * 31) + Boolean.hashCode(this.f22280e);
    }

    public final Object i(A a10) {
        Object objE = this.f22276a.e(a10);
        if (objE != null) {
            return objE;
        }
        throw new IllegalStateException("Key not present: " + a10 + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map mapA = this.f22277b;
        if (mapA == null) {
            mapA = this.f22276a.a();
            this.f22277b = mapA;
        }
        return mapA.entrySet().iterator();
    }

    public final b0 k() {
        return this.f22278c;
    }

    public final Object n(A a10, Function0 function0) {
        Object objE = this.f22276a.e(a10);
        return objE == null ? function0.invoke() : objE;
    }

    public final Object p(A a10, Function0 function0) {
        Object objE = this.f22276a.e(a10);
        return objE == null ? function0.invoke() : objE;
    }

    public final O q() {
        return this.f22276a;
    }

    public final boolean s() {
        return this.f22280e;
    }

    public final boolean t() {
        return this.f22279d;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[DONT_INVERT, PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:11:0x0034->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:11:0x0034->B:21:0x007d], SYNTHETIC] */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f22279d) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f22280e) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        O o10 = this.f22276a;
        Object[] objArr = o10.f52661b;
        Object[] objArr2 = o10.f52662c;
        long[] jArr = o10.f52660a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb2.append(str);
                            sb2.append(((A) obj).b());
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return M0.a(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final void v(SemanticsConfiguration semanticsConfiguration) {
        O o10 = semanticsConfiguration.f22276a;
        Object[] objArr = o10.f52661b;
        Object[] objArr2 = o10.f52662c;
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
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        A a10 = (A) obj;
                        Object objE = this.f22276a.e(a10);
                        Intrinsics.d(a10, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objD = a10.d(objE, obj2);
                        if (objD != null) {
                            this.f22276a.x(a10, objD);
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

    public final void w(boolean z10) {
        this.f22280e = z10;
    }

    public final void x(boolean z10) {
        this.f22279d = z10;
    }
}
