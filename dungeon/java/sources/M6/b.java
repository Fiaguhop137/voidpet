package M6;

import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f6808a;

    public /* synthetic */ b(a aVar) {
        this.f6808a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0(this.f6808a);
    }
}
