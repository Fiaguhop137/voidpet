package Re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class N implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f11066a;

    public N(Function1 function1) {
        this.f11066a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Q.m(this.f11066a, (S) obj);
    }
}
