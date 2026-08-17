package p088ef;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f40819c = new d1();

    private d1() {
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // p088ef.K
    public boolean h0(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // p088ef.K
    public K m0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p088ef.K
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
