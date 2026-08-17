package com.applovin.impl;

import android.os.Handler;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f28300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f28301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f28303e = Collections.synchronizedSet(new HashSet());

    public q3(p pVar) {
        this.f28299a = pVar;
        this.f28300b = pVar.g();
    }

    public final WebView a() {
        WebView webView;
        Handler handler = i3.f28069a;
        try {
            webView = new WebView(p.f28247J);
        } catch (Throwable th) {
            p1.c("WebViewUtils", "Failed to initialize WebView for web tracker.", th);
            webView = null;
        }
        if (webView == null) {
            return null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new p3(this, ((Boolean) this.f28299a.l().a(m2.f28155R)).booleanValue()));
        webView.loadData("<html><head><link rel=\"icon\" href=\"data:,\"><script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script></head><body></body></html>", "text/html", "UTF-8");
        return webView;
    }

    public final void a(WebView webView) {
        if (webView == null || !this.f28303e.remove(webView)) {
            return;
        }
        i3.a(false, new p184k4.n0(webView));
    }

    public final void a(b2 b2Var, c2 c2Var) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(b2Var.f28029a, b2Var.f28031c);
        if (this.f28301c == null) {
            WebView webViewA = a();
            this.f28301c = webViewA;
            if (webViewA == null) {
                p1 p1Var = this.f28300b;
                if (p1.f28289b) {
                    p1Var.a("WebTrackerManager", "Failed to fire postback since web view could not be created", null);
                }
                c2Var.a(strAppendQueryParameters, -1);
                return;
            }
        }
        if (((Boolean) this.f28299a.l().a(m2.f28155R)).booleanValue() && !this.f28302d) {
            p1 p1Var2 = this.f28300b;
            if (p1.f28289b) {
                p1Var2.a("WebTrackerManager", "Failed to fire postback since web view was not initialized in time", null);
            }
            c2Var.a(strAppendQueryParameters, -1);
            return;
        }
        s3.a(this.f28301c, "al_firePostback('" + strAppendQueryParameters + "')");
        c2Var.a(strAppendQueryParameters);
    }

    public final void a(b2 b2Var, s2 s2Var) {
        i3.a(false, new p184k4.o0(this, b2Var, s2Var));
    }

    public final void b() {
        WebView webViewA = a();
        this.f28301c = webViewA;
        if (webViewA == null) {
            p1 p1Var = this.f28300b;
            if (p1.f28289b) {
                p1Var.a("WebTrackerManager", "Failed to preload postback web view", null);
            }
        }
    }

    public final void c() {
        i3.a(false, new p184k4.m0(this));
    }
}
