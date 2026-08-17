package p359u;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f54818a;

    public /* synthetic */ S(Function1 function1) {
        this.f54818a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return U.s(this.f54818a, ((Long) obj).longValue());
    }
}
