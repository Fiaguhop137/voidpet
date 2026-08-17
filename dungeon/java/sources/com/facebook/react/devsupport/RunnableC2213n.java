package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2213n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f29704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f29705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2216q f29706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29707d;

    public /* synthetic */ RunnableC2213n(Integer num, Integer num2, C2216q c2216q, String str) {
        this.f29704a = num;
        this.f29705b = num2;
        this.f29706c = c2216q;
        this.f29707d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2216q.k(this.f29704a, this.f29705b, this.f29706c, this.f29707d);
    }
}
