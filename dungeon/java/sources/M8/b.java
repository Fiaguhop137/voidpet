package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p188k8.a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f6976b;

    public b(int i10, String[] strArr) {
        this.f6975a = i10;
        this.f6976b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f6975a);
        p188k8.c.v(parcel, 2, this.f6976b, false);
        p188k8.c.b(parcel, iA);
    }
}
