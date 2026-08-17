package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p188k8.a {
    public static final Parcelable.Creator<g> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7016d;

    public g(int i10, String str, String str2, String str3) {
        this.f7013a = i10;
        this.f7014b = str;
        this.f7015c = str2;
        this.f7016d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f7013a);
        p188k8.c.u(parcel, 2, this.f7014b, false);
        p188k8.c.u(parcel, 3, this.f7015c, false);
        p188k8.c.u(parcel, 4, this.f7016d, false);
        p188k8.c.b(parcel, iA);
    }
}
