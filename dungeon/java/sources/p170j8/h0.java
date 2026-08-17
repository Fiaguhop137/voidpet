package p170j8;

import K8.p;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class h0 extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AbstractC3839d abstractC3839d, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC3839d);
        this.f46981b = abstractC3839d;
    }

    private static final void a(Message message) {
        i0 i0Var = (i0) message.obj;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC3839d abstractC3839d = this.f46981b;
        if (abstractC3839d.f46907C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC3839d.t()) || message.what == 5)) && !abstractC3839d.c()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC3839d.g0(new C2333b(message.arg2));
            if (abstractC3839d.Z() && !abstractC3839d.h0()) {
                abstractC3839d.W(3, null);
                return;
            }
            C2333b c2333bF0 = abstractC3839d.f0() != null ? abstractC3839d.f0() : new C2333b(8);
            abstractC3839d.f46923p.a(c2333bF0);
            abstractC3839d.L(c2333bF0);
            return;
        }
        if (i11 == 5) {
            C2333b c2333bF1 = abstractC3839d.f0() != null ? abstractC3839d.f0() : new C2333b(8);
            abstractC3839d.f46923p.a(c2333bF1);
            abstractC3839d.L(c2333bF1);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C2333b c2333b = new C2333b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC3839d.f46923p.a(c2333b);
            abstractC3839d.L(c2333b);
            return;
        }
        if (i11 == 6) {
            abstractC3839d.W(5, null);
            if (abstractC3839d.d0() != null) {
                abstractC3839d.d0().h(message.arg2);
            }
            abstractC3839d.M(message.arg2);
            abstractC3839d.X(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC3839d.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((i0) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
