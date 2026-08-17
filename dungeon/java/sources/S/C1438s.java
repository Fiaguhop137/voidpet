package S;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: S.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1438s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f11404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11405b;

    public /* synthetic */ C1438s(Function1 function1, Function1 function2) {
        this.f11404a = function1;
        this.f11405b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AbstractC1442w.R(this.f11404a, this.f11405b, obj);
    }
}
