package p062d7;

import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f39843a;

    public /* synthetic */ e(Callback callback) {
        this.f39843a = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.c(this.f39843a);
    }
}
