package L8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends p188k8.a {
    public static final Parcelable.Creator<P0> CREATOR = new Q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f6442a;

    P0(Intent intent) {
        this.f6442a = intent;
    }

    public static P0 a4(Intent intent) {
        return new P0(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P0) {
            return AbstractC3851p.a(this.f6442a, ((P0) obj).f6442a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f6442a;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("resultData", this.f6442a).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intent intent = this.f6442a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, intent, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
