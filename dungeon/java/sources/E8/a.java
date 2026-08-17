package E8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p170j8.AbstractC3851p;
import p188k8.c;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f2729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f2730e;

    public a(boolean z10, boolean z11, boolean z12, boolean[] zArr, boolean[] zArr2) {
        this.f2726a = z10;
        this.f2727b = z11;
        this.f2728c = z12;
        this.f2729d = zArr;
        this.f2730e = zArr2;
    }

    public boolean[] a4() {
        return this.f2729d;
    }

    public boolean[] b4() {
        return this.f2730e;
    }

    public boolean c4() {
        return this.f2726a;
    }

    public boolean d4() {
        return this.f2727b;
    }

    public boolean e4() {
        return this.f2728c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return AbstractC3851p.a(aVar.a4(), a4()) && AbstractC3851p.a(aVar.b4(), b4()) && AbstractC3851p.a(Boolean.valueOf(aVar.c4()), Boolean.valueOf(c4())) && AbstractC3851p.a(Boolean.valueOf(aVar.d4()), Boolean.valueOf(d4())) && AbstractC3851p.a(Boolean.valueOf(aVar.e4()), Boolean.valueOf(e4()));
    }

    public int hashCode() {
        return AbstractC3851p.b(a4(), b4(), Boolean.valueOf(c4()), Boolean.valueOf(d4()), Boolean.valueOf(e4()));
    }

    public String toString() {
        return AbstractC3851p.c(this).a("SupportedCaptureModes", a4()).a("SupportedQualityLevels", b4()).a("CameraSupported", Boolean.valueOf(c4())).a("MicSupported", Boolean.valueOf(d4())).a("StorageWriteSupported", Boolean.valueOf(e4())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.c(parcel, 1, c4());
        c.c(parcel, 2, d4());
        c.c(parcel, 3, e4());
        c.d(parcel, 4, a4(), false);
        c.d(parcel, 5, b4(), false);
        c.b(parcel, iA);
    }
}
