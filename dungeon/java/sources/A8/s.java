package A8;

import L8.AbstractBinderC1170q;
import L8.L;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends AbstractBinderC1170q implements t {
    public s() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }

    @Override // L8.AbstractBinderC1170q
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) L.b(parcel, Status.CREATOR);
            L.e(parcel);
            h0(status);
        } else if (i10 == 2) {
            com.google.android.gms.games.internal.v2.appshortcuts.g gVar = (com.google.android.gms.games.internal.v2.appshortcuts.g) L.b(parcel, com.google.android.gms.games.internal.v2.appshortcuts.g.CREATOR);
            L.e(parcel);
            E0(gVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            Intent intent = (Intent) L.b(parcel, Intent.CREATOR);
            L.e(parcel);
            f(intent);
        }
        return true;
    }
}
