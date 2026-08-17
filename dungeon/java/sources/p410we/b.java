package p410we;

import Be.j;
import p374ue.k;
import p374ue.l;
import p374ue.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0730b f56856A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0730b f56857B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0730b f56858C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0730b f56859D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0730b f56860E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0730b f56861F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0730b f56862G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0730b f56863H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0730b f56864I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0730b f56865J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0730b f56866K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0730b f56867L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0730b f56868M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0730b f56869N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0730b f56870O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0730b f56871P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0730b f56872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0730b f56873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0730b f56874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f56875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f56876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f56877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0730b f56878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0730b f56879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0730b f56880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0730b f56881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0730b f56882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0730b f56883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0730b f56884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0730b f56885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0730b f56886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f56887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0730b f56888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0730b f56889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0730b f56890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0730b f56891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0730b f56892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0730b f56893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0730b f56894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0730b f56895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0730b f56896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0730b f56897z;

    /* JADX INFO: renamed from: we.b$b, reason: collision with other inner class name */
    public static class C0730b extends d {
        public C0730b(int i10) {
            super(i10, 1, null);
        }

        @Override // we.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f56899a)) != 0);
        }

        @Override // we.b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f56899a;
            }
            return 0;
        }
    }

    private static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j.a[] f56898c;

        public c(int i10, j.a[] aVarArr) {
            super(i10, g(aVarArr), null);
            this.f56898c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // we.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public j.a d(int i10) {
            int i11 = (1 << this.f56900b) - 1;
            int i12 = this.f56899a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (j.a aVar : this.f56898c) {
                if (aVar.getNumber() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // we.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(j.a aVar) {
            return aVar.getNumber() << this.f56899a;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56900b;

        private d(int i10, int i11) {
            this.f56899a = i10;
            this.f56900b = i11;
        }

        /* synthetic */ d(int i10, int i11, a aVar) {
            this(i10, i11);
        }

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f56899a + dVar.f56900b, aVarArr);
        }

        public static C0730b b(d dVar) {
            return new C0730b(dVar.f56899a + dVar.f56900b);
        }

        public static C0730b c() {
            return new C0730b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);
    }

    static {
        C0730b c0730bC = d.c();
        f56872a = c0730bC;
        f56873b = d.b(c0730bC);
        C0730b c0730bC2 = d.c();
        f56874c = c0730bC2;
        d dVarA = d.a(c0730bC2, y.values());
        f56875d = dVarA;
        d dVarA2 = d.a(dVarA, l.values());
        f56876e = dVarA2;
        d dVarA3 = d.a(dVarA2, p374ue.c.EnumC0698c.values());
        f56877f = dVarA3;
        C0730b c0730bB = d.b(dVarA3);
        f56878g = c0730bB;
        C0730b c0730bB2 = d.b(c0730bB);
        f56879h = c0730bB2;
        C0730b c0730bB3 = d.b(c0730bB2);
        f56880i = c0730bB3;
        C0730b c0730bB4 = d.b(c0730bB3);
        f56881j = c0730bB4;
        C0730b c0730bB5 = d.b(c0730bB4);
        f56882k = c0730bB5;
        C0730b c0730bB6 = d.b(c0730bB5);
        f56883l = c0730bB6;
        f56884m = d.b(c0730bB6);
        C0730b c0730bB7 = d.b(dVarA);
        f56885n = c0730bB7;
        f56886o = d.b(c0730bB7);
        d dVarA4 = d.a(dVarA2, k.values());
        f56887p = dVarA4;
        C0730b c0730bB8 = d.b(dVarA4);
        f56888q = c0730bB8;
        C0730b c0730bB9 = d.b(c0730bB8);
        f56889r = c0730bB9;
        C0730b c0730bB10 = d.b(c0730bB9);
        f56890s = c0730bB10;
        C0730b c0730bB11 = d.b(c0730bB10);
        f56891t = c0730bB11;
        C0730b c0730bB12 = d.b(c0730bB11);
        f56892u = c0730bB12;
        C0730b c0730bB13 = d.b(c0730bB12);
        f56893v = c0730bB13;
        C0730b c0730bB14 = d.b(c0730bB13);
        f56894w = c0730bB14;
        f56895x = d.b(c0730bB14);
        C0730b c0730bB15 = d.b(dVarA4);
        f56896y = c0730bB15;
        C0730b c0730bB16 = d.b(c0730bB15);
        f56897z = c0730bB16;
        C0730b c0730bB17 = d.b(c0730bB16);
        f56856A = c0730bB17;
        C0730b c0730bB18 = d.b(c0730bB17);
        f56857B = c0730bB18;
        C0730b c0730bB19 = d.b(c0730bB18);
        f56858C = c0730bB19;
        C0730b c0730bB20 = d.b(c0730bB19);
        f56859D = c0730bB20;
        C0730b c0730bB21 = d.b(c0730bB20);
        f56860E = c0730bB21;
        C0730b c0730bB22 = d.b(c0730bB21);
        f56861F = c0730bB22;
        f56862G = d.b(c0730bB22);
        C0730b c0730bB23 = d.b(c0730bC2);
        f56863H = c0730bB23;
        C0730b c0730bB24 = d.b(c0730bB23);
        f56864I = c0730bB24;
        f56865J = d.b(c0730bB24);
        C0730b c0730bB25 = d.b(dVarA2);
        f56866K = c0730bB25;
        C0730b c0730bB26 = d.b(c0730bB25);
        f56867L = c0730bB26;
        f56868M = d.b(c0730bB26);
        C0730b c0730bC3 = d.c();
        f56869N = c0730bC3;
        f56870O = d.b(c0730bC3);
        f56871P = d.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "modality";
        } else if (i10 == 2) {
            objArr[0] = "kind";
        } else if (i10 == 5) {
            objArr[0] = "modality";
        } else if (i10 == 6) {
            objArr[0] = "memberKind";
        } else if (i10 == 8) {
            objArr[0] = "modality";
        } else if (i10 == 9) {
            objArr[0] = "memberKind";
        } else if (i10 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z10, y yVar, l lVar, boolean z11, boolean z12, boolean z13) {
        if (yVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return f56874c.e(Boolean.valueOf(z10)) | f56876e.e(lVar) | f56875d.e(yVar) | f56866K.e(Boolean.valueOf(z11)) | f56867L.e(Boolean.valueOf(z12)) | f56868M.e(Boolean.valueOf(z13));
    }
}
