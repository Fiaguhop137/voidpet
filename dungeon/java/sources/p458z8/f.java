package p458z8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;
import p188k8.c;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58498a;

    public f(String str) {
        this.f58498a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return AbstractC3851p.a(this.f58498a, ((f) obj).f58498a);
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f58498a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f58498a;
        int iA = c.a(parcel);
        c.u(parcel, 1, str, false);
        c.b(parcel, iA);
    }
}
