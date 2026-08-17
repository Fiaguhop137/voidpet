package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends p188k8.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f35007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35009d;

    G(G g10, long j10) {
        p170j8.r.l(g10);
        this.f35006a = g10.f35006a;
        this.f35007b = g10.f35007b;
        this.f35008c = g10.f35008c;
        this.f35009d = j10;
    }

    public G(String str, E e10, String str2, long j10) {
        this.f35006a = str;
        this.f35007b = e10;
        this.f35008c = str2;
        this.f35009d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f35007b);
        String str = this.f35008c;
        int length = String.valueOf(str).length();
        String str2 = this.f35006a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        H.a(this, parcel, i10);
    }
}
