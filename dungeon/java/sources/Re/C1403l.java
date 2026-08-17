package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Re.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1403l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1411p f11134a;

    public C1403l(AbstractC1411p abstractC1411p) {
        this.f11134a = abstractC1411p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1411p.E(this.f11134a, (S) obj);
    }
}
