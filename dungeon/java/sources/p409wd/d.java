package p409wd;

import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f56832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactContext f56833b;

    public /* synthetic */ d(g gVar, ReactContext reactContext) {
        this.f56832a = gVar;
        this.f56833b = reactContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56832a.j(this.f56833b);
    }
}
