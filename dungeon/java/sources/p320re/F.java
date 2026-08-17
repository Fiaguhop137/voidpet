package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52481b;

    public F(String str, String str2) {
        this.f52480a = str;
        this.f52481b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.y(this.f52480a, this.f52481b, (n0.a.C0635a) obj);
    }
}
