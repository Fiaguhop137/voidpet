package p423x9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // p423x9.f
    public final void u0(String str, Bundle bundle, h hVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        c.c(parcelG, bundle);
        c.d(parcelG, hVar);
        h(2, parcelG);
    }
}
