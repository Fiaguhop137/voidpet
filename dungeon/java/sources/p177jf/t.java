package p177jf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f47434a;

    public /* synthetic */ t(r rVar) {
        this.f47434a = rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(u.c(this.f47434a, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
    }
}
