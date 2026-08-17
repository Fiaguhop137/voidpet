package p015ae;

import kotlin.jvm.functions.Function1;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f19702a;

    public Q(c cVar) {
        this.f19702a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(S.g(this.f19702a, (c) obj));
    }
}
