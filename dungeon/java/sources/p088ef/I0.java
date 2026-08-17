package p088ef;

import p195kf.D;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f40774a = new D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f40775b = new D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D f40776c = new D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D f40777d = new D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f40778e = new D("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3292j0 f40779f = new C3292j0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C3292j0 f40780g = new C3292j0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC3317w0 ? new C3319x0((InterfaceC3317w0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC3317w0 interfaceC3317w0;
        C3319x0 c3319x0 = obj instanceof C3319x0 ? (C3319x0) obj : null;
        return (c3319x0 == null || (interfaceC3317w0 = c3319x0.f40872a) == null) ? obj : interfaceC3317w0;
    }
}
