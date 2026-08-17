package Fe;

import Re.S;
import kotlin.jvm.functions.Function1;
import p015ae.H;

/* JADX INFO: loaded from: classes3.dex */
class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f3089a;

    public y(S s10) {
        this.f3089a = s10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return z.c(this.f3089a, (H) obj);
    }
}
