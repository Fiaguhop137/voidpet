package p015ae;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends AbstractC1806u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f19740a;

    public r(x0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19740a = delegate;
    }

    @Override // p015ae.AbstractC1806u
    public x0 b() {
        return this.f19740a;
    }

    @Override // p015ae.AbstractC1806u
    public String c() {
        return b().b();
    }

    @Override // p015ae.AbstractC1806u
    public AbstractC1806u f() {
        AbstractC1806u abstractC1806uJ = AbstractC1805t.j(b().d());
        Intrinsics.checkNotNullExpressionValue(abstractC1806uJ, "toDescriptorVisibility(...)");
        return abstractC1806uJ;
    }
}
