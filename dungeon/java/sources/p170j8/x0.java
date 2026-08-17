package p170j8;

import K8.a;
import K8.o;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends a implements InterfaceC3846k {
    x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p170j8.InterfaceC3846k
    public final Account zzb() {
        Parcel parcelG = g(2, h());
        Account account = (Account) o.b(parcelG, Account.CREATOR);
        parcelG.recycle();
        return account;
    }
}
