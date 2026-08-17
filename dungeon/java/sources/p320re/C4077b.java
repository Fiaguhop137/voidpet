package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4077b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f52507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4083h[] f52508b;

    public C4077b(r0 r0Var, C4083h[] c4083hArr) {
        this.f52507a = r0Var;
        this.f52508b = c4083hArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC4079d.e(this.f52507a, this.f52508b, ((Number) obj).intValue());
    }
}
