package I;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1020a1 f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f4456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4457c;

    public /* synthetic */ F(C1020a1 c1020a1, Function2 function2, int i10) {
        this.f4455a = c1020a1;
        this.f4456b = function2;
        this.f4457c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return H.f(this.f4455a, this.f4456b, this.f4457c, (InterfaceC1054m) obj, ((Integer) obj2).intValue());
    }
}
