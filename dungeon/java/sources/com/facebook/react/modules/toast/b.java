package com.facebook.react.modules.toast;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToastModule f29993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29996d;

    public /* synthetic */ b(ToastModule toastModule, String str, int i10, int i11) {
        this.f29993a = toastModule;
        this.f29994b = str;
        this.f29995c = i10;
        this.f29996d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ToastModule.showWithGravity$lambda$1(this.f29993a, this.f29994b, this.f29995c, this.f29996d);
    }
}
