package p081e8;

import H8.c;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // H8.c
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            p();
        } else {
            if (i10 != 2) {
                return false;
            }
            v();
        }
        return true;
    }
}
