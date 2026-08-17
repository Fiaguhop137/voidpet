package L8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends p188k8.a {
    public static final Parcelable.Creator<I0> CREATOR = new J0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P0 f6431b;

    I0(int i10, P0 p10) {
        this.f6430a = i10;
        this.f6431b = p10;
    }

    public static I0 a4(int i10) {
        return new I0(i10, null);
    }

    public static I0 b4(int i10, P0 p10) {
        return new I0(i10, p10);
    }

    public final boolean a() {
        return this.f6431b == null;
    }

    public final int c4() {
        return this.f6430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i10 = (I0) obj;
        return this.f6430a == i10.f6430a && AbstractC3851p.a(this.f6431b, i10.f6431b);
    }

    public final int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f6430a), this.f6431b);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("signInType", Integer.valueOf(this.f6430a)).a("previousStepResolutionResult", this.f6431b).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f6430a);
        p188k8.c.t(parcel, 2, this.f6431b, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
