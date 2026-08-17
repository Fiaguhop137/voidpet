package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q3 {
    public static E0 a(N3 n10) {
        L3 l10 = new L3();
        P3 p10 = new P3(l10);
        l10.f34474b = p10;
        l10.f34473a = n10.getClass();
        try {
            l10.f34473a = n10.a(l10);
            return p10;
        } catch (Exception e10) {
            p10.b(e10);
            return p10;
        }
    }
}
