package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52479b;

    public E(String str, String str2) {
        this.f52478a = str;
        this.f52479b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.x(this.f52478a, this.f52479b, (n0.a.C0635a) obj);
    }
}
