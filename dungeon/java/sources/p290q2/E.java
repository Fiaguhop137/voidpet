package p290q2;

import R1.C1342b;
import R1.F;
import U1.AbstractC1459a;
import Z1.t1;
import Z1.u1;
import p236n2.D;
import p236n2.m0;
import p308r2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f51220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f51221b;

    public interface a {
        void a(t1 t1Var);

        void b();
    }

    protected final d b() {
        return (d) AbstractC1459a.i(this.f51221b);
    }

    public abstract u1.a c();

    public void d(a aVar, d dVar) {
        AbstractC1459a.g(this.f51220a == null);
        this.f51220a = aVar;
        this.f51221b = dVar;
    }

    protected final void e() {
        a aVar = this.f51220a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void f(t1 t1Var) {
        a aVar = this.f51220a;
        if (aVar != null) {
            aVar.a(t1Var);
        }
    }

    public abstract boolean g();

    public abstract void h(Object obj);

    public void i() {
        this.f51220a = null;
        this.f51221b = null;
    }

    public abstract F j(u1[] u1VarArr, m0 m0Var, D.b bVar, F f10);

    public abstract void k(C1342b c1342b);
}
