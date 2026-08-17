package Ne;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ne.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1228b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1229c f8149a;

    public C1228b(AbstractC1229c abstractC1229c) {
        this.f8149a = abstractC1229c;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1229c.f(this.f8149a, (p464ze.c) obj);
    }
}
