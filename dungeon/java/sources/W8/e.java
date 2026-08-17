package W8;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends I8.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // I8.b
    protected final boolean c1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                I8.c.b(parcel);
                break;
            case 4:
                I8.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                I8.c.b(parcel);
                break;
            case 7:
                I8.c.b(parcel);
                break;
            case 8:
                l lVar = (l) I8.c.a(parcel, l.CREATOR);
                I8.c.b(parcel);
                l0(lVar);
                break;
            case 9:
                I8.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
