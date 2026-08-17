package Ud;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
class T0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0 f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f13524c;

    public T0(U0 u10, int i10, Lazy lazy) {
        this.f13522a = u10;
        this.f13523b = i10;
        this.f13524c = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return U0.x(this.f13522a, this.f13523b, this.f13524c);
    }
}
