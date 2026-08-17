package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S extends B implements T {
    public S() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static T asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcel.readStrongBinder());
        C c10 = (C) AbstractC2673d0.a(parcel, C.CREATOR);
        AbstractC2673d0.b(parcel);
        P pNewBarcodeScanner = newBarcodeScanner(aVarH, c10);
        parcel2.writeNoException();
        if (pNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(pNewBarcodeScanner.asBinder());
        }
        return true;
    }
}
