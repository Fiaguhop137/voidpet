package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O extends B implements P {
    public O() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            c();
            parcel2.writeNoException();
        } else if (i10 == 3) {
            p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcel.readStrongBinder());
            C2688g0 c2688g0 = (C2688g0) AbstractC2673d0.a(parcel, C2688g0.CREATOR);
            AbstractC2673d0.b(parcel);
            List listR = r(aVarH, c2688g0);
            parcel2.writeNoException();
            parcel2.writeTypedList(listR);
        } else if (i10 == 4) {
            p314r8.a aVarH2 = p314r8.a.AbstractBinderC0632a.h(parcel.readStrongBinder());
            C2688g0 c2688g1 = (C2688g0) AbstractC2673d0.a(parcel, C2688g0.CREATOR);
            E e10 = (E) AbstractC2673d0.a(parcel, E.CREATOR);
            AbstractC2673d0.b(parcel);
            List listR0 = r0(aVarH2, c2688g1, e10);
            parcel2.writeNoException();
            parcel2.writeTypedList(listR0);
        } else {
            if (i10 != 5) {
                return false;
            }
            G g10 = (G) AbstractC2673d0.a(parcel, G.CREATOR);
            AbstractC2673d0.b(parcel);
            D(g10);
            parcel2.writeNoException();
        }
        return true;
    }
}
