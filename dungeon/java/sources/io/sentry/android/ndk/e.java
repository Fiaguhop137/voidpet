package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45237b;

    public /* synthetic */ e(i iVar, String str) {
        this.f45236a = iVar;
        this.f45237b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45236a.f45246b.f(this.f45237b);
    }
}
