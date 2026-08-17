package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2131d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27676a;

    C2131d(String str) {
        this.f27676a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f27676a;
    }
}
