package p170j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2333b;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f46889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f46890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2333b f46891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f46892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f46893e;

    T(int i10, IBinder iBinder, C2333b c2333b, boolean z10, boolean z11) {
        this.f46889a = i10;
        this.f46890b = iBinder;
        this.f46891c = c2333b;
        this.f46892d = z10;
        this.f46893e = z11;
    }

    public final C2333b a4() {
        return this.f46891c;
    }

    public final InterfaceC3846k b4() {
        IBinder iBinder = this.f46890b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3846k.a.h(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return this.f46891c.equals(t10.f46891c) && AbstractC3851p.a(b4(), t10.b4());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f46889a);
        c.m(parcel, 2, this.f46890b, false);
        c.t(parcel, 3, this.f46891c, i10, false);
        c.c(parcel, 4, this.f46892d);
        c.c(parcel, 5, this.f46893e);
        c.b(parcel, iA);
    }
}
