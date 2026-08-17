package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p188k8.a {
    public static final Parcelable.Creator<c> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f6984h;

    public c(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f6977a = i10;
        this.f6978b = i11;
        this.f6979c = i12;
        this.f6980d = i13;
        this.f6981e = i14;
        this.f6982f = i15;
        this.f6983g = z10;
        this.f6984h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f6977a);
        p188k8.c.n(parcel, 2, this.f6978b);
        p188k8.c.n(parcel, 3, this.f6979c);
        p188k8.c.n(parcel, 4, this.f6980d);
        p188k8.c.n(parcel, 5, this.f6981e);
        p188k8.c.n(parcel, 6, this.f6982f);
        p188k8.c.c(parcel, 7, this.f6983g);
        p188k8.c.u(parcel, 8, this.f6984h, false);
        p188k8.c.b(parcel, iA);
    }
}
