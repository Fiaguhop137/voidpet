package p170j8;

import K8.p;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C2333b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p242n8.a;

/* JADX INFO: loaded from: classes2.dex */
final class u0 extends AbstractC3844i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f47042g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f47043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Handler f47044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t0 f47045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f47046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f47047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f47048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Executor f47049n;

    u0(Context context, Looper looper, Executor executor) {
        t0 t0Var = new t0(this, null);
        this.f47045j = t0Var;
        this.f47043h = context.getApplicationContext();
        this.f47044i = new p(looper, t0Var);
        this.f47046k = a.b();
        this.f47047l = 5000L;
        this.f47048m = 300000L;
        this.f47049n = executor;
    }

    @Override // p170j8.AbstractC3844i
    protected final C2333b e(r0 r0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C2333b c2333bJ;
        r.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f47042g;
        synchronized (map) {
            try {
                s0 s0Var = (s0) map.get(r0Var);
                if (executor == null) {
                    executor = this.f47049n;
                }
                if (s0Var == null) {
                    s0Var = new s0(this, r0Var);
                    s0Var.b(serviceConnection, serviceConnection, str);
                    c2333bJ = s0Var.j(str, executor);
                    map.put(r0Var, s0Var);
                } else {
                    this.f47044i.removeMessages(0, r0Var);
                    if (s0Var.f(serviceConnection)) {
                        String string = r0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    s0Var.b(serviceConnection, serviceConnection, str);
                    int iE = s0Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(s0Var.i(), s0Var.h());
                    } else if (iE == 2) {
                        c2333bJ = s0Var.j(str, executor);
                    }
                    c2333bJ = null;
                }
                if (s0Var.d()) {
                    return C2333b.f31870f;
                }
                if (c2333bJ == null) {
                    c2333bJ = new C2333b(-1);
                }
                return c2333bJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p170j8.AbstractC3844i
    protected final void g(r0 r0Var, ServiceConnection serviceConnection, String str) {
        r.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f47042g;
        synchronized (map) {
            try {
                s0 s0Var = (s0) map.get(r0Var);
                if (s0Var == null) {
                    String string = r0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!s0Var.f(serviceConnection)) {
                    String string2 = r0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                s0Var.c(serviceConnection, str);
                if (s0Var.g()) {
                    this.f47044i.sendMessageDelayed(this.f47044i.obtainMessage(0, r0Var), this.f47047l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ HashMap h() {
        return this.f47042g;
    }

    final /* synthetic */ Context i() {
        return this.f47043h;
    }

    final /* synthetic */ Handler j() {
        return this.f47044i;
    }

    final /* synthetic */ a k() {
        return this.f47046k;
    }

    final /* synthetic */ long l() {
        return this.f47048m;
    }
}
