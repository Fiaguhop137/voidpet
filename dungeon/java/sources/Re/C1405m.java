package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Re.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1405m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1411p f11136a;

    public C1405m(AbstractC1411p abstractC1411p) {
        this.f11136a = abstractC1411p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1411p.F(this.f11136a, (v0) obj);
    }
}
