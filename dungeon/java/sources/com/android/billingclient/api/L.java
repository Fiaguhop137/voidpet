package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27536c;

    /* synthetic */ L(JSONObject jSONObject, p131h4.I i10) {
        this.f27534a = jSONObject.optString("productId");
        this.f27535b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f27536c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return this.f27534a.equals(l10.f27534a) && this.f27535b.equals(l10.f27535b) && Objects.equals(this.f27536c, l10.f27536c);
    }

    public final int hashCode() {
        return Objects.hash(this.f27534a, this.f27535b, this.f27536c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f27534a, this.f27535b, this.f27536c);
    }
}
