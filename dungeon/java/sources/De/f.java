package De;

import kotlin.jvm.functions.Function2;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1787a f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1787a f2411b;

    public f(InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2) {
        this.f2410a = interfaceC1787a;
        this.f2411b = interfaceC1787a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(g.i(this.f2410a, this.f2411b, (InterfaceC1799m) obj, (InterfaceC1799m) obj2));
    }
}
