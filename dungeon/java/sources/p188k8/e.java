package p188k8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        r.l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return dVar;
    }
}
