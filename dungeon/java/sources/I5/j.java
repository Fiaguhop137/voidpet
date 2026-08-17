package I5;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f5010A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f5011B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f5012C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f5013D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f5014E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5015F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Throwable f5016G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f5017H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n f5018I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f5019J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f5020K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private b.a f5021L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f5022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f5023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f5024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f5025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f5026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f5027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f5028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f5029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f5027x = -1L;
        this.f5028y = -1L;
        this.f5029z = -1L;
        this.f5010A = -1L;
        this.f5011B = -1L;
        this.f5012C = -1L;
        this.f5014E = -1;
        this.f5015F = -1;
        this.f5017H = e.UNKNOWN;
        this.f5018I = n.UNKNOWN;
        this.f5019J = -1L;
        this.f5020K = -1L;
    }

    public final void A(long j10) {
        this.f5029z = j10;
    }

    public final void B(String str) {
        this.f5022s = str;
    }

    public final void C(long j10) {
        this.f5028y = j10;
    }

    public final void D(long j10) {
        this.f5027x = j10;
    }

    public final void E(Throwable th) {
        this.f5016G = th;
    }

    public final void F(b.a aVar) {
        this.f5021L = aVar;
    }

    public final void G(Object obj) {
        this.f5026w = obj;
    }

    public final void H(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f5017H = eVar;
    }

    public final void I(Object obj) {
        this.f5024u = obj;
    }

    public final void J(long j10) {
        this.f5012C = j10;
    }

    public final void K(long j10) {
        this.f5011B = j10;
    }

    public final void L(long j10) {
        this.f5020K = j10;
    }

    public final void M(int i10) {
        this.f5015F = i10;
    }

    public final void N(int i10) {
        this.f5014E = i10;
    }

    public final void O(boolean z10) {
        this.f5013D = z10;
    }

    public final void P(String str) {
        this.f5023t = str;
    }

    public final void Q(long j10) {
        this.f5019J = j10;
    }

    public final void R(boolean z10) {
        this.f5018I = z10 ? n.VISIBLE : n.INVISIBLE;
    }

    public final f S() {
        return new f(j(), this.f5022s, this.f5023t, this.f5024u, this.f5025v, this.f5026w, this.f5027x, this.f5028y, this.f5029z, this.f5010A, this.f5011B, this.f5012C, f(), n(), this.f5013D, this.f5014E, this.f5015F, this.f5016G, this.f5018I, this.f5019J, this.f5020K, null, this.f5021L, a(), o(), c(), d(), b(), r(), q(), l(), p(), CollectionsKt.U0(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f5023t = null;
        this.f5024u = null;
        this.f5025v = null;
        this.f5026w = null;
        this.f5013D = false;
        this.f5014E = -1;
        this.f5015F = -1;
        this.f5016G = null;
        this.f5017H = e.UNKNOWN;
        this.f5018I = n.UNKNOWN;
        this.f5021L = null;
        x();
        s();
    }

    public final void x() {
        this.f5011B = -1L;
        this.f5012C = -1L;
        this.f5027x = -1L;
        this.f5029z = -1L;
        this.f5010A = -1L;
        this.f5019J = -1L;
        this.f5020K = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f5025v = obj;
    }

    public final void z(long j10) {
        this.f5010A = j10;
    }
}
