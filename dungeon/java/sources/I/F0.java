package I;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements InterfaceC1027d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1027d f4458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4460c;

    public F0(InterfaceC1027d interfaceC1027d, int i10) {
        this.f4458a = interfaceC1027d;
        this.f4459b = i10;
    }

    @Override // I.InterfaceC1027d
    public Object a() {
        return this.f4458a.a();
    }

    @Override // I.InterfaceC1027d
    public void b(int i10, int i11) {
        this.f4458a.b(i10 + (this.f4460c == 0 ? this.f4459b : 0), i11);
    }

    @Override // I.InterfaceC1027d
    public void c(int i10, int i11, int i12) {
        int i13 = this.f4460c == 0 ? this.f4459b : 0;
        this.f4458a.c(i10 + i13, i11 + i13, i12);
    }

    @Override // I.InterfaceC1027d
    public void clear() {
        AbstractC1083w.t("Clear is not valid on OffsetApplier");
    }

    @Override // I.InterfaceC1027d
    public void d(Function2 function2, Object obj) {
        this.f4458a.d(function2, obj);
    }

    @Override // I.InterfaceC1027d
    public void e(int i10, Object obj) {
        this.f4458a.e(i10 + (this.f4460c == 0 ? this.f4459b : 0), obj);
    }

    @Override // I.InterfaceC1027d
    public void g(int i10, Object obj) {
        this.f4458a.g(i10 + (this.f4460c == 0 ? this.f4459b : 0), obj);
    }

    @Override // I.InterfaceC1027d
    public void h(Object obj) {
        this.f4460c++;
        this.f4458a.h(obj);
    }

    @Override // I.InterfaceC1027d
    public void i() {
        this.f4458a.i();
    }

    @Override // I.InterfaceC1027d
    public void k() {
        if (!(this.f4460c > 0)) {
            AbstractC1083w.t("OffsetApplier up called with no corresponding down");
        }
        this.f4460c--;
        this.f4458a.k();
    }
}
