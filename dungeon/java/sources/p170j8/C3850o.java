package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p188k8.a;
import p188k8.c;

/* JADX INFO: renamed from: j8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3850o extends a {

    @NonNull
    public static final Parcelable.Creator<C3850o> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f47014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f47015i;

    public C3850o(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f47007a = i10;
        this.f47008b = i11;
        this.f47009c = i12;
        this.f47010d = j10;
        this.f47011e = j11;
        this.f47012f = str;
        this.f47013g = str2;
        this.f47014h = i13;
        this.f47015i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f47007a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f47008b);
        c.n(parcel, 3, this.f47009c);
        c.r(parcel, 4, this.f47010d);
        c.r(parcel, 5, this.f47011e);
        c.u(parcel, 6, this.f47012f, false);
        c.u(parcel, 7, this.f47013g, false);
        c.n(parcel, 8, this.f47014h);
        c.n(parcel, 9, this.f47015i);
        c.b(parcel, iA);
    }
}
