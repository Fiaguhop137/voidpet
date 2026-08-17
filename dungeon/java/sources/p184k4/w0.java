package p184k4;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f48026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48027b;

    public /* synthetic */ w0(WebView webView, String str) {
        this.f48026a = webView;
        this.f48027b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48026a.evaluateJavascript(this.f48027b, null);
    }
}
