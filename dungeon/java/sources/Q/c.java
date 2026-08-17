package Q;

import I.InterfaceC1054m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f9184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9187d;

    public /* synthetic */ c(g gVar, Object obj, Object obj2, int i10) {
        this.f9184a = gVar;
        this.f9185b = obj;
        this.f9186c = obj2;
        this.f9187d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return g.n(this.f9184a, this.f9185b, this.f9186c, this.f9187d, (InterfaceC1054m) obj, ((Integer) obj2).intValue());
    }
}
