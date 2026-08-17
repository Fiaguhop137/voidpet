package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2134g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f27712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f27713c;

    /* JADX INFO: renamed from: com.android.billingclient.api.g$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27716c;

        /* synthetic */ a(JSONObject jSONObject, p131h4.L l10) {
            this.f27714a = jSONObject.optString("productId");
            this.f27715b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f27716c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public String a() {
            return this.f27714a;
        }

        public String b() {
            return this.f27716c;
        }

        public String c() {
            return this.f27715b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27714a.equals(aVar.a()) && this.f27715b.equals(aVar.c()) && Objects.equals(this.f27716c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f27714a, this.f27715b, this.f27716c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f27714a, this.f27715b, this.f27716c);
        }
    }

    C2134g(String str) {
        this.f27711a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f27712b = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.f27713c = arrayList;
    }
}
