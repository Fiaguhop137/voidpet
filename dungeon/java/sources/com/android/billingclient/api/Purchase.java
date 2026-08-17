package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f27565c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27566a;

        private a(JSONObject jSONObject) {
            this.f27566a = jSONObject;
        }

        /* synthetic */ a(JSONObject jSONObject, p131h4.S s10) {
            this(jSONObject);
        }

        public List a() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f27566a.has("productIds") && (jSONArrayOptJSONArray = this.f27566a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        public String b() {
            return this.f27566a.optString("purchaseToken");
        }
    }

    public Purchase(String str, String str2) {
        this.f27563a = str;
        this.f27564b = str2;
        this.f27565c = new JSONObject(str);
    }

    private final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f27565c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public C2128a a() {
        JSONObject jSONObject = this.f27565c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C2128a(strOptString, strOptString2);
    }

    public String b() {
        return this.f27565c.optString("developerPayload");
    }

    public String c() {
        String strOptString = this.f27565c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String d() {
        return this.f27563a;
    }

    public String e() {
        return this.f27565c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f27563a, purchase.d()) && TextUtils.equals(this.f27564b, purchase.l());
    }

    public a f() {
        JSONObject jSONObjectOptJSONObject = this.f27565c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new a(jSONObjectOptJSONObject, null);
    }

    public List g() {
        return o();
    }

    public int h() {
        return this.f27565c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f27563a.hashCode();
    }

    public long i() {
        return this.f27565c.optLong("purchaseTime");
    }

    public String j() {
        JSONObject jSONObject = this.f27565c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int k() {
        return this.f27565c.optInt("quantity", 1);
    }

    public String l() {
        return this.f27564b;
    }

    public boolean m() {
        return this.f27565c.optBoolean("acknowledged", true);
    }

    public boolean n() {
        return this.f27565c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f27563a));
    }
}
