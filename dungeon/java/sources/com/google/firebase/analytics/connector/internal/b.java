package com.google.firebase.analytics.connector.internal;

import C9.AbstractC0876t;
import C9.AbstractC0878v;
import T8.y;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0878v f37354a = AbstractC0878v.B("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0876t f37355b = AbstractC0876t.C("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0876t f37356c = AbstractC0876t.A("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0876t f37357d = AbstractC0876t.y("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0876t f37358e = new AbstractC0876t.a().i(y.f12375a).i(y.f12376b).k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC0876t f37359f = AbstractC0876t.y("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f37356c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f37355b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC0876t abstractC0876t = f37357d;
        int size = abstractC0876t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC0876t.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f37358e.contains(str2)) {
            return false;
        }
        AbstractC0876t abstractC0876t = f37359f;
        int size = abstractC0876t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) abstractC0876t.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public static boolean d(String str, String str2, Bundle bundle) {
        byte b10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        AbstractC0876t abstractC0876t = f37357d;
        int size = abstractC0876t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC0876t.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("fdl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("fcm")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
