package I;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: I.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067q0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f4797a;

    public C1067q0(Function0 function0) {
        this.f4797a = Ad.j.b(function0);
    }

    private final Object b() {
        return this.f4797a.getValue();
    }

    @Override // I.i2
    public Object a(S0 s10) {
        return b();
    }
}
