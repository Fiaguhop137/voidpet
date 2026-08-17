package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p188k8.a;
import p188k8.c;

/* JADX INFO: renamed from: j8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3841f extends a {

    @NonNull
    public static final Parcelable.Creator<C3841f> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3854t f46955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f46957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f46958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f46960f;

    public C3841f(C3854t c3854t, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f46955a = c3854t;
        this.f46956b = z10;
        this.f46957c = z11;
        this.f46958d = iArr;
        this.f46959e = i10;
        this.f46960f = iArr2;
    }

    public int a4() {
        return this.f46959e;
    }

    public int[] b4() {
        return this.f46958d;
    }

    public int[] c4() {
        return this.f46960f;
    }

    public boolean d4() {
        return this.f46956b;
    }

    public boolean e4() {
        return this.f46957c;
    }

    public final C3854t f4() {
        return this.f46955a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.f46955a, i10, false);
        c.c(parcel, 2, d4());
        c.c(parcel, 3, e4());
        c.o(parcel, 4, b4(), false);
        c.n(parcel, 5, a4());
        c.o(parcel, 6, c4(), false);
        c.b(parcel, iA);
    }
}
