package io.sentry.cache;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45727b;

    public /* synthetic */ s(t tVar, String str) {
        this.f45726a = tVar;
        this.f45727b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.t(this.f45726a, this.f45727b);
    }
}
