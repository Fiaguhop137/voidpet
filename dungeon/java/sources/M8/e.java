package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p188k8.a {
    public static final Parcelable.Creator<e> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j[] f6995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g[] f6996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f6997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b[] f6998g;

    public e(i iVar, String str, String str2, j[] jVarArr, g[] gVarArr, String[] strArr, b[] bVarArr) {
        this.f6992a = iVar;
        this.f6993b = str;
        this.f6994c = str2;
        this.f6995d = jVarArr;
        this.f6996e = gVarArr;
        this.f6997f = strArr;
        this.f6998g = bVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, this.f6992a, i10, false);
        p188k8.c.u(parcel, 2, this.f6993b, false);
        p188k8.c.u(parcel, 3, this.f6994c, false);
        p188k8.c.x(parcel, 4, this.f6995d, i10, false);
        p188k8.c.x(parcel, 5, this.f6996e, i10, false);
        p188k8.c.v(parcel, 6, this.f6997f, false);
        p188k8.c.x(parcel, 7, this.f6998g, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
