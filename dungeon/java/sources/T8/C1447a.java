package T8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: T8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1447a extends p188k8.a {
    public static final Parcelable.Creator<C1447a> CREATOR = new C1448b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f12350a;

    public C1447a(Bundle bundle) {
        this.f12350a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f12350a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.f(parcel, 1, bundle, false);
        p188k8.c.b(parcel, iA);
    }
}
