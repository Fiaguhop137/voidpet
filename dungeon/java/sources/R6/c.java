package R6;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f10876a;

    public /* synthetic */ c(Callback callback) {
        this.f10876a = callback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        d.e(this.f10876a, (Boolean) obj);
    }
}
