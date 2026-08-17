package p404w8;

import L8.AbstractBinderC1170q;
import L8.C1144d;
import L8.L;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends AbstractBinderC1170q implements g {
    public f() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // L8.AbstractBinderC1170q
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1001) {
            return false;
        }
        C1144d c1144dZzb = zzb();
        parcel2.writeNoException();
        int i12 = L.f6435a;
        parcel2.writeInt(1);
        c1144dZzb.writeToParcel(parcel2, 1);
        return true;
    }
}
