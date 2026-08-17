package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f44337a;

    public /* synthetic */ G2(T2.a aVar) {
        this.f44337a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.f44337a.a().length);
    }
}
