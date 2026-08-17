package p088ef;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: ef.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3284f0 implements InterfaceC3286g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f40832a;

    public C3284f0(Future future) {
        this.f40832a = future;
    }

    @Override // p088ef.InterfaceC3286g0
    public void dispose() {
        this.f40832a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f40832a + ']';
    }
}
