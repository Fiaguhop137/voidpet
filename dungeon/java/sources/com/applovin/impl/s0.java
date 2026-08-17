package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28334a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k3 f28336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f28337d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28335b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f28338e = new HashSet();

    public s0(p pVar) {
        this.f28334a = pVar;
    }

    public final void a() {
        synchronized (this.f28335b) {
            try {
                this.f28337d++;
                n.a(this);
                if (this.f28336c != null) {
                    this.f28334a.g();
                    if (p1.f28289b) {
                        this.f28334a.g().a("DeepLinkManager", "Canceling pending land event");
                    }
                    this.f28336c.a();
                    this.f28336c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void a(long j10) {
        synchronized (this.f28335b) {
            try {
                if (j10 != this.f28337d) {
                    return;
                }
                n.a(this);
                this.f28336c = null;
                this.f28334a.getEventService().trackEvent("land");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.l
    public final void a(Intent intent) {
        if ("com.applovin.application_paused".equals(intent.getAction())) {
            a();
        }
    }

    public final void a(Uri uri) {
        p1.c("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f28334a.q().f28234b = queryParameter;
                p2.a("com.applovin.sdk.alart", queryParameter, p2.a(p.f28247J), null);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f28334a.q().f28235c = queryParameter2;
                p2.a("com.applovin.sdk.aleid", queryParameter2, p2.a(p.f28247J), null);
            }
            if (StringUtils.isValidString(queryParameter2)) {
                a(queryParameter2);
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f28335b) {
            try {
                if (this.f28338e.add(str)) {
                    a();
                    long j10 = this.f28337d;
                    n.a(new IntentFilter("com.applovin.application_paused"), this);
                    this.f28336c = k3.a(((Long) this.f28334a.l().a(m2.f28162U0)).longValue(), this.f28334a.g(), new p184k4.v0(this, j10));
                    return;
                }
                this.f28334a.g();
                if (p1.f28289b) {
                    this.f28334a.g().a("DeepLinkManager", "Skipping land event for already processed deep link: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
