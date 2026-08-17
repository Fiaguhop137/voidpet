package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Re.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1407n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1411p f11141a;

    public C1407n(AbstractC1411p abstractC1411p) {
        this.f11141a = abstractC1411p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1411p.G(this.f11141a, (S) obj);
    }
}
