package L6;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageStoreManager f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f6385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Callback f6386d;

    public /* synthetic */ a(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        this.f6383a = imageStoreManager;
        this.f6384b = str;
        this.f6385c = callback;
        this.f6386d = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageStoreManager.getBase64ForTag$lambda$0(this.f6383a, this.f6384b, this.f6385c, this.f6386d);
    }
}
