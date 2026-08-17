package O6;

import com.facebook.react.modules.devloading.DevLoadingModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevLoadingModule f8397a;

    public /* synthetic */ a(DevLoadingModule devLoadingModule) {
        this.f8397a = devLoadingModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DevLoadingModule.hide$lambda$1(this.f8397a);
    }
}
