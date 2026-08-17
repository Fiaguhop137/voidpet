package A8;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p188k8.a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f252e;

    p(long j10, String str, int i10, ComponentName componentName, String str2) {
        this.f248a = j10;
        this.f249b = str;
        this.f250c = i10;
        this.f251d = componentName;
        this.f252e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.r(parcel, 1, this.f248a);
        p188k8.c.u(parcel, 2, this.f249b, false);
        p188k8.c.n(parcel, 3, this.f250c);
        p188k8.c.t(parcel, 4, this.f251d, i10, false);
        p188k8.c.u(parcel, 5, this.f252e, false);
        p188k8.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f250c;
    }

    public final String zzb() {
        return this.f252e;
    }
}
