package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2879t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2875s f34803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2875s f34804c;

    /* synthetic */ C2879t(String str, AbstractC2883u abstractC2883u) {
        C2875s c2875s = new C2875s();
        this.f34803b = c2875s;
        this.f34804c = c2875s;
        str.getClass();
        this.f34802a = str;
    }

    public final C2879t a(Object obj) {
        C2875s c2875s = new C2875s();
        this.f34804c.f34801b = c2875s;
        this.f34804c = c2875s;
        c2875s.f34800a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f34802a);
        sb2.append('{');
        C2875s c2875s = this.f34803b.f34801b;
        String str = "";
        while (c2875s != null) {
            Object obj = c2875s.f34800a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c2875s = c2875s.f34801b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
