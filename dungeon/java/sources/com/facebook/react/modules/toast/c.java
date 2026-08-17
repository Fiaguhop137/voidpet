package com.facebook.react.modules.toast;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToastModule f29997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29999c;

    public /* synthetic */ c(ToastModule toastModule, String str, int i10) {
        this.f29997a = toastModule;
        this.f29998b = str;
        this.f29999c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ToastModule.show$lambda$0(this.f29997a, this.f29998b, this.f29999c);
    }
}
