package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2141n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f27794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f27795c;

    /* JADX INFO: renamed from: com.android.billingclient.api.n$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27798c;

        private a(JSONObject jSONObject) {
            this.f27796a = jSONObject.optString("productId");
            this.f27797b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f27798c = true == strOptString.isEmpty() ? null : strOptString;
        }

        /* synthetic */ a(JSONObject jSONObject, p131h4.V v10) {
            this(jSONObject);
        }

        public String a() {
            return this.f27796a;
        }

        public String b() {
            return this.f27798c;
        }

        public String c() {
            return this.f27797b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27796a.equals(aVar.a()) && this.f27797b.equals(aVar.c()) && Objects.equals(this.f27798c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f27796a, this.f27797b, this.f27798c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f27796a, this.f27797b, this.f27798c);
        }
    }

    C2141n(String str) {
        this.f27793a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f27794b = jSONObject;
        this.f27795c = a(jSONObject.optJSONArray("products"));
    }

    private static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject, null));
                }
            }
        }
        return arrayList;
    }
}
