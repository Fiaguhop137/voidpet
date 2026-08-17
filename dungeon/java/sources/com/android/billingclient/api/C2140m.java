package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2140m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27792e;

    C2140m(String str) {
        this.f27788a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f27789b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f27790c = strOptString;
        this.f27791d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f27792e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2140m) {
            return TextUtils.equals(this.f27788a, ((C2140m) obj).f27788a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27788a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f27789b + "', productType='" + this.f27790c + "', statusCode=" + this.f27791d + "}";
    }
}
