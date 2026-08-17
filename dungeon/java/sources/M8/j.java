package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p188k8.a {
    public static final Parcelable.Creator<j> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7027b;

    public j(int i10, String str) {
        this.f7026a = i10;
        this.f7027b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f7026a);
        p188k8.c.u(parcel, 2, this.f7027b, false);
        p188k8.c.b(parcel, iA);
    }
}
