package O8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;

/* JADX INFO: renamed from: O8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1252a extends p188k8.a {
    public static final Parcelable.Creator<C1252a> CREATOR = new C1253b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8492b;

    public C1252a() {
    }

    public C1252a(int i10, boolean z10) {
        this.f8491a = i10;
        this.f8492b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1252a)) {
            return false;
        }
        C1252a c1252a = (C1252a) obj;
        return this.f8491a == c1252a.f8491a && AbstractC3851p.a(Boolean.valueOf(this.f8492b), Boolean.valueOf(c1252a.f8492b));
    }

    public final int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f8491a), Boolean.valueOf(this.f8492b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 2, this.f8491a);
        p188k8.c.c(parcel, 3, this.f8492b);
        p188k8.c.b(parcel, iA);
    }
}
