package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45242b;

    public /* synthetic */ g(i iVar, String str) {
        this.f45241a = iVar;
        this.f45242b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45241a.f45246b.b(this.f45242b);
    }
}
