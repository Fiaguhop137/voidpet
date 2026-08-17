package I;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1020a1[] f4462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f4463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4464c;

    public /* synthetic */ G(C1020a1[] c1020a1Arr, Function2 function2, int i10) {
        this.f4462a = c1020a1Arr;
        this.f4463b = function2;
        this.f4464c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return H.e(this.f4462a, this.f4463b, this.f4464c, (InterfaceC1054m) obj, ((Integer) obj2).intValue());
    }
}
