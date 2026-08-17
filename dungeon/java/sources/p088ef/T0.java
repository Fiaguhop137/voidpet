package p088ef;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f40799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3299n f40800b;

    public T0(K k10, InterfaceC3299n interfaceC3299n) {
        this.f40799a = k10;
        this.f40800b = interfaceC3299n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f40800b.A(this.f40799a, Unit.f48228a);
    }
}
