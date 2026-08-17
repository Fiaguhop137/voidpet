package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C2132e;
import com.android.billingclient.api.C2133f;
import com.android.billingclient.api.C2138k;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f34485a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return o(intent.getExtras(), "ProxyBillingActivity");
        }
        m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle d(C2133f c2133f, P2 p10) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c2133f.c());
        bundle.putString("DEBUG_MESSAGE", c2133f.a());
        bundle.putInt("LOG_REASON", p10.zza());
        return bundle;
    }

    public static Bundle e(C2133f c2133f, P2 p10, String str) {
        Bundle bundleD = d(c2133f, p10);
        if (str != null) {
            bundleD.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleD;
    }

    public static Bundle f(C2132e c2132e, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2, long j10, String str3, long j11) {
        Bundle bundle = new Bundle();
        c(bundle, str, str2, j10);
        bundle.putLong("billingClientTransactionId", j11);
        if (c2132e.d() != 0) {
            bundle.putInt("prorationMode", c2132e.d());
        }
        if (!TextUtils.isEmpty(c2132e.g())) {
            bundle.putString("accountId", c2132e.g());
        }
        if (!TextUtils.isEmpty(c2132e.h())) {
            bundle.putString("obfuscatedProfileId", c2132e.h());
        }
        if (c2132e.v()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(c2132e.j())) {
            bundle.putString("oldSkuPurchaseToken", c2132e.j());
        }
        c2132e.i();
        if (!TextUtils.isEmpty(null)) {
            c2132e.i();
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(c2132e.k())) {
            bundle.putString("originalExternalTransactionId", c2132e.k());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z14) {
            bundle.putBoolean("enableAlternativeBilling", true);
        } else {
            c2132e.a();
        }
        c2132e.e();
        c2132e.c();
        c2132e.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = c2132e.m().iterator();
        while (it.hasNext()) {
            ((C2132e.b) it.next()).a();
        }
        if (!arrayList.isEmpty()) {
            O0 o0C = P0.C();
            o0C.l(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", ((P0) o0C.f()).a());
        }
        return bundle;
    }

    public static Bundle g(String str, String str2, ArrayList arrayList, String str3, String str4, C2786a c2786a, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(K.p("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(K.o("inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(K.o("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (c2786a.f34682a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C2138k.b bVar = (C2138k.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z11 |= !TextUtils.isEmpty(null);
            if (bVar.c().equals("first_party")) {
                AbstractC2895x.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static C2133f h(Intent intent, String str) {
        if (intent != null) {
            C2133f.a aVarD = C2133f.d();
            aVarD.d(b(intent.getExtras(), str));
            aVarD.b(i(intent.getExtras(), str));
            return aVarD.a();
        }
        m("BillingHelper", "Got null intent!");
        C2133f.a aVarD2 = C2133f.d();
        aVarD2.d(6);
        aVarD2.b("An internal error occurred.");
        return aVarD2.a();
    }

    public static String i(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String j(int i10) {
        return EnumC2851n.e(i10).toString();
    }

    public static List k(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseP = p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseP == null) {
                l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseP);
            return arrayList;
        }
        l("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            Purchase purchaseP2 = p(stringArrayList.get(i10), stringArrayList2.get(i10));
            if (purchaseP2 != null) {
                arrayList.add(purchaseP2);
            }
        }
        return arrayList;
    }

    public static void l(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static int o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase p(String str, String str2) {
        if (str == null || str2 == null) {
            l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
