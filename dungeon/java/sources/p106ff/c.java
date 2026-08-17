package p106ff;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f41894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f41895b;

    public /* synthetic */ c(e eVar, Runnable runnable) {
        this.f41894a = eVar;
        this.f41895b = runnable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return e.G0(this.f41894a, this.f41895b, (Throwable) obj);
    }
}
