package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p188k8.a {
    public static final Parcelable.Creator<h> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f7017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f7018b;

    public h(double d10, double d11) {
        this.f7017a = d10;
        this.f7018b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.h(parcel, 1, this.f7017a);
        p188k8.c.h(parcel, 2, this.f7018b);
        p188k8.c.b(parcel, iA);
    }
}
