package p359u;

import I.A0;
import I.X1;
import I.d2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4212k implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f54890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0 f54891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC4218q f54892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f54894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54895f;

    public C4212k(X x10, Object obj, AbstractC4218q abstractC4218q, long j10, long j11, boolean z10) {
        AbstractC4218q abstractC4218qE;
        this.f54890a = x10;
        this.f54891b = X1.d(obj, null, 2, null);
        this.f54892c = (abstractC4218q == null || (abstractC4218qE = r.e(abstractC4218q)) == null) ? AbstractC4213l.c(x10, obj) : abstractC4218qE;
        this.f54893d = j10;
        this.f54894e = j11;
        this.f54895f = z10;
    }

    public /* synthetic */ C4212k(X x10, Object obj, AbstractC4218q abstractC4218q, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x10, obj, (i10 & 4) != 0 ? null : abstractC4218q, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }

    public final long a() {
        return this.f54894e;
    }

    public final long b() {
        return this.f54893d;
    }

    public final X c() {
        return this.f54890a;
    }

    public final Object d() {
        return this.f54890a.b().invoke(this.f54892c);
    }

    public final AbstractC4218q e() {
        return this.f54892c;
    }

    public final boolean g() {
        return this.f54895f;
    }

    @Override // I.d2
    public Object getValue() {
        return this.f54891b.getValue();
    }

    public final void h(long j10) {
        this.f54894e = j10;
    }

    public final void i(long j10) {
        this.f54893d = j10;
    }

    public final void n(boolean z10) {
        this.f54895f = z10;
    }

    public void p(Object obj) {
        this.f54891b.setValue(obj);
    }

    public final void s(AbstractC4218q abstractC4218q) {
        this.f54892c = abstractC4218q;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + d() + ", isRunning=" + this.f54895f + ", lastFrameTimeNanos=" + this.f54893d + ", finishedTimeNanos=" + this.f54894e + ')';
    }
}
