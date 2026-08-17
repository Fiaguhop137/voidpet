package W8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p188k8.a implements p135h8.k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f14963c;

    b(int i10, int i11, Intent intent) {
        this.f14961a = i10;
        this.f14962b = i11;
        this.f14963c = intent;
    }

    @Override // p135h8.k
    public final Status t() {
        return this.f14962b == 0 ? Status.f31714f : Status.f31718j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14961a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.n(parcel, 2, this.f14962b);
        p188k8.c.t(parcel, 3, this.f14963c, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
