package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52477b;

    public D(String str, String str2) {
        this.f52476a = str;
        this.f52477b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.w(this.f52476a, this.f52477b, (n0.a.C0635a) obj);
    }
}
