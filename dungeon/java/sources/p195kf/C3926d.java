package p195kf;

import kotlin.coroutines.CoroutineContext;
import p088ef.O;

/* JADX INFO: renamed from: kf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3926d implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f48140a;

    public C3926d(CoroutineContext coroutineContext) {
        this.f48140a = coroutineContext;
    }

    @Override // p088ef.O
    public CoroutineContext getCoroutineContext() {
        return this.f48140a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
