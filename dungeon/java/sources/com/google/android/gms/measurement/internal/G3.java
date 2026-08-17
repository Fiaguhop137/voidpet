package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f35014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Boolean f35015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f35016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f35017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f35018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Long f35019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f35020g;

    public G3(Context context, com.google.android.gms.internal.measurement.H0 h10, Long l10) {
        this.f35018e = true;
        p170j8.r.l(context);
        Context applicationContext = context.getApplicationContext();
        p170j8.r.l(applicationContext);
        this.f35014a = applicationContext;
        this.f35019f = l10;
        if (h10 != null) {
            this.f35017d = h10;
            this.f35018e = h10.f32510c;
            this.f35016c = h10.f32509b;
            this.f35020g = h10.f32512e;
            Bundle bundle = h10.f32511d;
            if (bundle != null) {
                this.f35015b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
