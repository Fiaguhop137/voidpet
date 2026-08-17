package p088ef;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class A0 extends G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f40743e;

    public A0(Function1 function1) {
        this.f40743e = function1;
    }

    @Override // p088ef.G0
    public boolean v() {
        return false;
    }

    @Override // p088ef.G0
    public void w(Throwable th) {
        this.f40743e.invoke(th);
    }
}
