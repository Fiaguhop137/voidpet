package p170j8;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends B0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC3839d f46993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f46994f;

    public j0(AbstractC3839d abstractC3839d, int i10) {
        this.f46993e = abstractC3839d;
        this.f46994f = i10;
    }

    @Override // p170j8.InterfaceC3847l
    public final void M(int i10, IBinder iBinder, Bundle bundle) {
        r.m(this.f46993e, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f46993e.N(i10, iBinder, bundle, this.f46994f);
        this.f46993e = null;
    }

    @Override // p170j8.InterfaceC3847l
    public final void g0(int i10, IBinder iBinder, n0 n0Var) {
        AbstractC3839d abstractC3839d = this.f46993e;
        r.m(abstractC3839d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.l(n0Var);
        abstractC3839d.V(n0Var);
        M(i10, iBinder, n0Var.f47003a);
    }

    @Override // p170j8.InterfaceC3847l
    public final void x0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
