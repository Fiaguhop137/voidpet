package p184k4;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f48011a;

    public /* synthetic */ n0(WebView webView) {
        this.f48011a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48011a.destroy();
    }
}
