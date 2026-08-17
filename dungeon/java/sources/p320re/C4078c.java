package p320re;

import Ve.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4078c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4079d f52510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f52511b;

    public C4078c(AbstractC4079d abstractC4079d, r rVar) {
        this.f52510a = abstractC4079d;
        this.f52511b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC4079d.I(this.f52510a, this.f52511b, (AbstractC4079d.a) obj);
    }
}
