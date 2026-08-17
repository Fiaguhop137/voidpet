package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45240c;

    public /* synthetic */ f(i iVar, String str, String str2) {
        this.f45238a = iVar;
        this.f45239b = str;
        this.f45240c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45238a.f45246b.c(this.f45239b, this.f45240c);
    }
}
