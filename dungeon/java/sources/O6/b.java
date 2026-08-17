package O6;

import com.facebook.react.modules.devloading.DevLoadingModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevLoadingModule f8398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8399b;

    public /* synthetic */ b(DevLoadingModule devLoadingModule, String str) {
        this.f8398a = devLoadingModule;
        this.f8399b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DevLoadingModule.showMessage$lambda$0(this.f8398a, this.f8399b);
    }
}
