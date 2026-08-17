package L8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends p188k8.a {
    public static final Parcelable.Creator<K0> CREATOR = new L0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6434a;

    K0(String str) {
        this.f6434a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K0) {
            return AbstractC3851p.a(this.f6434a, ((K0) obj).f6434a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f6434a);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("gameRunToken", this.f6434a).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6434a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        p188k8.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f6434a;
    }
}
