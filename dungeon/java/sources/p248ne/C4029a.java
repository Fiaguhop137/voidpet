package p248ne;

import kotlin.jvm.functions.Function1;
import p302qe.r;

/* JADX INFO: renamed from: ne.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C4029a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4030b f50206a;

    public C4029a(C4030b c4030b) {
        this.f50206a = c4030b;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C4030b.h(this.f50206a, (r) obj));
    }
}
