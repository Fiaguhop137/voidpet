package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p188k8.a;
import p188k8.c;

/* JADX INFO: renamed from: j8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3854t extends a {

    @NonNull
    public static final Parcelable.Creator<C3854t> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47038e;

    public C3854t(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f47034a = i10;
        this.f47035b = z10;
        this.f47036c = z11;
        this.f47037d = i11;
        this.f47038e = i12;
    }

    public int a4() {
        return this.f47037d;
    }

    public int b4() {
        return this.f47038e;
    }

    public boolean c4() {
        return this.f47035b;
    }

    public boolean d4() {
        return this.f47036c;
    }

    public int e4() {
        return this.f47034a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, e4());
        c.c(parcel, 2, c4());
        c.c(parcel, 3, d4());
        c.n(parcel, 4, a4());
        c.n(parcel, 5, b4());
        c.b(parcel, iA);
    }
}
