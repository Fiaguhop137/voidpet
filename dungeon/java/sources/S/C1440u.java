package S;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: S.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1440u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f11406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11407b;

    public /* synthetic */ C1440u(Function1 function1, Function1 function2) {
        this.f11406a = function1;
        this.f11407b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AbstractC1442w.T(this.f11406a, this.f11407b, obj);
    }
}
