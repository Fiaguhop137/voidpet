package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Re.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1399j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1411p f11129a;

    public C1399j(AbstractC1411p abstractC1411p) {
        this.f11129a = abstractC1411p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1411p.C(this.f11129a, (AbstractC1411p.b) obj);
    }
}
