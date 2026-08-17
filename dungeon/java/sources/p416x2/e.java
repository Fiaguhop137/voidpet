package p416x2;

import U1.AbstractC1459a;
import U1.S;
import java.util.Arrays;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.K;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f57339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f57340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f57343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f57345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f57346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f57347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f57348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f57349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f57350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f57351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f57352n;

    public e(int i10, d dVar, O o10) {
        this.f57339a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        AbstractC1459a.a(z10);
        this.f57341c = d(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f57343e = dVar.a();
        this.f57340b = o10;
        this.f57342d = iB == 2 ? d(i10, 1650720768) : -1;
        this.f57350l = -1L;
        this.f57351m = new long[512];
        this.f57352n = new int[512];
        this.f57344f = dVar.f57336e;
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f57343e * ((long) i10)) / ((long) this.f57344f);
    }

    private K h(int i10) {
        return new K(((long) this.f57352n[i10]) * g(), this.f57351m[i10]);
    }

    public void a() {
        this.f57347i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f57350l == -1) {
            this.f57350l = j10;
        }
        if (z10) {
            if (this.f57349k == this.f57352n.length) {
                long[] jArr = this.f57351m;
                this.f57351m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f57352n;
                this.f57352n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f57351m;
            int i10 = this.f57349k;
            jArr2[i10] = j10;
            this.f57352n[i10] = this.f57348j;
            this.f57349k = i10 + 1;
        }
        this.f57348j++;
    }

    public void c() {
        int i10;
        this.f57351m = Arrays.copyOf(this.f57351m, this.f57349k);
        this.f57352n = Arrays.copyOf(this.f57352n, this.f57349k);
        if (!k() || this.f57339a.f57338g == 0 || (i10 = this.f57349k) <= 0) {
            return;
        }
        this.f57344f = i10;
    }

    public long f() {
        return e(this.f57347i);
    }

    public long g() {
        return e(1);
    }

    public J.a i(long j10) {
        if (this.f57349k == 0) {
            return new J.a(new K(0L, this.f57350l));
        }
        int iG = (int) (j10 / g());
        int iG2 = S.g(this.f57352n, iG, true, true);
        if (this.f57352n[iG2] == iG) {
            return new J.a(h(iG2));
        }
        K kH = h(iG2);
        int i10 = iG2 + 1;
        return i10 < this.f57351m.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f57341c == i10 || this.f57342d == i10;
    }

    public boolean k() {
        return (this.f57341c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f57352n, this.f57347i) >= 0;
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
    public boolean m(InterfaceC4254q interfaceC4254q) {
        int i10 = this.f57346h;
        int iA = i10 - this.f57340b.a(interfaceC4254q, i10, false);
        this.f57346h = iA;
        boolean z10 = iA == 0;
        if (z10) {
            if (this.f57345g > 0) {
                this.f57340b.c(f(), l() ? 1 : 0, this.f57345g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f57345g = i10;
        this.f57346h = i10;
    }

    public void o(long j10) {
        if (this.f57349k == 0) {
            this.f57347i = 0;
        } else {
            this.f57347i = this.f57352n[S.h(this.f57351m, j10, true, true)];
        }
    }
}
