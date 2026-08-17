package T3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u implements c, U3.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12248c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z3.t.a f12249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U3.a f12250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U3.a f12251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U3.a f12252g;

    public u(p005a4.b bVar, Z3.t tVar) {
        this.f12246a = tVar.c();
        this.f12247b = tVar.g();
        this.f12249d = tVar.f();
        U3.d dVarK = tVar.e().k();
        this.f12250e = dVarK;
        U3.d dVarK2 = tVar.b().k();
        this.f12251f = dVarK2;
        U3.d dVarK3 = tVar.d().k();
        this.f12252g = dVarK3;
        bVar.j(dVarK);
        bVar.j(dVarK2);
        bVar.j(dVarK3);
        dVarK.a(this);
        dVarK2.a(this);
        dVarK3.a(this);
    }

    void a(U3.a.b bVar) {
        this.f12248c.add(bVar);
    }

    @Override // U3.a.b
    public void b() {
        for (int i10 = 0; i10 < this.f12248c.size(); i10++) {
            ((U3.a.b) this.f12248c.get(i10)).b();
        }
    }

    @Override // T3.c
    public void c(List list, List list2) {
    }

    public U3.a e() {
        return this.f12251f;
    }

    public U3.a g() {
        return this.f12252g;
    }

    public U3.a j() {
        return this.f12250e;
    }

    Z3.t.a k() {
        return this.f12249d;
    }

    public boolean l() {
        return this.f12247b;
    }
}
