package W8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2333b;
import p170j8.T;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p188k8.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2333b f14969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f14970c;

    l(int i10, C2333b c2333b, T t10) {
        this.f14968a = i10;
        this.f14969b = c2333b;
        this.f14970c = t10;
    }

    public final C2333b a4() {
        return this.f14969b;
    }

    public final T b4() {
        return this.f14970c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f14968a);
        p188k8.c.t(parcel, 2, this.f14969b, i10, false);
        p188k8.c.t(parcel, 3, this.f14970c, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
