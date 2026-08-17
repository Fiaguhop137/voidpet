package S2;

import U1.AbstractC1459a;
import U1.AbstractC1465g;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(AbstractC1465g.a(new a(), (ArrayList) AbstractC1459a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
