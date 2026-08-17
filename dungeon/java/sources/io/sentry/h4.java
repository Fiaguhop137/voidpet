package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends T3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final io.sentry.protocol.H f45883t = io.sentry.protocol.H.CUSTOM;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f45884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.H f45885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g4 f45886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f45887s;

    public h4(io.sentry.protocol.x xVar, Y3 y10, Y3 y11, g4 g4Var, C3692d c3692d) {
        super(xVar, y10, "default", y11, null);
        this.f45887s = false;
        this.f45884p = "<unlabeled transaction>";
        this.f45886r = g4Var;
        this.f45885q = f45883t;
        this.f44494m = io.sentry.util.H.d(c3692d, g4Var);
    }

    public h4(String str, io.sentry.protocol.H h10, String str2) {
        this(str, h10, str2, null);
    }

    public h4(String str, io.sentry.protocol.H h10, String str2, g4 g4Var) {
        super(str2);
        this.f45887s = false;
        this.f45884p = (String) io.sentry.util.w.c(str, "name is required");
        this.f45885q = h10;
        u(g4Var);
        this.f44494m = io.sentry.util.H.d(null, g4Var);
    }

    public h4(String str, String str2) {
        this(str, str2, (g4) null);
    }

    public h4(String str, String str2, g4 g4Var) {
        this(str, io.sentry.protocol.H.CUSTOM, str2, g4Var);
    }

    public static h4 x(C3821x1 c3821x1) {
        Boolean boolF = c3821x1.f();
        C3692d c3692dA = c3821x1.a();
        return new h4(c3821x1.e(), c3821x1.d(), c3821x1.b(), boolF == null ? null : new g4(boolF, c3692dA.j(), c3821x1.c()), c3692dA);
    }

    public io.sentry.protocol.H A() {
        return this.f45885q;
    }

    public void B(boolean z10) {
        this.f45887s = z10;
    }

    public String y() {
        return this.f45884p;
    }

    public g4 z() {
        return this.f45886r;
    }
}
