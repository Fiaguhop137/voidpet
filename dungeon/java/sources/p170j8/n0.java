package p170j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2335d;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f47003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C2335d[] f47004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f47005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C3841f f47006d;

    n0(Bundle bundle, C2335d[] c2335dArr, int i10, C3841f c3841f) {
        this.f47003a = bundle;
        this.f47004b = c2335dArr;
        this.f47005c = i10;
        this.f47006d = c3841f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.f(parcel, 1, this.f47003a, false);
        c.x(parcel, 2, this.f47004b, i10, false);
        c.n(parcel, 3, this.f47005c);
        c.t(parcel, 4, this.f47006d, i10, false);
        c.b(parcel, iA);
    }
}
