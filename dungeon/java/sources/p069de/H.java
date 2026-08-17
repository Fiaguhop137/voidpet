package p069de;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1801o;
import p015ae.N;
import p015ae.h0;
import p033be.h;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H extends AbstractC3240n implements N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f39973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f39974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(p015ae.H module, c fqName) {
        super(module, h.f26532n1.b(), fqName.g(), h0.f19733a);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f39973e = fqName;
        this.f39974f = "package " + fqName + " of " + module;
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.k(this, obj);
    }

    @Override // p069de.AbstractC3240n, p015ae.InterfaceC1799m
    public p015ae.H b() {
        InterfaceC1799m interfaceC1799mB = super.b();
        Intrinsics.d(interfaceC1799mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (p015ae.H) interfaceC1799mB;
    }

    @Override // p015ae.N
    public final c f() {
        return this.f39973e;
    }

    @Override // p069de.AbstractC3240n, p015ae.InterfaceC1802p
    public h0 k() {
        h0 NO_SOURCE = h0.f19733a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p069de.AbstractC3239m
    public String toString() {
        return this.f39974f;
    }
}
