package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f31903a;

    public BinderWrapper(IBinder iBinder) {
        this.f31903a = iBinder;
    }

    /* synthetic */ BinderWrapper(Parcel parcel, byte[] bArr) {
        this.f31903a = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f31903a);
    }
}
