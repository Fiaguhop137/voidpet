package G8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void k(zza zzaVar, f fVar) {
        Parcel parcelG = g();
        c.b(parcelG, zzaVar);
        c.c(parcelG, fVar);
        h(1, parcelG);
    }
}
