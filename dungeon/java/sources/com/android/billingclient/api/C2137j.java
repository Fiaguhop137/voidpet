package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2137j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f27725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f27731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f27733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f27734k;

    /* JADX INFO: renamed from: com.android.billingclient.api.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27736b;

        a(JSONObject jSONObject) {
            this.f27735a = jSONObject.getInt("commitmentPaymentsCount");
            this.f27736b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f27735a;
        }

        public int b() {
            return this.f27736b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.j$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f27742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f27743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f27744h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a f27745i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final e f27746j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C0359b f27747k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f27748l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f27749m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final d f27750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final f0 f27751o;

        /* JADX INFO: renamed from: com.android.billingclient.api.j$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f27752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C0358a f27753b;

            /* JADX INFO: renamed from: com.android.billingclient.api.j$b$a$a, reason: collision with other inner class name */
            public static final class C0358a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27754a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final long f27755b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f27756c;

                C0358a(JSONObject jSONObject) {
                    this.f27754a = jSONObject.optString("formattedDiscountAmount");
                    this.f27755b = jSONObject.optLong("discountAmountMicros");
                    this.f27756c = jSONObject.optString("discountAmountCurrencyCode");
                }

                public long a() {
                    return this.f27755b;
                }

                public String b() {
                    return this.f27754a;
                }
            }

            a(JSONObject jSONObject) {
                this.f27752a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f27753b = jSONObjectOptJSONObject != null ? new C0358a(jSONObjectOptJSONObject) : null;
            }

            public C0358a a() {
                return this.f27753b;
            }

            public Integer b() {
                return this.f27752a;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.j$b$b, reason: collision with other inner class name */
        public static final class C0359b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f27757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f27758b;

            C0359b(JSONObject jSONObject) {
                this.f27757a = jSONObject.getInt("maximumQuantity");
                this.f27758b = jSONObject.getInt("remainingQuantity");
            }

            public int a() {
                return this.f27757a;
            }

            public int b() {
                return this.f27758b;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.j$b$c */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f27759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f27760b;

            c(JSONObject jSONObject) {
                this.f27759a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.f27760b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            public long a() {
                return this.f27760b;
            }

            public long b() {
                return this.f27759a;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.j$b$d */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f27762b;

            d(JSONObject jSONObject) {
                this.f27761a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f27762b = true == strOptString.isEmpty() ? null : strOptString;
            }

            public String a() {
                return this.f27762b;
            }

            public String b() {
                return this.f27761a;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.j$b$e */
        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f27763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Long f27764b;

            e(JSONObject jSONObject) {
                this.f27763a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f27764b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            public Long a() {
                return this.f27764b;
            }

            public Long b() {
                return this.f27763a;
            }
        }

        b(JSONObject jSONObject) {
            this.f27737a = jSONObject.optString("formattedPrice");
            this.f27738b = jSONObject.optLong("priceAmountMicros");
            this.f27739c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f27740d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f27741e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f27742f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f27743g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f27743g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f27744h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f27745i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f27746j = jSONObjectOptJSONObject2 == null ? null : new e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f27747k = jSONObjectOptJSONObject3 == null ? null : new C0359b(jSONObjectOptJSONObject3);
            this.f27748l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f27749m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f27750n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f27751o = jSONObjectOptJSONObject6 != null ? new f0(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        public a a() {
            return this.f27745i;
        }

        public String b() {
            return this.f27737a;
        }

        public Long c() {
            return this.f27744h;
        }

        public C0359b d() {
            return this.f27747k;
        }

        public String e() {
            return this.f27741e;
        }

        public List f() {
            return this.f27743g;
        }

        public String g() {
            return this.f27740d;
        }

        public c h() {
            return this.f27749m;
        }

        public long i() {
            return this.f27738b;
        }

        public String j() {
            return this.f27739c;
        }

        public String k() {
            return this.f27742f;
        }

        public d l() {
            return this.f27750n;
        }

        public e m() {
            return this.f27746j;
        }

        public final f0 n() {
            return this.f27751o;
        }

        final String o() {
            return this.f27748l;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.j$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f27769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f27770f;

        c(JSONObject jSONObject) {
            this.f27768d = jSONObject.optString("billingPeriod");
            this.f27767c = jSONObject.optString("priceCurrencyCode");
            this.f27765a = jSONObject.optString("formattedPrice");
            this.f27766b = jSONObject.optLong("priceAmountMicros");
            this.f27770f = jSONObject.optInt("recurrenceMode");
            this.f27769e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f27769e;
        }

        public String b() {
            return this.f27768d;
        }

        public String c() {
            return this.f27765a;
        }

        public long d() {
            return this.f27766b;
        }

        public String e() {
            return this.f27767c;
        }

        public int f() {
            return this.f27770f;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.j$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27771a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f27771a = arrayList;
        }

        public List a() {
            return this.f27771a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.j$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f27775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f27776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f27777f;

        e(JSONObject jSONObject) throws JSONException {
            this.f27772a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f27773b = true == strOptString.isEmpty() ? null : strOptString;
            this.f27774c = jSONObject.getString("offerIdToken");
            this.f27775d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f27777f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f27776e = arrayList;
        }

        public String a() {
            return this.f27772a;
        }

        public a b() {
            return this.f27777f;
        }

        public String c() {
            return this.f27773b;
        }

        public List d() {
            return this.f27776e;
        }

        public String e() {
            return this.f27774c;
        }

        public d f() {
            return this.f27775d;
        }
    }

    C2137j(String str) {
        this.f27724a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f27725b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f27726c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f27727d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f27728e = jSONObject.optString("title");
        this.f27729f = jSONObject.optString("name");
        this.f27730g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f27731h = jSONObject.optString("skuDetailsToken");
        this.f27732i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f27733j = arrayList;
        } else {
            this.f27733j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f27725b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f27725b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f27734k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f27734k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f27734k = arrayList2;
        }
    }

    public String a() {
        return this.f27730g;
    }

    public String b() {
        return this.f27729f;
    }

    public b c() {
        List list = this.f27734k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List d() {
        return this.f27734k;
    }

    public String e() {
        return this.f27726c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2137j) {
            return TextUtils.equals(this.f27724a, ((C2137j) obj).f27724a);
        }
        return false;
    }

    public String f() {
        return this.f27727d;
    }

    public List g() {
        return this.f27733j;
    }

    public String h() {
        return this.f27728e;
    }

    public int hashCode() {
        return this.f27724a.hashCode();
    }

    public final String i() {
        return this.f27725b.optString("packageName");
    }

    final String j() {
        return this.f27731h;
    }

    final String k(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f27734k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.o()) && Objects.equals(bVar.g(), str)) {
                    return bVar.o();
                }
            }
        }
        return this.f27732i;
    }

    public String toString() {
        List list = this.f27733j;
        return "ProductDetails{jsonString='" + this.f27724a + "', parsedJson=" + this.f27725b.toString() + ", productId='" + this.f27726c + "', productType='" + this.f27727d + "', title='" + this.f27728e + "', productDetailsToken='" + this.f27731h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
