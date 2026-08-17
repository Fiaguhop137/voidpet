package p320re;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class M implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52491b;

    public M(String str, String str2) {
        this.f52490a = str;
        this.f52491b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.E(this.f52490a, this.f52491b, (n0.a.C0635a) obj);
    }
}
