package W8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.Q;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p188k8.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Q f14967b;

    j(int i10, Q q10) {
        this.f14966a = i10;
        this.f14967b = q10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f14966a);
        p188k8.c.t(parcel, 2, this.f14967b, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
