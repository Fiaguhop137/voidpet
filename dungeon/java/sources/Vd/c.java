package Vd;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f14277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14278b;

    public c(Class cls, Map map) {
        this.f14277a = cls;
        this.f14278b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return f.l(this.f14277a, this.f14278b);
    }
}
