package Q;

import I.InterfaceC1054m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f9193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9195c;

    public /* synthetic */ e(g gVar, Object obj, int i10) {
        this.f9193a = gVar;
        this.f9194b = obj;
        this.f9195c = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return g.m(this.f9193a, this.f9194b, this.f9195c, (InterfaceC1054m) obj, ((Integer) obj2).intValue());
    }
}
