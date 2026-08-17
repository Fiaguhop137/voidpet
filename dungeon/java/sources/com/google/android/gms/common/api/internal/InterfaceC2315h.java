package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2315h extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h$a */
    public static abstract class a extends I8.b implements InterfaceC2315h {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // I8.b
        protected final boolean c1(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) I8.c.a(parcel, Status.CREATOR);
            I8.c.b(parcel);
            w0(status);
            return true;
        }
    }

    void w0(Status status);
}
