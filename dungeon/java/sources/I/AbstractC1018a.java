package I;

import java.util.ArrayList;

/* JADX INFO: renamed from: I.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1018a implements InterfaceC1027d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4587d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f4589b = c2.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f4590c;

    public AbstractC1018a(Object obj) {
        this.f4588a = obj;
        this.f4590c = obj;
    }

    @Override // I.InterfaceC1027d
    public Object a() {
        return this.f4590c;
    }

    @Override // I.InterfaceC1027d
    public final void clear() {
        c2.a(this.f4589b);
        n(this.f4588a);
        m();
    }

    @Override // I.InterfaceC1027d
    public void h(Object obj) {
        c2.j(this.f4589b, a());
        n(obj);
    }

    @Override // I.InterfaceC1027d
    public void k() {
        n(c2.i(this.f4589b));
    }

    public final Object l() {
        return this.f4588a;
    }

    protected abstract void m();

    protected void n(Object obj) {
        this.f4590c = obj;
    }
}
