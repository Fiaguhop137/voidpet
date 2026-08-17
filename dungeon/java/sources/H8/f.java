package H8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p170j8.AbstractC3843h;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends AbstractC3843h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p027b8.g f4240I;

    public f(Context context, Looper looper, C3840e c3840e, p027b8.g gVar, h8.f.a aVar, h8.f.b bVar) {
        super(context, looper, 68, c3840e, aVar, bVar);
        p027b8.f fVar = new p027b8.f(gVar == null ? p027b8.g.f26445d : gVar);
        fVar.a(b.a());
        this.f4240I = new p027b8.g(fVar);
    }

    @Override // p170j8.AbstractC3839d
    protected final Bundle A() {
        return this.f4240I.a();
    }

    @Override // p170j8.AbstractC3839d
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p170j8.AbstractC3839d
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // p170j8.AbstractC3839d, h8.a.f
    public final int m() {
        return 12800000;
    }

    @Override // p170j8.AbstractC3839d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }
}
