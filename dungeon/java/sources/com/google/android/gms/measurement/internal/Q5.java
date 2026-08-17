package com.google.android.gms.measurement.internal;

import C9.AbstractC0876t;
import C9.AbstractC0877u;
import C9.AbstractC0878v;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC2585r4;
import com.google.android.gms.internal.measurement.EnumC2594s4;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC0876t f35169a = AbstractC0876t.D("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean c(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        AbstractC0878v abstractC0878v2;
        String str4;
        P5 p10;
        char c10;
        int iE = e(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == EnumC2594s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC2585r4 == EnumC2585r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC0878v2 = abstractC0878v;
                str4 = str;
                if (i17 == 1) {
                    if (abstractC0878v2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                abstractC0878v2 = abstractC0878v;
                str4 = str;
            }
            if (abstractC0877u.containsKey(enumC2585r4) && (p10 = (P5) abstractC0877u.get(enumC2585r4)) != null) {
                int iOrdinal = p10.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == EnumC2594s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == EnumC2594s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC2594s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC2594s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return AbstractC0877u.k();
        }
        EnumC2585r4 enumC2585r4 = EnumC2585r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC2594s4 enumC2594s4 = (EnumC2594s4) abstractC0877u2.get(enumC2585r4);
        EnumC2585r4 enumC2585r5 = EnumC2585r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC2594s4 enumC2594s5 = (EnumC2594s4) abstractC0877u2.get(enumC2585r5);
        EnumC2585r4 enumC2585r6 = EnumC2585r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC2594s4 enumC2594s6 = (EnumC2594s4) abstractC0877u2.get(enumC2585r6);
        EnumC2585r4 enumC2585r7 = EnumC2585r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC2594s4 enumC2594s7 = (EnumC2594s4) abstractC0877u2.get(enumC2585r7);
        return AbstractC0877u.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC2594s4 != null ? enumC2594s4.zza() : EnumC2594s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC2594s5 != null ? enumC2594s5.zza() : EnumC2594s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC2594s6 != null ? enumC2594s6.zza() : EnumC2594s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC2594s7 != null ? enumC2594s7.zza() : EnumC2594s4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(AbstractC0877u.m("Purpose1", f(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(enumC2585r5, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(enumC2585r6, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(enumC2585r7, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(AbstractC0877u.n("AuthorizePurpose1", true != c(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(enumC2585r5, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(enumC2585r6, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != c(enumC2585r7, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int e(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC2585r4 == EnumC2585r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC2585r4 == EnumC2585r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC2585r4 == EnumC2585r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC2585r4 == EnumC2585r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < enumC2585r4.zza()) ? "0" : String.valueOf(str2.charAt(enumC2585r4.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC2585r4.zza()) {
            strValueOf = String.valueOf(str3.charAt(enumC2585r4.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean g(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC2585r4.zza()) {
                char cCharAt = str2.charAt(enumC2585r4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final boolean h(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC2585r4, abstractC0877u, abstractC0877u2, abstractC0878v, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC2585r4.zza()) {
                char cCharAt = str3.charAt(enumC2585r4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final EnumC2594s4 i(EnumC2585r4 enumC2585r4, AbstractC0877u abstractC0877u, AbstractC0877u abstractC0877u2, AbstractC0878v abstractC0878v, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC2594s4) abstractC0877u2.getOrDefault(enumC2585r4, EnumC2594s4.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
