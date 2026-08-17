package com.facebook.react.modules.toast;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToastModule f29987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29992f;

    public /* synthetic */ a(ToastModule toastModule, String str, int i10, int i11, int i12, int i13) {
        this.f29987a = toastModule;
        this.f29988b = str;
        this.f29989c = i10;
        this.f29990d = i11;
        this.f29991e = i12;
        this.f29992f = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ToastModule.showWithGravityAndOffset$lambda$2(this.f29987a, this.f29988b, this.f29989c, this.f29990d, this.f29991e, this.f29992f);
    }
}
