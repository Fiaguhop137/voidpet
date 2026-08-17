package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45235c;

    public /* synthetic */ d(i iVar, String str, String str2) {
        this.f45233a = iVar;
        this.f45234b = str;
        this.f45235c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45233a.f45246b.d(this.f45234b, this.f45235c);
    }
}
