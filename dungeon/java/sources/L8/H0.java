package L8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.AbstractC3843h;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends AbstractC3843h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final v0 f6423I;

    public H0(Context context, Looper looper, C3840e c3840e, v0 v0Var, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, 1, c3840e, interfaceC2313f, interfaceC2321n);
        this.f6423I = v0Var;
    }

    @Override // p170j8.AbstractC3839d
    protected final Bundle A() {
        Bundle bundle = new Bundle();
        v0 v0Var = this.f6423I;
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", v0Var.f6512a);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", v0Var.f6513b);
        return bundle;
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    @Override // p170j8.AbstractC3839d
    public final boolean S() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 213000000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return iInterfaceQueryLocalInterface instanceof O0 ? (O0) iInterfaceQueryLocalInterface : new O0(iBinder);
    }
}
