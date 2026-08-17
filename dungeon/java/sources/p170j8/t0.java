package p170j8;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class t0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u0 f47039a;

    /* synthetic */ t0(u0 u0Var, byte[] bArr) {
        Objects.requireNonNull(u0Var);
        this.f47039a = u0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            u0 u0Var = this.f47039a;
            synchronized (u0Var.h()) {
                try {
                    r0 r0Var = (r0) message.obj;
                    s0 s0Var = (s0) u0Var.h().get(r0Var);
                    if (s0Var != null && s0Var.g()) {
                        if (s0Var.d()) {
                            s0Var.a("GmsClientSupervisor");
                        }
                        u0Var.h().remove(r0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        u0 u0Var2 = this.f47039a;
        synchronized (u0Var2.h()) {
            try {
                r0 r0Var2 = (r0) message.obj;
                s0 s0Var2 = (s0) u0Var2.h().get(r0Var2);
                if (s0Var2 != null && s0Var2.e() == 3) {
                    String strValueOf = String.valueOf(r0Var2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentNameI = s0Var2.i();
                    if (componentNameI == null) {
                        componentNameI = r0Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = r0Var2.b();
                        r.l(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    s0Var2.onServiceDisconnected(componentNameI);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
