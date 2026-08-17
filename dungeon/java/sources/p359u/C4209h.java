package p359u;

import I.A0;
import I.X1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: u.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4209h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f54881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function0 f54884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A0 f54885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC4218q f54886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54888h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A0 f54889i;

    public C4209h(Object obj, X x10, AbstractC4218q abstractC4218q, long j10, Object obj2, long j11, boolean z10, Function0 function0) {
        this.f54881a = x10;
        this.f54882b = obj2;
        this.f54883c = j11;
        this.f54884d = function0;
        this.f54885e = X1.d(obj, null, 2, null);
        this.f54886f = r.e(abstractC4218q);
        this.f54887g = j10;
        this.f54889i = X1.d(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        j(false);
        this.f54884d.invoke();
    }

    public final long b() {
        return this.f54888h;
    }

    public final long c() {
        return this.f54887g;
    }

    public final long d() {
        return this.f54883c;
    }

    public final Object e() {
        return this.f54885e.getValue();
    }

    public final AbstractC4218q f() {
        return this.f54886f;
    }

    public final boolean g() {
        return ((Boolean) this.f54889i.getValue()).booleanValue();
    }

    public final void h(long j10) {
        this.f54888h = j10;
    }

    public final void i(long j10) {
        this.f54887g = j10;
    }

    public final void j(boolean z10) {
        this.f54889i.setValue(Boolean.valueOf(z10));
    }

    public final void k(Object obj) {
        this.f54885e.setValue(obj);
    }

    public final void l(AbstractC4218q abstractC4218q) {
        this.f54886f = abstractC4218q;
    }
}
