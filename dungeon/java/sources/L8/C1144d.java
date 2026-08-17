package L8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: L8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1144d extends p404w8.p {
    public static final Parcelable.Creator<C1144d> CREATOR = new C1146e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f6464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f6465b;

    public C1144d(C1142c c1142c) {
        this.f6464a = c1142c.a();
        this.f6465b = c1142c.f6457a;
    }

    C1144d(Bundle bundle, IBinder iBinder) {
        this.f6464a = bundle;
        this.f6465b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f6464a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.f(parcel, 1, bundle, false);
        p188k8.c.m(parcel, 2, this.f6465b, false);
        p188k8.c.b(parcel, iA);
    }
}
