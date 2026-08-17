package p081e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p188k8.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f40660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f40662c;

    a(int i10, int i11, Bundle bundle) {
        this.f40660a = i10;
        this.f40661b = i11;
        this.f40662c = bundle;
    }

    public int getType() {
        return this.f40661b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f40660a);
        c.n(parcel, 2, getType());
        c.f(parcel, 3, this.f40662c, false);
        c.b(parcel, iA);
    }
}
