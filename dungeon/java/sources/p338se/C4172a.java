package p338se;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: se.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4172a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4175d f53562a;

    public C4172a(AbstractC4175d abstractC4175d) {
        this.f53562a = abstractC4175d;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC4175d.L(this.f53562a, (x) obj);
    }
}
