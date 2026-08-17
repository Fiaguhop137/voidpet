package p088ef;

import p195kf.D;
import p195kf.L;

/* JADX INFO: loaded from: classes3.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y0 f40805a = new Y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f40806b = L.a(new D("ThreadLocalEventLoop"));

    private Y0() {
    }

    public final AbstractC3294k0 a() {
        return (AbstractC3294k0) f40806b.get();
    }

    public final AbstractC3294k0 b() {
        ThreadLocal threadLocal = f40806b;
        AbstractC3294k0 abstractC3294k0 = (AbstractC3294k0) threadLocal.get();
        if (abstractC3294k0 != null) {
            return abstractC3294k0;
        }
        AbstractC3294k0 abstractC3294k0A = AbstractC3300n0.a();
        threadLocal.set(abstractC3294k0A);
        return abstractC3294k0A;
    }

    public final void c() {
        f40806b.set(null);
    }

    public final void d(AbstractC3294k0 abstractC3294k0) {
        f40806b.set(abstractC3294k0);
    }
}
