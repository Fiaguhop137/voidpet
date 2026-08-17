package S;

import I.AbstractC1083w;
import I.S1;
import I.T0;
import I.T1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p323s.b0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f11288l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f11289a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11291c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC1427g f11296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f11298j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f11290b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f11292d = new J(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f11293e = new K(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K.c f11294f = new K.c(new a[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11295g = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11299k = -1;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f11300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f11301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p323s.K f11302c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11309j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11303d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p323s.O f11304e = K.g.d(null, 1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p323s.O f11305f = new p323s.O(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p323s.P f11306g = new p323s.P(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final K.c f11307h = new K.c(new I.U[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final I.V f11308i = new C0167a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final p323s.O f11310k = K.g.d(null, 1, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final HashMap f11311l = new HashMap();

        /* JADX INFO: renamed from: S.M$a$a, reason: collision with other inner class name */
        public static final class C0167a implements I.V {
            C0167a() {
            }

            @Override // I.V
            public void a(I.U u10) {
                a.this.f11309j--;
            }

            @Override // I.V
            public void b(I.U u10) {
                a.this.f11309j++;
            }
        }

        public a(Function1 function1) {
            this.f11300a = function1;
        }

        private final void d(Object obj) {
            int i10 = this.f11303d;
            p323s.K k10 = this.f11302c;
            if (k10 == null) {
                return;
            }
            long[] jArr = k10.f52639a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = k10.f52640b[i14];
                            boolean z10 = k10.f52641c[i14] != i10;
                            if (z10) {
                                m(obj, obj2);
                            }
                            if (z10) {
                                k10.s(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        private final void l(Object obj, int i10, Object obj2, p323s.K k10) {
            int i11;
            int i12;
            int i13;
            if (this.f11309j > 0) {
                return;
            }
            int iQ = k10.q(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof I.U) || iQ == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                I.U.a aVarZ = ((I.U) obj).z();
                this.f11311l.put(obj, aVarZ.a());
                p323s.S sB = aVarZ.b();
                p323s.O o10 = this.f11310k;
                K.g.h(o10, obj);
                Object[] objArr = sB.f52640b;
                long[] jArr = sB.f52639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    i13 = i14;
                                    V v10 = (V) objArr[(i15 << 3) + i17];
                                    if (v10 instanceof W) {
                                        ((W) v10).B(AbstractC1428h.a(i13));
                                    }
                                    K.g.a(o10, v10, obj);
                                } else {
                                    i13 = i14;
                                }
                                j10 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iQ == i12) {
                if (obj instanceof W) {
                    ((W) obj).B(AbstractC1428h.a(i11));
                }
                K.g.a(this.f11304e, obj, obj2);
            }
        }

        private final void m(Object obj, Object obj2) {
            K.g.g(this.f11304e, obj2, obj);
            if (!(obj2 instanceof I.U) || K.g.e(this.f11304e, obj2)) {
                return;
            }
            K.g.h(this.f11310k, obj2);
            this.f11311l.remove(obj2);
        }

        public final void c() {
            K.g.b(this.f11304e);
            this.f11305f.k();
            K.g.b(this.f11310k);
            this.f11311l.clear();
        }

        public final void e(Object obj) {
            p323s.K k10 = (p323s.K) this.f11305f.u(obj);
            if (k10 == null) {
                return;
            }
            Object[] objArr = k10.f52640b;
            int[] iArr = k10.f52641c;
            long[] jArr = k10.f52639a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m(obj, obj2);
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

        public final Function1 f() {
            return this.f11300a;
        }

        public final boolean g() {
            return this.f11305f.i();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void h() {
            p323s.P p10 = this.f11306g;
            Function1 function1 = this.f11300a;
            Object[] objArr = p10.f52684b;
            long[] jArr = p10.f52683a;
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
                                function1.invoke(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            p10.m();
        }

        public final void i(Object obj, Function1 function1, Function0 function0) {
            Object obj2 = this.f11301b;
            p323s.K k10 = this.f11302c;
            int i10 = this.f11303d;
            this.f11301b = obj;
            this.f11302c = (p323s.K) this.f11305f.e(obj);
            if (this.f11303d == -1) {
                this.f11303d = Long.hashCode(AbstractC1442w.M().i());
            }
            I.V v10 = this.f11308i;
            K.c cVarA = T1.a();
            try {
                cVarA.b(v10);
                AbstractC1432l.f11377e.g(function1, null, function0);
                cVarA.r(cVarA.l() - 1);
                Object obj3 = this.f11301b;
                Intrinsics.c(obj3);
                d(obj3);
                this.f11301b = obj2;
                this.f11302c = k10;
                this.f11303d = i10;
            } catch (Throwable th) {
                cVarA.r(cVarA.l() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0245  */
        /* JADX WARN: Code duplicated, block: B:122:0x02a8 A[DONT_INVERT, PHI: r11
          0x02a8: PHI (r11v44 boolean) = (r11v43 boolean), (r11v45 boolean) binds: [B:113:0x0280, B:121:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:123:0x02aa A[LOOP:6: B:112:0x0276->B:123:0x02aa, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:181:0x0402 A[DONT_INVERT, PHI: r13
          0x0402: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:172:0x03d6, B:180:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:182:0x0404 A[LOOP:14: B:171:0x03c8->B:182:0x0404, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:185:0x0414  */
        /* JADX WARN: Code duplicated, block: B:219:0x04ca A[DONT_INVERT, PHI: r11
          0x04ca: PHI (r11v15 boolean) = (r11v14 boolean), (r11v16 boolean) binds: [B:210:0x04a2, B:218:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:220:0x04cc A[LOOP:18: B:209:0x0498->B:220:0x04cc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:224:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:264:0x0162 A[EDGE_INSN: B:264:0x0162->B:61:0x0162 BREAK  A[LOOP:4: B:46:0x010c->B:58:0x0148], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:269:0x02b1 A[EDGE_INSN: B:269:0x02b1->B:125:0x02b1 BREAK  A[LOOP:6: B:112:0x0276->B:123:0x02aa], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:274:0x023c A[EDGE_INSN: B:274:0x023c->B:100:0x023c BREAK  A[LOOP:8: B:87:0x0201->B:98:0x0235], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:288:0x040b A[EDGE_INSN: B:288:0x040b->B:183:0x040b BREAK  A[LOOP:14: B:171:0x03c8->B:182:0x0404], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:296:0x04d3 A[EDGE_INSN: B:296:0x04d3->B:222:0x04d3 BREAK  A[LOOP:18: B:209:0x0498->B:220:0x04cc], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0146 A[DONT_INVERT, PHI: r37
          0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:58:0x0148 A[LOOP:4: B:46:0x010c->B:58:0x0148, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:60:0x015c  */
        /* JADX WARN: Code duplicated, block: B:97:0x0233 A[DONT_INVERT, PHI: r11
          0x0233: PHI (r11v55 boolean) = (r11v54 boolean), (r11v56 boolean) binds: [B:88:0x020b, B:96:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x0235 A[LOOP:8: B:87:0x0201->B:98:0x0235, LOOP_END] */
        public final boolean j(Set set) {
            boolean z10;
            Iterator it;
            p323s.O o10;
            Object objE;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            p323s.O o11;
            long[] jArr2;
            Object[] objArr2;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i10;
            Object[] objArr4;
            String str2;
            int i11;
            int i12;
            long j10;
            int i13;
            int i14;
            Object obj;
            Object obj2;
            String str3;
            Object obj3;
            int i15;
            long j11;
            int i16;
            p323s.O o12 = this.f11310k;
            HashMap map = this.f11311l;
            p323s.O o13 = this.f11304e;
            p323s.P p10 = this.f11306g;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i17 = 8;
            if (set instanceof K.e) {
                b0 b0VarA = ((K.e) set).a();
                Object[] objArr5 = b0VarA.f52684b;
                long[] jArr4 = b0VarA.f52683a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    z10 = false;
                    while (true) {
                        long j12 = jArr4[i18];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j12 & 255) < 128) {
                                    int i21 = i17;
                                    Object obj4 = objArr5[(i18 << 3) + i20];
                                    if (obj4 instanceof W) {
                                        objArr4 = objArr5;
                                        if (!((W) obj4).A(AbstractC1428h.a(2))) {
                                            str2 = str4;
                                            i11 = length;
                                            i12 = i18;
                                            j10 = j12;
                                            i13 = i19;
                                        }
                                        i14 = 8;
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (K.g.e(o12, obj4)) {
                                        Object objE2 = o12.e(obj4);
                                        if (objE2 == null) {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i11 = length;
                                            i12 = i18;
                                            j10 = j12;
                                            i13 = i19;
                                        } else if (objE2 instanceof p323s.P) {
                                            p323s.P p11 = (p323s.P) objE2;
                                            Object[] objArr6 = p11.f52684b;
                                            long[] jArr5 = p11.f52683a;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                j10 = j12;
                                                int i22 = 0;
                                                boolean z11 = z10;
                                                while (true) {
                                                    long j13 = jArr5[i22];
                                                    i11 = length;
                                                    i12 = i18;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                        int i24 = 0;
                                                        while (i24 < i23) {
                                                            if ((j13 & 255) < 128) {
                                                                i15 = i24;
                                                                I.U u10 = (I.U) objArr6[(i22 << 3) + i24];
                                                                Intrinsics.d(u10, str4);
                                                                j11 = j13;
                                                                Object obj5 = map.get(u10);
                                                                S1 s1L = u10.l();
                                                                if (s1L == null) {
                                                                    s1L = T1.m();
                                                                }
                                                                boolean z12 = z11;
                                                                if (s1L.b(u10.z().a(), obj5)) {
                                                                    str3 = str4;
                                                                    obj3 = obj4;
                                                                    i16 = i19;
                                                                    this.f11307h.b(u10);
                                                                    z11 = z12;
                                                                } else {
                                                                    Object objE3 = o13.e(u10);
                                                                    if (objE3 == null) {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i16 = i19;
                                                                        z11 = z12;
                                                                    } else if (objE3 instanceof p323s.P) {
                                                                        p323s.P p12 = (p323s.P) objE3;
                                                                        Object[] objArr7 = p12.f52684b;
                                                                        long[] jArr6 = p12.f52683a;
                                                                        int length3 = jArr6.length - 2;
                                                                        if (length3 >= 0) {
                                                                            i16 = i19;
                                                                            int i25 = 0;
                                                                            while (true) {
                                                                                long j14 = jArr6[i25];
                                                                                str3 = str4;
                                                                                obj3 = obj4;
                                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                    if (i25 != length3) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i25++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i21 = 8;
                                                                                } else {
                                                                                    int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                                                        if ((j14 & 255) < 128) {
                                                                                            p10.h(objArr7[(i25 << 3) + i27]);
                                                                                            z12 = true;
                                                                                        }
                                                                                        j14 >>= i21;
                                                                                    }
                                                                                    if (i26 != i21) {
                                                                                        break;
                                                                                    }
                                                                                    if (i25 != length3) {
                                                                                        break;
                                                                                    }
                                                                                    i25++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i21 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str3 = str4;
                                                                            obj3 = obj4;
                                                                            i16 = i19;
                                                                        }
                                                                        z11 = z12;
                                                                    } else {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i16 = i19;
                                                                        p10.h(objE3);
                                                                        z11 = true;
                                                                    }
                                                                    Unit unit = Unit.f48228a;
                                                                }
                                                            } else {
                                                                str3 = str4;
                                                                obj3 = obj4;
                                                                i15 = i24;
                                                                j11 = j13;
                                                                i16 = i19;
                                                            }
                                                            j13 = j11 >> 8;
                                                            i24 = i15 + 1;
                                                            i21 = 8;
                                                            i19 = i16;
                                                            str4 = str3;
                                                            obj4 = obj3;
                                                        }
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        boolean z13 = z11;
                                                        i13 = i19;
                                                        if (i23 != i21) {
                                                            z10 = z13;
                                                            break;
                                                        }
                                                        z11 = z13;
                                                    } else {
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        i13 = i19;
                                                    }
                                                    if (i22 == length2) {
                                                        z10 = z11;
                                                        break;
                                                    }
                                                    i22++;
                                                    length = i11;
                                                    i18 = i12;
                                                    i19 = i13;
                                                    str4 = str2;
                                                    obj4 = obj2;
                                                    i21 = 8;
                                                }
                                            } else {
                                                str2 = str4;
                                                obj2 = obj4;
                                                i11 = length;
                                                i12 = i18;
                                                j10 = j12;
                                                i13 = i19;
                                            }
                                        } else {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i11 = length;
                                            i12 = i18;
                                            j10 = j12;
                                            i13 = i19;
                                            I.U u11 = (I.U) objE2;
                                            Object obj6 = map.get(u11);
                                            S1 s1L2 = u11.l();
                                            if (s1L2 == null) {
                                                s1L2 = T1.m();
                                            }
                                            if (s1L2.b(u11.z().a(), obj6)) {
                                                this.f11307h.b(u11);
                                            } else {
                                                Object objE4 = o13.e(u11);
                                                if (objE4 != null) {
                                                    if (objE4 instanceof p323s.P) {
                                                        p323s.P p13 = (p323s.P) objE4;
                                                        Object[] objArr8 = p13.f52684b;
                                                        long[] jArr7 = p13.f52683a;
                                                        int length4 = jArr7.length - 2;
                                                        if (length4 >= 0) {
                                                            int i28 = 0;
                                                            while (true) {
                                                                long j15 = jArr7[i28];
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i28 != length4) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i28++;
                                                                } else {
                                                                    int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                                        if ((j15 & 255) < 128) {
                                                                            p10.h(objArr8[(i28 << 3) + i30]);
                                                                            z10 = true;
                                                                        }
                                                                        j15 >>= 8;
                                                                    }
                                                                    if (i29 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i28 != length4) {
                                                                        break;
                                                                    }
                                                                    i28++;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        p10.h(objE4);
                                                        z10 = true;
                                                    }
                                                }
                                                Unit unit2 = Unit.f48228a;
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        str2 = str4;
                                        i11 = length;
                                        i12 = i18;
                                        j10 = j12;
                                        i13 = i19;
                                        obj = obj4;
                                    }
                                    Object objE5 = o13.e(obj);
                                    if (objE5 != null) {
                                        if (objE5 instanceof p323s.P) {
                                            p323s.P p14 = (p323s.P) objE5;
                                            Object[] objArr9 = p14.f52684b;
                                            long[] jArr8 = p14.f52683a;
                                            int length5 = jArr8.length - 2;
                                            if (length5 >= 0) {
                                                int i31 = 0;
                                                while (true) {
                                                    long j16 = jArr8[i31];
                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i31 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i31++;
                                                    } else {
                                                        int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                        for (int i33 = 0; i33 < i32; i33++) {
                                                            if ((j16 & 255) < 128) {
                                                                p10.h(objArr9[(i31 << 3) + i33]);
                                                                z10 = true;
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i32 != 8) {
                                                            break;
                                                        }
                                                        if (i31 != length5) {
                                                            break;
                                                        }
                                                        i31++;
                                                    }
                                                }
                                            }
                                        } else {
                                            p10.h(objE5);
                                            z10 = true;
                                        }
                                    }
                                    i14 = 8;
                                } else {
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i11 = length;
                                    i12 = i18;
                                    j10 = j12;
                                    i13 = i19;
                                    i14 = i17;
                                }
                                j12 = j10 >> i14;
                                i20++;
                                objArr5 = objArr4;
                                i17 = i14;
                                jArr4 = jArr4;
                                length = i11;
                                i18 = i12;
                                i19 = i13;
                                str4 = str2;
                            }
                            jArr3 = jArr4;
                            objArr3 = objArr5;
                            str = str4;
                            int i34 = length;
                            int i35 = i18;
                            if (i19 != i17) {
                                break;
                            }
                            length = i34;
                            i10 = i35;
                        } else {
                            jArr3 = jArr4;
                            objArr3 = objArr5;
                            str = str4;
                            i10 = i18;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i18 = i10 + 1;
                        objArr5 = objArr3;
                        jArr4 = jArr3;
                        str4 = str;
                        i17 = 8;
                    }
                } else {
                    z10 = false;
                }
            } else {
                Iterator it3 = set.iterator();
                z10 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof W) || ((W) next).A(AbstractC1428h.a(2))) {
                        if (!K.g.e(o12, next) || (objE = o12.e(next)) == null) {
                            it = it3;
                            o10 = o12;
                        } else if (objE instanceof p323s.P) {
                            p323s.P p15 = (p323s.P) objE;
                            Object[] objArr10 = p15.f52684b;
                            long[] jArr9 = p15.f52683a;
                            int length6 = jArr9.length - 2;
                            if (length6 >= 0) {
                                int i36 = 0;
                                while (true) {
                                    long j17 = jArr9[i36];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i37 = 8 - ((~(i36 - length6)) >>> 31);
                                        int i38 = 0;
                                        while (i38 < i37) {
                                            if ((j17 & 255) < 128) {
                                                it2 = it3;
                                                I.U u12 = (I.U) objArr10[(i36 << 3) + i38];
                                                o11 = o12;
                                                Intrinsics.d(u12, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj7 = map.get(u12);
                                                S1 s1L3 = u12.l();
                                                if (s1L3 == null) {
                                                    s1L3 = T1.m();
                                                }
                                                jArr2 = jArr9;
                                                objArr2 = objArr10;
                                                if (s1L3.b(u12.z().a(), obj7)) {
                                                    j17 = j17;
                                                    this.f11307h.b(u12);
                                                } else {
                                                    Object objE6 = o13.e(u12);
                                                    if (objE6 != null) {
                                                        if (objE6 instanceof p323s.P) {
                                                            p323s.P p16 = (p323s.P) objE6;
                                                            Object[] objArr11 = p16.f52684b;
                                                            long[] jArr10 = p16.f52683a;
                                                            int length7 = jArr10.length - 2;
                                                            if (length7 >= 0) {
                                                                int i39 = 0;
                                                                boolean z14 = z10;
                                                                while (true) {
                                                                    long j18 = jArr10[i39];
                                                                    long[] jArr11 = jArr10;
                                                                    Object[] objArr12 = objArr11;
                                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i39 != length7) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i39++;
                                                                        objArr11 = objArr12;
                                                                        jArr10 = jArr11;
                                                                    } else {
                                                                        int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                                        for (int i41 = 0; i41 < i40; i41++) {
                                                                            if ((j18 & 255) < 128) {
                                                                                p10.h(objArr12[(i39 << 3) + i41]);
                                                                                z14 = true;
                                                                            }
                                                                            j18 >>= 8;
                                                                        }
                                                                        if (i40 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i39 != length7) {
                                                                            break;
                                                                        }
                                                                        i39++;
                                                                        objArr11 = objArr12;
                                                                        jArr10 = jArr11;
                                                                    }
                                                                }
                                                                z10 = z14;
                                                            }
                                                        } else {
                                                            p10.h(objE6);
                                                            z10 = true;
                                                        }
                                                    }
                                                    Unit unit3 = Unit.f48228a;
                                                }
                                            } else {
                                                it2 = it3;
                                                o11 = o12;
                                                jArr2 = jArr9;
                                                objArr2 = objArr10;
                                                j17 = j17;
                                            }
                                            j17 >>= 8;
                                            i38++;
                                            it3 = it2;
                                            o12 = o11;
                                            jArr9 = jArr2;
                                            objArr10 = objArr2;
                                        }
                                        it = it3;
                                        o10 = o12;
                                        jArr = jArr9;
                                        objArr = objArr10;
                                        if (i37 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        o10 = o12;
                                        jArr = jArr9;
                                        objArr = objArr10;
                                    }
                                    if (i36 == length6) {
                                        break;
                                    }
                                    i36++;
                                    it3 = it;
                                    o12 = o10;
                                    jArr9 = jArr;
                                    objArr10 = objArr;
                                }
                            } else {
                                it = it3;
                                o10 = o12;
                            }
                        } else {
                            it = it3;
                            o10 = o12;
                            I.U u13 = (I.U) objE;
                            Object obj8 = map.get(u13);
                            S1 s1L4 = u13.l();
                            if (s1L4 == null) {
                                s1L4 = T1.m();
                            }
                            if (s1L4.b(u13.z().a(), obj8)) {
                                this.f11307h.b(u13);
                            } else {
                                Object objE7 = o13.e(u13);
                                if (objE7 != null) {
                                    if (objE7 instanceof p323s.P) {
                                        p323s.P p17 = (p323s.P) objE7;
                                        Object[] objArr13 = p17.f52684b;
                                        long[] jArr12 = p17.f52683a;
                                        int length8 = jArr12.length - 2;
                                        if (length8 >= 0) {
                                            int i42 = 0;
                                            while (true) {
                                                long j19 = jArr12[i42];
                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i42 != length8) {
                                                        break;
                                                        break;
                                                    }
                                                    i42++;
                                                } else {
                                                    int i43 = 8 - ((~(i42 - length8)) >>> 31);
                                                    for (int i44 = 0; i44 < i43; i44++) {
                                                        if ((j19 & 255) < 128) {
                                                            p10.h(objArr13[(i42 << 3) + i44]);
                                                            z10 = true;
                                                        }
                                                        j19 >>= 8;
                                                    }
                                                    if (i43 != 8) {
                                                        break;
                                                    }
                                                    if (i42 != length8) {
                                                        break;
                                                    }
                                                    i42++;
                                                }
                                            }
                                        }
                                    } else {
                                        p10.h(objE7);
                                        z10 = true;
                                    }
                                }
                                Unit unit4 = Unit.f48228a;
                            }
                        }
                        Object objE8 = o13.e(next);
                        if (objE8 != null) {
                            if (objE8 instanceof p323s.P) {
                                p323s.P p18 = (p323s.P) objE8;
                                Object[] objArr14 = p18.f52684b;
                                long[] jArr13 = p18.f52683a;
                                int length9 = jArr13.length - 2;
                                if (length9 >= 0) {
                                    int i45 = 0;
                                    while (true) {
                                        long j20 = jArr13[i45];
                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i46 = 8 - ((~(i45 - length9)) >>> 31);
                                            for (int i47 = 0; i47 < i46; i47++) {
                                                if ((j20 & 255) < 128) {
                                                    p10.h(objArr14[(i45 << 3) + i47]);
                                                    z10 = true;
                                                }
                                                j20 >>= 8;
                                            }
                                            if (i46 != 8) {
                                                break;
                                            }
                                        }
                                        if (i45 == length9) {
                                            break;
                                        }
                                        i45++;
                                    }
                                }
                            } else {
                                p10.h(objE8);
                                z10 = true;
                            }
                        }
                        it3 = it;
                        o12 = o10;
                    } else {
                        it = it3;
                        o10 = o12;
                    }
                    it3 = it;
                    o12 = o10;
                }
            }
            if (this.f11307h.l() != 0) {
                K.c cVar = this.f11307h;
                Object[] objArr15 = cVar.f5867a;
                int iL = cVar.l();
                for (int i48 = 0; i48 < iL; i48++) {
                    o((I.U) objArr15[i48]);
                }
                this.f11307h.i();
            }
            return z10;
        }

        public final void k(Object obj) {
            Object obj2 = this.f11301b;
            Intrinsics.c(obj2);
            int i10 = this.f11303d;
            p323s.K k10 = this.f11302c;
            if (k10 == null) {
                k10 = new p323s.K(0, 1, null);
                this.f11302c = k10;
                this.f11305f.x(obj2, k10);
                Unit unit = Unit.f48228a;
            }
            l(obj, i10, obj2, k10);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void n(Function1 function1) {
            long[] jArr;
            long[] jArr2;
            long j10;
            char c10;
            long j11;
            int i10;
            p323s.O o10 = this.f11305f;
            long[] jArr3 = o10.f52660a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j12 = jArr3[i11];
                char c11 = 7;
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j12 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            c10 = c11;
                            Object obj = o10.f52661b[i15];
                            j11 = j13;
                            p323s.K k10 = (p323s.K) o10.f52662c[i15];
                            Boolean bool = (Boolean) function1.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = k10.f52640b;
                                int[] iArr = k10.f52641c;
                                long[] jArr4 = k10.f52639a;
                                int i16 = i12;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j10 = j12;
                                    int i17 = 0;
                                    while (true) {
                                        long j14 = jArr4[i17];
                                        long[] jArr5 = jArr4;
                                        if ((((~j14) << c10) & j14 & j11) != j11) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            for (int i19 = 0; i19 < i18; i19++) {
                                                if ((j14 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    Object obj2 = objArr[i20];
                                                    int i21 = iArr[i20];
                                                    m(obj, obj2);
                                                }
                                                j14 >>= i16;
                                            }
                                            if (i18 != i16) {
                                                break;
                                            }
                                            if (i17 != length2) {
                                                break;
                                            }
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        } else if (i17 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j12;
                                }
                            } else {
                                jArr2 = jArr3;
                                j10 = j12;
                            }
                            if (bool.booleanValue()) {
                                o10.v(i15);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            j10 = j12;
                            c10 = c11;
                            j11 = j13;
                            i10 = i12;
                        }
                        i14++;
                        i12 = i10;
                        j12 = j10 >> i10;
                        c11 = c10;
                        j13 = j11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }

        public final void o(I.U u10) {
            long[] jArr;
            p323s.K k10;
            p323s.O o10 = this.f11305f;
            int iHashCode = Long.hashCode(AbstractC1442w.M().i());
            Object objE = this.f11304e.e(u10);
            if (objE == null) {
                return;
            }
            if (!(objE instanceof p323s.P)) {
                p323s.K k11 = (p323s.K) o10.e(objE);
                if (k11 == null) {
                    k11 = new p323s.K(0, 1, null);
                    o10.x(objE, k11);
                    Unit unit = Unit.f48228a;
                }
                l(u10, iHashCode, objE, k11);
                return;
            }
            p323s.P p10 = (p323s.P) objE;
            Object[] objArr = p10.f52684b;
            long[] jArr2 = p10.f52683a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            p323s.K k12 = (p323s.K) o10.e(obj);
                            if (k12 == null) {
                                k10 = new p323s.K(0, 1, null);
                                o10.x(obj, k10);
                                Unit unit2 = Unit.f48228a;
                            } else {
                                k10 = k12;
                            }
                            l(u10, iHashCode, obj, k10);
                        }
                        j10 >>= i11;
                        i13++;
                        i11 = i11;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i12 != i11) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                jArr2 = jArr;
            }
        }
    }

    public M(Function1 function1) {
        this.f11289a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set set) {
        Object obj;
        Set setC0;
        do {
            obj = this.f11290b.get();
            if (obj == null) {
                setC0 = set;
            } else if (obj instanceof Set) {
                setC0 = CollectionsKt.o(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new Ad.g();
                }
                setC0 = CollectionsKt.C0((Collection) obj, CollectionsKt.e(set));
            }
        } while (!p359u.G.a(this.f11290b, obj, setC0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(M m10, Set set, AbstractC1432l abstractC1432l) {
        m10.d(set);
        if (m10.i()) {
            m10.o();
        }
        return Unit.f48228a;
    }

    private final boolean i() {
        boolean z10;
        synchronized (this.f11295g) {
            z10 = this.f11291c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set setM = m();
            if (setM == null) {
                return z11;
            }
            synchronized (this.f11295g) {
                try {
                    K.c cVar = this.f11294f;
                    Object[] objArr = cVar.f5867a;
                    int iL = cVar.l();
                    for (int i10 = 0; i10 < iL; i10++) {
                        z11 = ((a) objArr[i10]).j(setM) || z11;
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final a j(Function1 function1) {
        Object obj;
        K.c cVar = this.f11294f;
        Object[] objArr = cVar.f5867a;
        int iL = cVar.l();
        int i10 = 0;
        while (true) {
            if (i10 >= iL) {
                obj = null;
                break;
            }
            obj = objArr[i10];
            if (((a) obj).f() == function1) {
                break;
            }
            i10++;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.d(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar2 = new a((Function1) kotlin.jvm.internal.K.e(function1, 1));
        this.f11294f.b(aVar2);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(M m10, Object obj) {
        if (!m10.f11297i) {
            synchronized (m10.f11295g) {
                a aVar = m10.f11298j;
                Intrinsics.c(aVar);
                aVar.k(obj);
                Unit unit = Unit.f48228a;
            }
        }
        return Unit.f48228a;
    }

    private final Set m() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f11290b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new Ad.g();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!p359u.G.a(this.f11290b, obj, objSubList));
        return set;
    }

    private final Void n() {
        AbstractC1083w.u("Unexpected notification");
        throw new Ad.g();
    }

    private final void o() {
        this.f11289a.invoke(new L(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(M m10) {
        do {
            synchronized (m10.f11295g) {
                try {
                    if (!m10.f11291c) {
                        m10.f11291c = true;
                        try {
                            K.c cVar = m10.f11294f;
                            Object[] objArr = cVar.f5867a;
                            int iL = cVar.l();
                            for (int i10 = 0; i10 < iL; i10++) {
                                ((a) objArr[i10]).h();
                            }
                            m10.f11291c = false;
                        } catch (Throwable th) {
                            m10.f11291c = false;
                            throw th;
                        }
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (m10.i());
        return Unit.f48228a;
    }

    public final void f() {
        synchronized (this.f11295g) {
            try {
                K.c cVar = this.f11294f;
                Object[] objArr = cVar.f5867a;
                int iL = cVar.l();
                for (int i10 = 0; i10 < iL; i10++) {
                    ((a) objArr[i10]).c();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f11295g) {
            try {
                K.c cVar = this.f11294f;
                int iL = cVar.l();
                int i10 = 0;
                for (int i11 = 0; i11 < iL; i11++) {
                    a aVar = (a) cVar.f5867a[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = cVar.f5867a;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = iL - i10;
                AbstractC3952n.v(cVar.f5867a, null, i12, iL);
                cVar.w(i12);
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Function1 function1) {
        synchronized (this.f11295g) {
            try {
                K.c cVar = this.f11294f;
                int iL = cVar.l();
                int i10 = 0;
                for (int i11 = 0; i11 < iL; i11++) {
                    a aVar = (a) cVar.f5867a[i11];
                    aVar.n(function1);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = cVar.f5867a;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = iL - i10;
                AbstractC3952n.v(cVar.f5867a, null, i12, iL);
                cVar.w(i12);
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Object obj, Function1 function1, Function0 function0) {
        a aVarJ;
        synchronized (this.f11295g) {
            aVarJ = j(function1);
        }
        boolean z10 = this.f11297i;
        a aVar = this.f11298j;
        long j10 = this.f11299k;
        if (j10 != -1) {
            if (!(j10 == Q.v.a())) {
                T0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + Q.v.a() + ", name=" + Q.v.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f11297i = false;
            this.f11298j = aVarJ;
            this.f11299k = Q.v.a();
            aVarJ.i(obj, this.f11293e, function0);
        } finally {
            this.f11298j = aVar;
            this.f11297i = z10;
            this.f11299k = j10;
        }
    }

    public final void q() {
        this.f11296h = AbstractC1432l.f11377e.h(this.f11292d);
    }

    public final void r() {
        InterfaceC1427g interfaceC1427g = this.f11296h;
        if (interfaceC1427g != null) {
            interfaceC1427g.dispose();
        }
    }
}
