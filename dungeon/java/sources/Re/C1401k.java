package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Re.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1401k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1411p f11131a;

    public C1401k(AbstractC1411p abstractC1411p) {
        this.f11131a = abstractC1411p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1411p.D(this.f11131a, (v0) obj);
    }
}
