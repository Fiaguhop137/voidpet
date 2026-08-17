package p088ef;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: ef.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3295l implements InterfaceC3297m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f40845a;

    public C3295l(Future future) {
        this.f40845a = future;
    }

    @Override // p088ef.InterfaceC3297m
    public void a(Throwable th) {
        this.f40845a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f40845a + ']';
    }
}
