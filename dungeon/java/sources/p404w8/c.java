package p404w8;

import L8.AbstractC1140b;
import L8.C1144d;
import L8.Y;
import W8.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import p170j8.AbstractC3839d;
import p170j8.AbstractC3843h;
import p170j8.C3840e;
import p350t8.e;
import p350t8.g;
import p350t8.p;
import p350t8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC3843h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AbstractC1140b f56673I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final String f56674J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private PlayerEntity f56675K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final i f56676L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f56677M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final long f56678N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f56679O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final r f56680P;

    public c(Context context, Looper looper, C3840e c3840e, r rVar, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n, j jVar) {
        super(context, looper, 1, c3840e, interfaceC2313f, interfaceC2321n);
        this.f56673I = new s(this);
        this.f56677M = false;
        this.f56674J = c3840e.g();
        this.f56679O = (j) p170j8.r.l(jVar);
        i iVarB = i.b(this, c3840e.f());
        this.f56676L = iVarB;
        this.f56678N = hashCode();
        this.f56680P = rVar;
        if (c3840e.i() != null || (context instanceof Activity)) {
            iVarB.f(c3840e.i());
        }
    }

    private static void r0(RemoteException remoteException) {
        Y.e("GamesGmsClientImpl", "service died", remoteException);
    }

    @Override // p170j8.AbstractC3839d
    protected final Bundle A() {
        String string = y().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
        r rVar = this.f56680P;
        boolean z10 = rVar.f54568b;
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", rVar.f54571e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", rVar.f54573g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        bundle.putString("com.google.android.gms.games.key.gameRunToken", rVar.f54580n);
        bundle.putBoolean("com.google.android.gms.games.key.isGmsCoreUiInitiatedRequest", false);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f56674J);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", string);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f56676L.d()));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", a.m0(j0()));
        return bundle;
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // p170j8.AbstractC3839d
    public final /* bridge */ /* synthetic */ void K(IInterface iInterface) {
        h hVar = (h) iInterface;
        super.K(hVar);
        if (this.f56677M) {
            this.f56676L.g();
            this.f56677M = false;
        }
        try {
            hVar.c1(new t(new C1144d(this.f56676L.e())), this.f56678N);
        } catch (RemoteException e10) {
            r0(e10);
        }
    }

    @Override // p170j8.AbstractC3839d
    public final void L(C2333b c2333b) {
        super.L(c2333b);
        this.f56677M = false;
    }

    @Override // p170j8.AbstractC3839d
    protected final void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (i10 == 0) {
            i10 = 0;
            if (bundle != null) {
                bundle.setClassLoader(c.class.getClassLoader());
                this.f56677M = bundle.getBoolean("show_welcome_popup");
                this.f56675K = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            }
        }
        super.N(i10, iBinder, bundle, i11);
    }

    @Override // p170j8.AbstractC3839d
    public final boolean O() {
        return true;
    }

    @Override // p170j8.AbstractC3839d
    public final boolean S() {
        return true;
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final boolean f() {
        return !this.f56680P.f54581o.c();
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final void h(AbstractC3839d.c cVar) {
        this.f56675K = null;
        super.h(cVar);
    }

    @Override // p170j8.AbstractC3843h, h8.a.f
    public final Set j() {
        return C();
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final void k() {
        this.f56677M = false;
        if (a()) {
            try {
                this.f56673I.a();
                ((h) D()).d1(this.f56678N);
            } catch (RemoteException unused) {
                Y.d("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.k();
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 12451000;
    }

    public final void m0(TaskCompletionSource taskCompletionSource, String str) {
        x xVar = taskCompletionSource == null ? null : new x(taskCompletionSource);
        try {
            h hVar = (h) D();
            i iVar = this.f56676L;
            hVar.h1(xVar, str, iVar.d(), iVar.c());
        } catch (SecurityException e10) {
            g.a(taskCompletionSource, e10);
        }
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final void n(AbstractC3839d.e eVar) {
        try {
            u uVar = new u(eVar);
            this.f56673I.a();
            try {
                ((h) D()).e1(new v(uVar));
            } catch (SecurityException unused) {
                uVar.b(e.b(4));
            }
        } catch (RemoteException unused2) {
            eVar.a();
        }
    }

    public final void n0(TaskCompletionSource taskCompletionSource, String str) {
        x xVar = taskCompletionSource == null ? null : new x(taskCompletionSource);
        try {
            h hVar = (h) D();
            i iVar = this.f56676L;
            hVar.i1(xVar, str, iVar.d(), iVar.c());
        } catch (SecurityException e10) {
            g.a(taskCompletionSource, e10);
        }
    }

    public final void o0(TaskCompletionSource taskCompletionSource, String str, int i10) {
        w wVar = taskCompletionSource == null ? null : new w(taskCompletionSource);
        try {
            h hVar = (h) D();
            i iVar = this.f56676L;
            hVar.j1(wVar, str, i10, iVar.d(), iVar.c());
        } catch (SecurityException e10) {
            g.a(taskCompletionSource, e10);
        }
    }

    final void p0(IBinder iBinder, Bundle bundle) {
        if (a()) {
            if (this.f56680P.f54581o.b() && this.f56679O.b()) {
                return;
            }
            try {
                ((h) D()).f1(iBinder, bundle);
                this.f56679O.c();
            } catch (RemoteException e10) {
                r0(e10);
            }
        }
    }

    final void q0() {
        if (a()) {
            try {
                ((h) D()).g1();
            } catch (RemoteException e10) {
                r0(e10);
            }
        }
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    public final void s0(o oVar) {
        oVar.c(this.f56676L);
    }

    @Override // p170j8.AbstractC3839d
    public final C2335d[] v() {
        return p.f54562j;
    }

    @Override // p170j8.AbstractC3839d
    public final Bundle x() {
        return null;
    }
}
