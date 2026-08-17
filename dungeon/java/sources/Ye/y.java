package Ye;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f17929a;

    public y(z zVar) {
        this.f17929a = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(z.g(this.f17929a, (String) obj));
    }
}
