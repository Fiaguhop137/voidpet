package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p188k8.a {
    public static final Parcelable.Creator<l> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7031b;

    public l(String str, String str2) {
        this.f7030a = str;
        this.f7031b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f7030a, false);
        p188k8.c.u(parcel, 2, this.f7031b, false);
        p188k8.c.b(parcel, iA);
    }
}
