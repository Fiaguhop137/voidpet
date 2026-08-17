package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3038r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f35815d;

    public C3038r2(String str, String str2, Bundle bundle, long j10) {
        this.f35812a = str;
        this.f35813b = str2;
        this.f35815d = bundle;
        this.f35814c = j10;
    }

    public static C3038r2 a(G g10) {
        return new C3038r2(g10.f35006a, g10.f35008c, g10.f35007b.e4(), g10.f35009d);
    }

    public final G b() {
        return new G(this.f35812a, new E(new Bundle(this.f35815d)), this.f35813b, this.f35814c);
    }

    public final String toString() {
        String str = this.f35813b;
        String string = this.f35815d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f35812a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
