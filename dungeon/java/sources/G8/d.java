package G8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.AbstractC3843h;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC3843h {
    protected d(Context context, Looper looper, C3840e c3840e, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, 300, c3840e, interfaceC2313f, interfaceC2321n);
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // p170j8.AbstractC3839d
    protected final boolean I() {
        return true;
    }

    @Override // p170j8.AbstractC3839d
    public final boolean S() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 212800000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // p170j8.AbstractC3839d
    public final C2335d[] v() {
        return zze.zzb;
    }
}
