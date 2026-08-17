package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p170j8.AbstractC3851p;
import p170j8.r;
import p188k8.c;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends p {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54547c;

    public k(int i10, long j10, long j11) {
        r.p(j10 >= 0, "Min XP must be positive!");
        r.p(j11 > j10, "Max XP must be more than min XP!");
        this.f54545a = i10;
        this.f54546b = j10;
        this.f54547c = j11;
    }

    public int a4() {
        return this.f54545a;
    }

    public long b4() {
        return this.f54547c;
    }

    public long c4() {
        return this.f54546b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k kVar = (k) obj;
        return AbstractC3851p.a(Integer.valueOf(kVar.a4()), Integer.valueOf(a4())) && AbstractC3851p.a(Long.valueOf(kVar.c4()), Long.valueOf(c4())) && AbstractC3851p.a(Long.valueOf(kVar.b4()), Long.valueOf(b4()));
    }

    public int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f54545a), Long.valueOf(this.f54546b), Long.valueOf(this.f54547c));
    }

    public String toString() {
        return AbstractC3851p.c(this).a("LevelNumber", Integer.valueOf(a4())).a("MinXp", Long.valueOf(c4())).a("MaxXp", Long.valueOf(b4())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, a4());
        c.r(parcel, 2, c4());
        c.r(parcel, 3, b4());
        c.b(parcel, iA);
    }
}
