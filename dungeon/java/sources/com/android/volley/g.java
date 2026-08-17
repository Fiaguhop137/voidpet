package com.android.volley;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27873b;

    public g(String str, String str2) {
        this.f27872a = str;
        this.f27873b = str2;
    }

    public final String a() {
        return this.f27872a;
    }

    public final String b() {
        return this.f27873b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f27872a, gVar.f27872a) && TextUtils.equals(this.f27873b, gVar.f27873b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f27872a.hashCode() * 31) + this.f27873b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f27872a + ",value=" + this.f27873b + "]";
    }
}
