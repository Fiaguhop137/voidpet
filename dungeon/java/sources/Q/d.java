package Q;

import I.InterfaceC1054m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f9188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9192e;

    public /* synthetic */ d(g gVar, Object obj, Object obj2, Object obj3, int i10) {
        this.f9188a = gVar;
        this.f9189b = obj;
        this.f9190c = obj2;
        this.f9191d = obj3;
        this.f9192e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return g.p(this.f9188a, this.f9189b, this.f9190c, this.f9191d, this.f9192e, (InterfaceC1054m) obj, ((Integer) obj2).intValue());
    }
}
