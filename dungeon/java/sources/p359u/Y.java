package p359u;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
final class Y implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f54838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f54839b;

    public Y(Function1 function1, Function1 function2) {
        this.f54838a = function1;
        this.f54839b = function2;
    }

    @Override // p359u.X
    public Function1 a() {
        return this.f54838a;
    }

    @Override // p359u.X
    public Function1 b() {
        return this.f54839b;
    }
}
