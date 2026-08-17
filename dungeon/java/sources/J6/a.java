package J6;

import com.facebook.react.modules.appearance.AppearanceModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5749a;

    public /* synthetic */ a(String str) {
        this.f5749a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppearanceModule.setColorScheme$lambda$0(this.f5749a);
    }
}
