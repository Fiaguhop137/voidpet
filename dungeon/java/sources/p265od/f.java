package p265od;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f50589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f50590b;

    public /* synthetic */ f(g gVar, String str) {
        this.f50589a = gVar;
        this.f50590b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return g.n(this.f50589a, this.f50590b, ((Long) obj).longValue());
    }
}
