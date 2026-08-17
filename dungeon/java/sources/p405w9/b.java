package p405w9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new f();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    abstract PendingIntent f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(f(), 0);
        parcel.writeInt(zzb() ? 1 : 0);
    }

    abstract boolean zzb();
}
