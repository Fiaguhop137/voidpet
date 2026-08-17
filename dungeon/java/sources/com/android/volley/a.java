package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f27844c;

    public a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f27844c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
