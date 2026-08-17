package C0;

import F0.AbstractC0974h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements C0819d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.o f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F0.r f1074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0.p f1075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F0.q f1076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0974h f1077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f1079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final M0.a f1080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final M0.p f1081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I0.e f1082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f1083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final M0.j f1084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p037c0.w0 f1085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p073e0.g f1086o;

    private G0(long j10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar) {
        this(M0.o.f6752a.b(j10), j11, rVar, pVar, qVar, abstractC0974h, str, j12, aVar, pVar2, eVar, j13, jVar, w0Var, d10, gVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ G0(long j10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jE = (i10 & 1) != 0 ? p037c0.Z.f26696b.e() : j10;
        long jA = (i10 & 2) != 0 ? O0.v.f8297b.a() : j11;
        F0.r rVar2 = (i10 & 4) != 0 ? null : rVar;
        F0.p pVar3 = (i10 & 8) != 0 ? null : pVar;
        F0.q qVar2 = (i10 & 16) != 0 ? null : qVar;
        AbstractC0974h abstractC0974h2 = (i10 & 32) != 0 ? null : abstractC0974h;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jA2 = (i10 & 128) != 0 ? O0.v.f8297b.a() : j12;
        M0.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        M0.p pVar4 = (i10 & 512) != 0 ? null : pVar2;
        I0.e eVar2 = (i10 & 1024) != 0 ? null : eVar;
        long jE2 = (i10 & 2048) != 0 ? p037c0.Z.f26696b.e() : j13;
        M0.j jVar2 = (i10 & 4096) != 0 ? null : jVar;
        long j14 = jE;
        p037c0.w0 w0Var2 = (i10 & 8192) != 0 ? null : w0Var;
        F0.p pVar5 = pVar3;
        F0.q qVar3 = qVar2;
        AbstractC0974h abstractC0974h3 = abstractC0974h2;
        String str3 = str2;
        long j15 = jA2;
        M0.a aVar3 = aVar2;
        M0.p pVar6 = pVar4;
        I0.e eVar3 = eVar2;
        long j16 = jE2;
        this(j14, jA, rVar2, pVar5, qVar3, abstractC0974h3, str3, j15, aVar3, pVar6, eVar3, j16, jVar2, w0Var2, (i10 & 16384) != 0 ? null : d10, (i10 & 32768) != 0 ? null : gVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ G0(long j10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, rVar, pVar, qVar, abstractC0974h, str, j12, aVar, pVar2, eVar, j13, jVar, w0Var, d10, gVar);
    }

    private G0(M0.o oVar, long j10, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j11, M0.a aVar, M0.p pVar2, I0.e eVar, long j12, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar) {
        this.f1072a = oVar;
        this.f1073b = j10;
        this.f1074c = rVar;
        this.f1075d = pVar;
        this.f1076e = qVar;
        this.f1077f = abstractC0974h;
        this.f1078g = str;
        this.f1079h = j11;
        this.f1080i = aVar;
        this.f1081j = pVar2;
        this.f1082k = eVar;
        this.f1083l = j12;
        this.f1084m = jVar;
        this.f1085n = w0Var;
        this.f1086o = gVar;
    }

    public /* synthetic */ G0(M0.o oVar, long j10, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j11, M0.a aVar, M0.p pVar2, I0.e eVar, long j12, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, j10, rVar, pVar, qVar, abstractC0974h, str, j11, aVar, pVar2, eVar, j12, jVar, w0Var, d10, gVar);
    }

    public static /* synthetic */ G0 b(G0 g10, long j10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar, int i10, Object obj) {
        D d11;
        long jG = (i10 & 1) != 0 ? g10.g() : j10;
        long j14 = (i10 & 2) != 0 ? g10.f1073b : j11;
        F0.r rVar2 = (i10 & 4) != 0 ? g10.f1074c : rVar;
        F0.p pVar3 = (i10 & 8) != 0 ? g10.f1075d : pVar;
        F0.q qVar2 = (i10 & 16) != 0 ? g10.f1076e : qVar;
        AbstractC0974h abstractC0974h2 = (i10 & 32) != 0 ? g10.f1077f : abstractC0974h;
        String str2 = (i10 & 64) != 0 ? g10.f1078g : str;
        long j15 = (i10 & 128) != 0 ? g10.f1079h : j12;
        M0.a aVar2 = (i10 & 256) != 0 ? g10.f1080i : aVar;
        M0.p pVar4 = (i10 & 512) != 0 ? g10.f1081j : pVar2;
        I0.e eVar2 = (i10 & 1024) != 0 ? g10.f1082k : eVar;
        long j16 = jG;
        long j17 = (i10 & 2048) != 0 ? g10.f1083l : j13;
        M0.j jVar2 = (i10 & 4096) != 0 ? g10.f1084m : jVar;
        p037c0.w0 w0Var2 = (i10 & 8192) != 0 ? g10.f1085n : w0Var;
        M0.j jVar3 = jVar2;
        if ((i10 & 16384) != 0) {
            g10.getClass();
            d11 = null;
        } else {
            d11 = d10;
        }
        return g10.a(j16, j14, rVar2, pVar3, qVar2, abstractC0974h2, str2, j15, aVar2, pVar4, eVar2, j17, jVar3, w0Var2, d11, (i10 & 32768) != 0 ? g10.f1086o : gVar);
    }

    public final G0 a(long j10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar) {
        return new G0(p037c0.Z.m(j10, g()) ? this.f1072a : M0.o.f6752a.b(j10), j11, rVar, pVar, qVar, abstractC0974h, str, j12, aVar, pVar2, eVar, j13, jVar, w0Var, d10, gVar, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f1072a.a();
    }

    public final long d() {
        return this.f1083l;
    }

    public final M0.a e() {
        return this.f1080i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g10 = (G0) obj;
        return v(g10) && w(g10);
    }

    public final p037c0.P f() {
        return this.f1072a.l();
    }

    public final long g() {
        return this.f1072a.e();
    }

    public final p073e0.g h() {
        return this.f1086o;
    }

    public int hashCode() {
        int iS = p037c0.Z.s(g()) * 31;
        p037c0.P pF = f();
        int iHashCode = (((((iS + (pF != null ? pF.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + O0.v.i(this.f1073b)) * 31;
        F0.r rVar = this.f1074c;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        F0.p pVar = this.f1075d;
        int iG = (iHashCode2 + (pVar != null ? F0.p.g(pVar.i()) : 0)) * 31;
        F0.q qVar = this.f1076e;
        int iF = (iG + (qVar != null ? F0.q.f(qVar.h()) : 0)) * 31;
        AbstractC0974h abstractC0974h = this.f1077f;
        int iHashCode3 = (iF + (abstractC0974h != null ? abstractC0974h.hashCode() : 0)) * 31;
        String str = this.f1078g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + O0.v.i(this.f1079h)) * 31;
        M0.a aVar = this.f1080i;
        int iF2 = (iHashCode4 + (aVar != null ? M0.a.f(aVar.h()) : 0)) * 31;
        M0.p pVar2 = this.f1081j;
        int iHashCode5 = (iF2 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        I0.e eVar = this.f1082k;
        int iHashCode6 = (((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + p037c0.Z.s(this.f1083l)) * 31;
        M0.j jVar = this.f1084m;
        int iHashCode7 = (iHashCode6 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        p037c0.w0 w0Var = this.f1085n;
        int iHashCode8 = (iHashCode7 + (w0Var != null ? w0Var.hashCode() : 0)) * 961;
        p073e0.g gVar = this.f1086o;
        return iHashCode8 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final AbstractC0974h i() {
        return this.f1077f;
    }

    public final String j() {
        return this.f1078g;
    }

    public final long k() {
        return this.f1073b;
    }

    public final F0.p l() {
        return this.f1075d;
    }

    public final F0.q m() {
        return this.f1076e;
    }

    public final F0.r n() {
        return this.f1074c;
    }

    public final long o() {
        return this.f1079h;
    }

    public final I0.e p() {
        return this.f1082k;
    }

    public final D q() {
        return null;
    }

    public final p037c0.w0 r() {
        return this.f1085n;
    }

    public final M0.j s() {
        return this.f1084m;
    }

    public final M0.o t() {
        return this.f1072a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) p037c0.Z.t(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) O0.v.j(this.f1073b)) + ", fontWeight=" + this.f1074c + ", fontStyle=" + this.f1075d + ", fontSynthesis=" + this.f1076e + ", fontFamily=" + this.f1077f + ", fontFeatureSettings=" + this.f1078g + ", letterSpacing=" + ((Object) O0.v.j(this.f1079h)) + ", baselineShift=" + this.f1080i + ", textGeometricTransform=" + this.f1081j + ", localeList=" + this.f1082k + ", background=" + ((Object) p037c0.Z.t(this.f1083l)) + ", textDecoration=" + this.f1084m + ", shadow=" + this.f1085n + ", platformStyle=" + ((Object) null) + ", drawStyle=" + this.f1086o + ')';
    }

    public final M0.p u() {
        return this.f1081j;
    }

    public final boolean v(G0 g10) {
        if (this == g10) {
            return true;
        }
        return O0.v.e(this.f1073b, g10.f1073b) && Intrinsics.b(this.f1074c, g10.f1074c) && Intrinsics.b(this.f1075d, g10.f1075d) && Intrinsics.b(this.f1076e, g10.f1076e) && Intrinsics.b(this.f1077f, g10.f1077f) && Intrinsics.b(this.f1078g, g10.f1078g) && O0.v.e(this.f1079h, g10.f1079h) && Intrinsics.b(this.f1080i, g10.f1080i) && Intrinsics.b(this.f1081j, g10.f1081j) && Intrinsics.b(this.f1082k, g10.f1082k) && p037c0.Z.m(this.f1083l, g10.f1083l) && Intrinsics.b(null, null);
    }

    public final boolean w(G0 g10) {
        return Intrinsics.b(this.f1072a, g10.f1072a) && Intrinsics.b(this.f1084m, g10.f1084m) && Intrinsics.b(this.f1085n, g10.f1085n) && Intrinsics.b(this.f1086o, g10.f1086o);
    }

    public final G0 x(G0 g10) {
        return g10 == null ? this : I0.b(this, g10.f1072a.e(), g10.f1072a.l(), g10.f1072a.a(), g10.f1073b, g10.f1074c, g10.f1075d, g10.f1076e, g10.f1077f, g10.f1078g, g10.f1079h, g10.f1080i, g10.f1081j, g10.f1082k, g10.f1083l, g10.f1084m, g10.f1085n, null, g10.f1086o);
    }
}
