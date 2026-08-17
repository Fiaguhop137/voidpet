package Z1;

import U1.AbstractC1459a;
import U1.InterfaceC1466h;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1466h f18462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R1.F f18463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f18465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f18466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18468i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18469j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18473n;

    public interface a {
        void e(r1 r1Var);
    }

    public interface b {
        void u(int i10, Object obj);
    }

    public r1(a aVar, b bVar, R1.F f10, int i10, InterfaceC1466h interfaceC1466h, Looper looper) {
        this.f18461b = aVar;
        this.f18460a = bVar;
        this.f18463d = f10;
        this.f18466g = looper;
        this.f18462c = interfaceC1466h;
        this.f18467h = i10;
    }

    public boolean a() {
        return this.f18469j;
    }

    public Looper b() {
        return this.f18466g;
    }

    public int c() {
        return this.f18467h;
    }

    public Object d() {
        return this.f18465f;
    }

    public long e() {
        return this.f18468i;
    }

    public b f() {
        return this.f18460a;
    }

    public R1.F g() {
        return this.f18463d;
    }

    public int h() {
        return this.f18464e;
    }

    public synchronized boolean i() {
        return this.f18473n;
    }

    public synchronized void j(boolean z10) {
        this.f18471l = z10 | this.f18471l;
        this.f18472m = true;
        notifyAll();
    }

    public r1 k() {
        AbstractC1459a.g(!this.f18470k);
        if (this.f18468i == -9223372036854775807L) {
            AbstractC1459a.a(this.f18469j);
        }
        this.f18470k = true;
        this.f18461b.e(this);
        return this;
    }

    public r1 l(Object obj) {
        AbstractC1459a.g(!this.f18470k);
        this.f18465f = obj;
        return this;
    }

    public r1 m(int i10) {
        AbstractC1459a.g(!this.f18470k);
        this.f18464e = i10;
        return this;
    }
}
