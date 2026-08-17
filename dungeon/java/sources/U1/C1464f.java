package U1;

import android.os.Looper;

/* JADX INFO: renamed from: U1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1474p f12900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1474p f12901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f12903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f12904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12905f;

    /* JADX INFO: renamed from: U1.f$a */
    public interface a {
        void a(Object obj, Object obj2);
    }

    public C1464f(Object obj, Looper looper, Looper looper2, InterfaceC1466h interfaceC1466h, a aVar) {
        this.f12900a = interfaceC1466h.e(looper, null);
        this.f12901b = interfaceC1466h.e(looper2, null);
        this.f12903d = obj;
        this.f12904e = obj;
        this.f12902c = aVar;
    }

    public static /* synthetic */ void a(C1464f c1464f, B9.f fVar) {
        Object objApply = fVar.apply(c1464f.f12904e);
        c1464f.f12904e = objApply;
        c1464f.f(new RunnableC1463e(c1464f, objApply));
    }

    public static /* synthetic */ void b(C1464f c1464f, Object obj) {
        if (c1464f.f12905f == 0) {
            c1464f.i(obj);
        }
    }

    public static /* synthetic */ void c(C1464f c1464f, Object obj) {
        int i10 = c1464f.f12905f - 1;
        c1464f.f12905f = i10;
        if (i10 == 0) {
            c1464f.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.f12901b.f().getThread().isAlive()) {
            this.f12901b.h(runnable);
        }
    }

    private void i(Object obj) {
        Object obj2 = this.f12903d;
        this.f12903d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f12902c.a(obj2, obj);
    }

    public Object d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f12901b.f()) {
            return this.f12903d;
        }
        AbstractC1459a.g(looperMyLooper == this.f12900a.f());
        return this.f12904e;
    }

    public void e(Runnable runnable) {
        if (this.f12900a.f().getThread().isAlive()) {
            this.f12900a.h(runnable);
        }
    }

    public void g(Object obj) {
        this.f12904e = obj;
        f(new RunnableC1461c(this, obj));
    }

    public void h(B9.f fVar, B9.f fVar2) {
        AbstractC1459a.g(Looper.myLooper() == this.f12901b.f());
        this.f12905f++;
        e(new RunnableC1462d(this, fVar2));
        i(fVar.apply(this.f12903d));
    }
}
