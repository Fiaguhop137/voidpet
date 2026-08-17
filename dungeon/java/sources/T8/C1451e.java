package T8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import java.util.List;

/* JADX INFO: renamed from: T8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1451e extends O implements InterfaceC1453g {
    C1451e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // T8.InterfaceC1453g
    public final void W(List list) {
        Parcel parcelH = h();
        parcelH.writeTypedList(list);
        c1(2, parcelH);
    }
}
