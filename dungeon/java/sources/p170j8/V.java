package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends a {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f46894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Scope[] f46897d;

    V(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f46894a = i10;
        this.f46895b = i11;
        this.f46896c = i12;
        this.f46897d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f46894a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f46895b);
        c.n(parcel, 3, this.f46896c);
        c.x(parcel, 4, this.f46897d, i10, false);
        c.b(parcel, iA);
    }
}
