package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4076a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4079d f52504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC4079d.a f52505b;

    public C4076a(AbstractC4079d abstractC4079d, AbstractC4079d.a aVar) {
        this.f52504a = abstractC4079d;
        this.f52505b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC4079d.i(this.f52504a, this.f52505b, obj));
    }
}
