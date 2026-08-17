package p069de;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: de.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C3247v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3249x f40172a;

    public C3247v(C3249x c3249x) {
        this.f40172a = c3249x;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(C3249x.L0(this.f40172a));
    }
}
