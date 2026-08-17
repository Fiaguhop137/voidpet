package L8;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
abstract class W extends p135h8.a.AbstractC0496a {
    /* synthetic */ W(byte[] bArr) {
    }

    @Override // p135h8.a.AbstractC0496a
    public final /* bridge */ /* synthetic */ h8.a.f a(Context context, Looper looper, C3840e c3840e, Object obj, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        p350t8.r rVarD = (p350t8.r) obj;
        if (rVarD == null) {
            rVarD = p350t8.r.a().d();
        }
        p350t8.r rVar = rVarD;
        p404w8.c cVar = new p404w8.c(context, looper, c3840e, rVar, interfaceC2313f, interfaceC2321n, p404w8.j.a());
        if (rVar.f54581o.a()) {
            int i10 = p404w8.o.f56691h;
            cVar.s0(p404w8.o.a((Application) context.getApplicationContext()));
        }
        return cVar;
    }
}
