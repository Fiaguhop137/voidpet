package p170j8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.util.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p242n8.a;

/* JADX INFO: loaded from: classes2.dex */
final class s0 implements ServiceConnection, v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f47030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f47031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f47032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ u0 f47033g;

    public s0(u0 u0Var, r0 r0Var) {
        Objects.requireNonNull(u0Var);
        this.f47033g = u0Var;
        this.f47031e = r0Var;
        this.f47027a = new HashMap();
        this.f47028b = 2;
    }

    public final void a(String str) {
        r0 r0Var = this.f47031e;
        u0 u0Var = this.f47033g;
        u0Var.j().removeMessages(1, r0Var);
        u0Var.k().c(u0Var.i(), this);
        this.f47029c = false;
        this.f47028b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f47027a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f47027a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f47029c;
    }

    public final int e() {
        return this.f47028b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f47027a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f47027a.isEmpty();
    }

    public final IBinder h() {
        return this.f47030d;
    }

    public final ComponentName i() {
        return this.f47032f;
    }

    final /* synthetic */ C2333b j(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = g0.a(this.f47033g.i(), this.f47031e);
            this.f47028b = 3;
            StrictMode.VmPolicy vmPolicyA = w.a();
            try {
                u0 u0Var = this.f47033g;
                a aVarK = u0Var.k();
                Context contextI = u0Var.i();
                r0 r0Var = this.f47031e;
                try {
                    boolean zD = aVarK.d(contextI, str, intentA, this, 4225, executor);
                    this.f47029c = zD;
                    if (zD) {
                        u0Var.j().sendMessageDelayed(u0Var.j().obtainMessage(1, r0Var), u0Var.l());
                        C2333b c2333b = C2333b.f31870f;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return c2333b;
                    }
                    this.f47028b = 2;
                    try {
                        u0Var.k().c(u0Var.i(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    C2333b c2333b2 = new C2333b(16);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return c2333b2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (e0 e10) {
            return e10.f46954a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u0 u0Var = this.f47033g;
        synchronized (u0Var.h()) {
            try {
                u0Var.j().removeMessages(1, this.f47031e);
                this.f47030d = iBinder;
                this.f47032f = componentName;
                Iterator it = this.f47027a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f47028b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u0 u0Var = this.f47033g;
        synchronized (u0Var.h()) {
            try {
                u0Var.j().removeMessages(1, this.f47031e);
                this.f47030d = null;
                this.f47032f = componentName;
                Iterator it = this.f47027a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f47028b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
