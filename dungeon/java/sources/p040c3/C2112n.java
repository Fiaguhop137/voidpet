package p040c3;

import R1.r;
import U1.AbstractC1459a;
import U1.F;
import U1.S;
import V1.h;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p380v2.O;

/* JADX INFO: renamed from: c3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2112n implements InterfaceC2111m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f26964r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O f26966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f26967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f26969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f26970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f26971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f26972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f26976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f26977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f26978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26981q;

    /* JADX INFO: renamed from: c3.n$a */
    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f26982e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f26986d;

        public a(int i10) {
            this.f26986d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f26983a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f26986d;
                int length = bArr2.length;
                int i13 = this.f26984b;
                if (length < i13 + i12) {
                    this.f26986d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f26986d, this.f26984b, i12);
                this.f26984b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f26983a) {
                int i12 = this.f26984b - i11;
                this.f26984b = i12;
                if (this.f26985c != 0 || i10 != 181) {
                    this.f26983a = false;
                    return true;
                }
                this.f26985c = i12;
            } else if (i10 == 179) {
                this.f26983a = true;
            }
            byte[] bArr = f26982e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f26983a = false;
            this.f26984b = 0;
            this.f26985c = 0;
        }
    }

    C2112n(O o10, String str) {
        this.f26967c = o10;
        this.f26968d = str;
        this.f26971g = new boolean[4];
        this.f26972h = new a(128);
        if (o10 != null) {
            this.f26970f = new w(178, 128);
            this.f26969e = new F();
        } else {
            this.f26970f = null;
            this.f26969e = null;
        }
        this.f26977m = -9223372036854775807L;
        this.f26979o = -9223372036854775807L;
    }

    public C2112n(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static Pair b(a aVar, String str, String str2) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f26986d, aVar.f26984b);
        int i14 = bArrCopyOf[4] & 255;
        byte b10 = bArrCopyOf[5];
        int i15 = (i14 << 4) | ((b10 & 255) >> 4);
        int i16 = ((b10 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i17 = (bArrCopyOf[7] & 240) >> 4;
        if (i17 == 2) {
            f10 = i16 * 4;
            i10 = i15 * 3;
        } else {
            if (i17 != 3) {
                if (i17 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i16 * 121;
                    i10 = i15 * 100;
                }
                r rVarP = new r.b().j0(str).W(str2).y0("video/mpeg2").F0(i15).h0(i16).u0(f11).k0(Collections.singletonList(bArrCopyOf)).P();
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f26964r;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[aVar.f26985c + 9];
                        i12 = (b11 & 96) >> 5;
                        i13 = b11 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(rVarP, Long.valueOf(j10));
            }
            f10 = i16 * 16;
            i10 = i15 * 9;
        }
        f11 = f10 / i10;
        r rVarP2 = new r.b().j0(str).W(str2).y0("video/mpeg2").F0(i15).h0(i16).u0(f11).k0(Collections.singletonList(bArrCopyOf)).P();
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f26964r;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[aVar.f26985c + 9];
                i12 = (b12 & 96) >> 5;
                i13 = b12 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(rVarP2, Long.valueOf(j10));
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        h.c(this.f26971g);
        this.f26972h.c();
        w wVar = this.f26970f;
        if (wVar != null) {
            wVar.d();
        }
        this.f26973i = 0L;
        this.f26974j = false;
        this.f26977m = -9223372036854775807L;
        this.f26979o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p040c3.InterfaceC2111m
    public void c(F f10) {
        boolean z10;
        int i10;
        AbstractC1459a.i(this.f26966b);
        int iG = f10.g();
        int iJ = f10.j();
        byte[] bArrF = f10.f();
        this.f26973i += (long) f10.a();
        this.f26966b.f(f10, f10.a());
        while (true) {
            int iE = h.e(bArrF, iG, iJ, this.f26971g);
            if (iE == iJ) {
                break;
            }
            int i11 = iE + 3;
            int i12 = f10.f()[i11] & 255;
            int i13 = iE - iG;
            if (!this.f26975k) {
                if (i13 > 0) {
                    this.f26972h.a(bArrF, iG, iE);
                }
                if (this.f26972h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair pairB = b(this.f26972h, (String) AbstractC1459a.e(this.f26965a), this.f26968d);
                    this.f26966b.b((r) pairB.first);
                    this.f26976l = ((Long) pairB.second).longValue();
                    this.f26975k = true;
                }
            }
            w wVar = this.f26970f;
            if (wVar != null) {
                if (i13 > 0) {
                    wVar.a(bArrF, iG, iE);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f26970f.b(i10)) {
                    w wVar2 = this.f26970f;
                    ((F) S.i(this.f26969e)).Y(this.f26970f.f27169d, h.L(wVar2.f27169d, wVar2.f27170e));
                    ((O) S.i(this.f26967c)).b(this.f26979o, this.f26969e);
                }
                if (i12 == 178 && f10.f()[iE + 2] == 1) {
                    this.f26970f.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iJ - iE;
                if (this.f26981q && this.f26975k) {
                    long j10 = this.f26979o;
                    if (j10 != -9223372036854775807L) {
                        this.f26966b.c(j10, this.f26980p ? 1 : 0, ((int) (this.f26973i - this.f26978n)) - i14, i14, null);
                    }
                }
                if (!this.f26974j || this.f26981q) {
                    this.f26978n = this.f26973i - ((long) i14);
                    long j11 = this.f26977m;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f26979o;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f26976l : -9223372036854775807L;
                    }
                    this.f26979o = j11;
                    this.f26980p = false;
                    this.f26977m = -9223372036854775807L;
                    z10 = true;
                    this.f26974j = true;
                } else {
                    z10 = true;
                }
                this.f26981q = i12 == 0 ? z10 : false;
            } else {
                if (i12 == 184) {
                    this.f26980p = true;
                }
                iJ = iJ;
            }
            iJ = iJ;
            iG = i11;
        }
        if (!this.f26975k) {
            this.f26972h.a(bArrF, iG, iJ);
        }
        w wVar3 = this.f26970f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
        AbstractC1459a.i(this.f26966b);
        if (z10) {
            boolean z11 = this.f26980p;
            this.f26966b.c(this.f26979o, z11 ? 1 : 0, (int) (this.f26973i - this.f26978n), 0, null);
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void e(p380v2.r rVar, L.d dVar) {
        dVar.a();
        this.f26965a = dVar.b();
        this.f26966b = rVar.f(dVar.c(), 2);
        O o10 = this.f26967c;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        this.f26977m = j10;
    }
}
