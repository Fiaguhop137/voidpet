package p117g8;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Messenger f42210a;

    public l(IBinder iBinder) {
        this.f42210a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return f().equals(((l) obj).f());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final IBinder f() {
        Messenger messenger = this.f42210a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final int hashCode() {
        return f().hashCode();
    }

    public final void j(Message message) throws RemoteException {
        Messenger messenger = this.f42210a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f42210a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
