package p088ef;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import p213lf.a;

/* JADX INFO: loaded from: classes3.dex */
final class J0 extends X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f40781d;

    public J0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f40781d = Fd.b.a(function2, this, this);
    }

    @Override // p088ef.H0
    protected void F0() throws Throwable {
        a.b(this.f40781d, this);
    }
}
