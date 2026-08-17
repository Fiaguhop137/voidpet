package I;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1026c1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1029d1 f4610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p323s.K f4612c;

    public /* synthetic */ C1026c1(C1029d1 c1029d1, int i10, p323s.K k10) {
        this.f4610a = c1029d1;
        this.f4611b = i10;
        this.f4612c = k10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C1029d1.g(this.f4610a, this.f4611b, this.f4612c, (InterfaceC1086x) obj);
    }
}
