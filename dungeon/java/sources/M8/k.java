package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends p188k8.a {
    public static final Parcelable.Creator<k> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7029b;

    public k(String str, String str2) {
        this.f7028a = str;
        this.f7029b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f7028a, false);
        p188k8.c.u(parcel, 2, this.f7029b, false);
        p188k8.c.b(parcel, iA);
    }
}
