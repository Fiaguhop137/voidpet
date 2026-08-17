package p442ya;

import O8.L;
import O8.V;
import android.content.Context;
import android.support.v4.media.session.b;
import com.google.android.gms.common.C2342k;
import p352ta.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p352ta.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f57987b;

    public e(h hVar) {
        this.f57987b = hVar;
    }

    @Override // p352ta.e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        h hVar = this.f57987b;
        b.a(obj);
        Context contextB = hVar.b();
        L lB = V.b(a.a());
        return new f(this.f57987b, null, (h.a(contextB) || C2342k.f().a(contextB) >= 204500000) ? new h(contextB, null, lB) : new i(contextB, null, lB), lB);
    }
}
