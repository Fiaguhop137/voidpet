package p206l8;

import I8.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.AbstractC3843h;
import p170j8.C3840e;
import p170j8.C3859y;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC3843h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final C3859y f48687I;

    public e(Context context, Looper looper, C3840e c3840e, C3859y c3859y, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, 270, c3840e, interfaceC2313f, interfaceC2321n);
        this.f48687I = c3859y;
    }

    @Override // p170j8.AbstractC3839d
    protected final Bundle A() {
        return this.f48687I.b();
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p170j8.AbstractC3839d
    protected final boolean I() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 203400000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // p170j8.AbstractC3839d
    public final C2335d[] v() {
        return d.f5090b;
    }
}
