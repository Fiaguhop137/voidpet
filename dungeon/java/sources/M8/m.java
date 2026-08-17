package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends p188k8.a {
    public static final Parcelable.Creator<m> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7034c;

    public m(String str, String str2, int i10) {
        this.f7032a = str;
        this.f7033b = str2;
        this.f7034c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f7032a, false);
        p188k8.c.u(parcel, 2, this.f7033b, false);
        p188k8.c.n(parcel, 3, this.f7034c);
        p188k8.c.b(parcel, iA);
    }
}
