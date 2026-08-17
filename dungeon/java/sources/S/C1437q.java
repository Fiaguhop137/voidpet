package S;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: S.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1437q implements Iterable, Nd.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11392e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1437q f11393f = new C1437q(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f11397d;

    /* JADX INFO: renamed from: S.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1437q a() {
            return C1437q.f11393f;
        }
    }

    /* JADX INFO: renamed from: S.q$b */
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f11398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f11401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f11402f;

        b(Ed.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            b bVar2 = C1437q.this.new b(bVar);
            bVar2.f11402f = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.j jVar, Ed.b bVar) {
            return ((b) create(jVar, bVar)).invokeSuspend(Unit.f48228a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: S.C1437q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private C1437q(long j10, long j11, long j12, long[] jArr) {
        this.f11394a = j10;
        this.f11395b = j11;
        this.f11396c = j12;
        this.f11397d = jArr;
    }

    public final C1437q i(C1437q c1437q) {
        C1437q c1437qK;
        C1437q c1437q2 = f11393f;
        if (c1437q == c1437q2) {
            return this;
        }
        if (this == c1437q2) {
            return c1437q2;
        }
        long j10 = c1437q.f11396c;
        long j11 = this.f11396c;
        if (j10 == j11) {
            long[] jArr = c1437q.f11397d;
            long[] jArr2 = this.f11397d;
            if (jArr == jArr2) {
                return new C1437q((~c1437q.f11394a) & this.f11394a, (~c1437q.f11395b) & this.f11395b, j11, jArr2);
            }
        }
        long[] jArr3 = c1437q.f11397d;
        if (jArr3 != null) {
            c1437qK = this;
            for (long j12 : jArr3) {
                c1437qK = c1437qK.k(j12);
            }
        } else {
            c1437qK = this;
        }
        if (c1437q.f11395b != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((c1437q.f11395b & (1 << i10)) != 0) {
                    c1437qK = c1437qK.k(c1437q.f11396c + ((long) i10));
                }
            }
        }
        if (c1437q.f11394a != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((c1437q.f11394a & (1 << i11)) != 0) {
                    c1437qK = c1437qK.k(c1437q.f11396c + ((long) i11) + ((long) 64));
                }
            }
        }
        return c1437qK;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.k.b(new b(null)).iterator();
    }

    public final C1437q k(long j10) {
        long[] jArr;
        int iA;
        long j11 = j10 - this.f11396c;
        long j12 = 0;
        if (Intrinsics.f(j11, j12) >= 0 && Intrinsics.f(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f11395b;
            if ((j14 & j13) != 0) {
                return new C1437q(this.f11394a, j14 & (~j13), this.f11396c, this.f11397d);
            }
        } else if (Intrinsics.f(j11, 64) >= 0 && Intrinsics.f(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f11394a;
            if ((j16 & j15) != 0) {
                return new C1437q(j16 & (~j15), this.f11395b, this.f11396c, this.f11397d);
            }
        } else if (Intrinsics.f(j11, j12) < 0 && (jArr = this.f11397d) != null && (iA = r.a(jArr, j10)) >= 0) {
            return new C1437q(this.f11394a, this.f11395b, this.f11396c, r.e(jArr, iA));
        }
        return this;
    }

    public final boolean n(long j10) {
        long[] jArr;
        long j11 = j10 - this.f11396c;
        long j12 = 0;
        if (Intrinsics.f(j11, j12) >= 0 && Intrinsics.f(j11, 64) < 0) {
            return ((1 << ((int) j11)) & this.f11395b) != 0;
        }
        if (Intrinsics.f(j11, 64) < 0 || Intrinsics.f(j11, 128) >= 0) {
            return Intrinsics.f(j11, j12) <= 0 && (jArr = this.f11397d) != null && r.a(jArr, j10) >= 0;
        }
        return ((1 << (((int) j11) - 64)) & this.f11394a) != 0;
    }

    public final long p(long j10) {
        long[] jArr = this.f11397d;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f11395b;
        if (j11 != 0) {
            return this.f11396c + ((long) Long.numberOfTrailingZeros(j11));
        }
        long j12 = this.f11394a;
        return j12 != 0 ? this.f11396c + ((long) 64) + ((long) Long.numberOfTrailingZeros(j12)) : j10;
    }

    public final C1437q q(C1437q c1437q) {
        C1437q c1437qS;
        C1437q c1437q2 = f11393f;
        if (c1437q == c1437q2) {
            return this;
        }
        if (this == c1437q2) {
            return c1437q;
        }
        long j10 = c1437q.f11396c;
        long j11 = this.f11396c;
        if (j10 == j11) {
            long[] jArr = c1437q.f11397d;
            long[] jArr2 = this.f11397d;
            if (jArr == jArr2) {
                return new C1437q(c1437q.f11394a | this.f11394a, c1437q.f11395b | this.f11395b, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.f11397d == null) {
            long[] jArr3 = this.f11397d;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    c1437q = c1437q.s(j12);
                }
            }
            if (this.f11395b != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f11395b & (1 << i11)) != 0) {
                        c1437q = c1437q.s(this.f11396c + ((long) i11));
                    }
                }
            }
            if (this.f11394a != 0) {
                while (i10 < 64) {
                    if ((this.f11394a & (1 << i10)) != 0) {
                        c1437q = c1437q.s(this.f11396c + ((long) i10) + ((long) 64));
                    }
                    i10++;
                }
            }
            return c1437q;
        }
        long[] jArr4 = c1437q.f11397d;
        if (jArr4 != null) {
            c1437qS = this;
            for (long j13 : jArr4) {
                c1437qS = c1437qS.s(j13);
            }
        } else {
            c1437qS = this;
        }
        if (c1437q.f11395b != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((c1437q.f11395b & (1 << i12)) != 0) {
                    c1437qS = c1437qS.s(c1437q.f11396c + ((long) i12));
                }
            }
        }
        if (c1437q.f11394a != 0) {
            while (i10 < 64) {
                if ((c1437q.f11394a & (1 << i10)) != 0) {
                    c1437qS = c1437qS.s(c1437q.f11396c + ((long) i10) + ((long) 64));
                }
                i10++;
            }
        }
        return c1437qS;
    }

    public final C1437q s(long j10) {
        long j11;
        long j12;
        long[] jArrB;
        long j13 = j10 - this.f11396c;
        long j14 = 0;
        if (Intrinsics.f(j13, j14) < 0 || Intrinsics.f(j13, 64) >= 0) {
            long j15 = 64;
            if (Intrinsics.f(j13, j15) < 0 || Intrinsics.f(j13, 128) >= 0) {
                long j16 = 128;
                if (Intrinsics.f(j13, j16) < 0) {
                    long[] jArr = this.f11397d;
                    if (jArr == null) {
                        return new C1437q(this.f11394a, this.f11395b, this.f11396c, new long[]{j10});
                    }
                    int iA = r.a(jArr, j10);
                    if (iA < 0) {
                        return new C1437q(this.f11394a, this.f11395b, this.f11396c, r.d(jArr, -(iA + 1), j10));
                    }
                } else if (!n(j10)) {
                    long j17 = this.f11394a;
                    long j18 = this.f11395b;
                    long j19 = this.f11396c;
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j15) * j15;
                    if (Intrinsics.f(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j16) + j20;
                    }
                    C1436p c1436p = null;
                    long j22 = j17;
                    while (true) {
                        if (Intrinsics.f(j19, j21) >= 0) {
                            j11 = j18;
                            j12 = j19;
                            break;
                        }
                        if (j18 != 0) {
                            if (c1436p == null) {
                                c1436p = new C1436p(this.f11397d);
                            }
                            int i10 = 0;
                            while (i10 < 64) {
                                long j23 = j18;
                                if ((j18 & (1 << i10)) != 0) {
                                    c1436p.a(((long) i10) + j19);
                                }
                                i10++;
                                j18 = j23;
                            }
                        }
                        if (j22 == 0) {
                            j12 = j21;
                            j11 = 0;
                            break;
                        }
                        j19 += j15;
                        j18 = j22;
                        j22 = 0;
                    }
                    if (c1436p == null || (jArrB = c1436p.b()) == null) {
                        jArrB = this.f11397d;
                    }
                    return new C1437q(j22, j11, j12, jArrB).s(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                long j25 = this.f11394a;
                if ((j25 & j24) == 0) {
                    return new C1437q(j25 | j24, this.f11395b, this.f11396c, this.f11397d);
                }
            }
        } else {
            long j26 = 1 << ((int) j13);
            long j27 = this.f11395b;
            if ((j27 & j26) == 0) {
                return new C1437q(this.f11394a, j27 | j26, this.f11396c, this.f11397d);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb2.append(AbstractC1423c.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
