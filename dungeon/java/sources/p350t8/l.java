package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p170j8.AbstractC3851p;
import p170j8.r;
import p188k8.c;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f54550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f54551d;

    public l(long j10, long j11, k kVar, k kVar2) {
        r.o(j10 != -1);
        r.l(kVar);
        r.l(kVar2);
        this.f54548a = j10;
        this.f54549b = j11;
        this.f54550c = kVar;
        this.f54551d = kVar2;
    }

    public k a4() {
        return this.f54550c;
    }

    public long b4() {
        return this.f54548a;
    }

    public long c4() {
        return this.f54549b;
    }

    public k d4() {
        return this.f54551d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        return AbstractC3851p.a(Long.valueOf(this.f54548a), Long.valueOf(lVar.f54548a)) && AbstractC3851p.a(Long.valueOf(this.f54549b), Long.valueOf(lVar.f54549b)) && AbstractC3851p.a(this.f54550c, lVar.f54550c) && AbstractC3851p.a(this.f54551d, lVar.f54551d);
    }

    public int hashCode() {
        return AbstractC3851p.b(Long.valueOf(this.f54548a), Long.valueOf(this.f54549b), this.f54550c, this.f54551d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.r(parcel, 1, b4());
        c.r(parcel, 2, c4());
        c.t(parcel, 3, a4(), i10, false);
        c.t(parcel, 4, d4(), i10, false);
        c.b(parcel, iA);
    }
}
