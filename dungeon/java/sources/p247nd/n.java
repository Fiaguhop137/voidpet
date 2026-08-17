package p247nd;

import kotlin.jvm.functions.Function1;
import p158id.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f50113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f50114b;

    public /* synthetic */ n(p pVar, a aVar) {
        this.f50113a = pVar;
        this.f50114b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return p.s(this.f50113a, this.f50114b, ((Double) obj).doubleValue());
    }
}
