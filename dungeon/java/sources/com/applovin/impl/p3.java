package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3 f28293b;

    public p3(q3 q3Var, boolean z10) {
        this.f28293b = q3Var;
        this.f28292a = z10;
    }

    public final /* synthetic */ void a() {
        this.f28293b.f28301c.destroy();
        this.f28293b.f28301c = null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.f28292a) {
            p1 p1Var = this.f28293b.f28300b;
            if (p1.f28289b) {
                p1Var.a("WebTrackerManager", "Successfully initialized web view for postbacks");
            }
            this.f28293b.f28302d = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q3 q3Var = this.f28293b;
        if (webView == q3Var.f28301c) {
            i3.a(false, new p184k4.j0(this));
        } else {
            q3Var.a(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
