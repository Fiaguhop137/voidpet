package io.sentry;

import io.sentry.protocol.C3759c;
import io.sentry.protocol.C3767k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class S3 implements InterfaceC3713h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC3750o2 f44461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC3750o2 f44462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T3 f44463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L3 f44464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f44465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3619a0 f44466f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Z3 f44469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private V3 f44470j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44467g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f44468h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f44471k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f44472l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C3759c f44473m = new C3759c();

    S3(L3 l10, InterfaceC3619a0 interfaceC3619a0, T3 t10, Z3 z10, V3 v10) {
        this.f44463c = t10;
        t10.t(z10.a());
        this.f44464d = (L3) io.sentry.util.w.c(l10, "transaction is required");
        this.f44466f = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "Scopes are required");
        this.f44469i = z10;
        this.f44470j = v10;
        AbstractC3750o2 abstractC3750o2C = z10.c();
        if (abstractC3750o2C != null) {
            this.f44461a = abstractC3750o2C;
        } else {
            this.f44461a = interfaceC3619a0.g().getDateProvider().now();
        }
    }

    public S3(h4 h4Var, L3 l10, InterfaceC3619a0 interfaceC3619a0, Z3 z10) {
        T3 t10 = (T3) io.sentry.util.w.c(h4Var, "context is required");
        this.f44463c = t10;
        t10.t(z10.a());
        this.f44464d = (L3) io.sentry.util.w.c(l10, "sentryTracer is required");
        this.f44466f = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "scopes are required");
        this.f44470j = null;
        AbstractC3750o2 abstractC3750o2C = z10.c();
        if (abstractC3750o2C != null) {
            this.f44461a = abstractC3750o2C;
        } else {
            this.f44461a = interfaceC3619a0.g().getDateProvider().now();
        }
        this.f44469i = z10;
    }

    private void K(AbstractC3750o2 abstractC3750o2) {
        this.f44461a = abstractC3750o2;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        for (S3 s10 : this.f44464d.P()) {
            if (s10.x() != null && s10.x().equals(A())) {
                arrayList.add(s10);
            }
        }
        return arrayList;
    }

    public Y3 A() {
        return this.f44463c.m();
    }

    public Map B() {
        return this.f44463c.o();
    }

    public io.sentry.protocol.x C() {
        return this.f44463c.p();
    }

    public Boolean D() {
        return this.f44463c.i();
    }

    void E(V3 v10) {
        this.f44470j = v10;
    }

    public boolean J(AbstractC3750o2 abstractC3750o2) {
        if (this.f44462b == null) {
            return false;
        }
        this.f44462b = abstractC3750o2;
        return true;
    }

    @Override // io.sentry.InterfaceC3713h0
    public boolean a() {
        return this.f44467g;
    }

    @Override // io.sentry.InterfaceC3713h0
    public Boolean b() {
        return this.f44463c.k();
    }

    @Override // io.sentry.InterfaceC3713h0
    public void c() {
        i(this.f44463c.n());
    }

    @Override // io.sentry.InterfaceC3713h0
    public void d(String str) {
        this.f44463c.r(str);
    }

    @Override // io.sentry.InterfaceC3713h0
    public void e(String str, Number number) {
        if (a()) {
            this.f44466f.g().getLogger().c(EnumC3721i3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f44472l.put(str, new C3767k(number, null));
        if (this.f44464d.N() != this) {
            this.f44464d.X(str, number);
        }
    }

    @Override // io.sentry.InterfaceC3713h0
    public String g() {
        return this.f44463c.c();
    }

    @Override // io.sentry.InterfaceC3713h0
    public void h(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f44471k.remove(str);
        } else {
            this.f44471k.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC3713h0
    public void i(a4 a4Var) {
        p(a4Var, this.f44466f.g().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC3713h0
    public InterfaceC3713h0 j(String str, String str2, AbstractC3750o2 abstractC3750o2, EnumC3748o0 enumC3748o0) {
        return m(str, str2, abstractC3750o2, enumC3748o0, new Z3());
    }

    @Override // io.sentry.InterfaceC3713h0
    public void k(String str, Number number, F0 f10) {
        if (a()) {
            this.f44466f.g().getLogger().c(EnumC3721i3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f44472l.put(str, new C3767k(number, f10.apiName()));
        if (this.f44464d.N() != this) {
            this.f44464d.Y(str, number, f10);
        }
    }

    @Override // io.sentry.InterfaceC3713h0
    public InterfaceC3713h0 m(String str, String str2, AbstractC3750o2 abstractC3750o2, EnumC3748o0 enumC3748o0, Z3 z10) {
        return this.f44467g ? C3694d1.r() : this.f44464d.Z(this.f44463c.m(), str, str2, abstractC3750o2, enumC3748o0, z10);
    }

    @Override // io.sentry.InterfaceC3713h0
    public T3 n() {
        return this.f44463c;
    }

    @Override // io.sentry.InterfaceC3713h0
    public AbstractC3750o2 o() {
        return this.f44462b;
    }

    @Override // io.sentry.InterfaceC3713h0
    public void p(a4 a4Var, AbstractC3750o2 abstractC3750o2) {
        AbstractC3750o2 abstractC3750o3;
        if (this.f44467g || !this.f44468h.compareAndSet(false, true)) {
            return;
        }
        this.f44463c.v(a4Var);
        if (abstractC3750o2 == null) {
            abstractC3750o2 = this.f44466f.g().getDateProvider().now();
        }
        this.f44462b = abstractC3750o2;
        if (this.f44469i.f() || this.f44469i.e()) {
            AbstractC3750o2 abstractC3750o2Q = null;
            AbstractC3750o2 abstractC3750o2O = null;
            for (S3 s10 : this.f44464d.N().A().equals(A()) ? this.f44464d.J() : s()) {
                if (abstractC3750o2Q == null || s10.q().i(abstractC3750o2Q)) {
                    abstractC3750o2Q = s10.q();
                }
                if (abstractC3750o2O == null || (s10.o() != null && s10.o().h(abstractC3750o2O))) {
                    abstractC3750o2O = s10.o();
                }
            }
            if (this.f44469i.f() && abstractC3750o2Q != null && this.f44461a.i(abstractC3750o2Q)) {
                K(abstractC3750o2Q);
            }
            if (this.f44469i.e() && abstractC3750o2O != null && ((abstractC3750o3 = this.f44462b) == null || abstractC3750o3.h(abstractC3750o2O))) {
                J(abstractC3750o2O);
            }
        }
        Throwable th = this.f44465e;
        if (th != null) {
            this.f44466f.f(th, this, this.f44464d.getName());
        }
        V3 v10 = this.f44470j;
        if (v10 != null) {
            v10.a(this);
        }
        this.f44467g = true;
    }

    @Override // io.sentry.InterfaceC3713h0
    public AbstractC3750o2 q() {
        return this.f44461a;
    }

    public Map r() {
        return this.f44471k;
    }

    @Override // io.sentry.InterfaceC3713h0
    public a4 t() {
        return this.f44463c.n();
    }

    public Map u() {
        return this.f44472l;
    }

    public String v() {
        return this.f44463c.f();
    }

    Z3 w() {
        return this.f44469i;
    }

    public Y3 x() {
        return this.f44463c.h();
    }

    public g4 y() {
        return this.f44463c.l();
    }

    V3 z() {
        return this.f44470j;
    }
}
