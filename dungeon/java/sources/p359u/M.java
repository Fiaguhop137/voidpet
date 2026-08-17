package p359u;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f54803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f54804b;

    public /* synthetic */ M(Function2 function2, X x10) {
        this.f54803a = function2;
        this.f54804b = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return U.m(this.f54803a, this.f54804b, (C4209h) obj);
    }
}
