package Vd;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14276a;

    public b(Map map) {
        this.f14276a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Integer.valueOf(f.j(this.f14276a));
    }
}
