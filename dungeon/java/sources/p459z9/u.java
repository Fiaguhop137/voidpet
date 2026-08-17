package p459z9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC4386a implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p459z9.w
    public final void c0(Bundle bundle, y yVar) {
        Parcel parcelG = g();
        q.c(parcelG, bundle);
        parcelG.writeStrongBinder(yVar);
        h(2, parcelG);
    }
}
