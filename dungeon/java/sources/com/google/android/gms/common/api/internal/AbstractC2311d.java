package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2311d extends BasePendingResult implements InterfaceC2312e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h8.a.c f31810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p135h8.a f31811o;

    protected AbstractC2311d(p135h8.a aVar, p135h8.f fVar) {
        super((p135h8.f) p170j8.r.m(fVar, "GoogleApiClient must not be null"));
        p170j8.r.m(aVar, "Api must not be null");
        this.f31810n = aVar.b();
        this.f31811o = aVar;
    }

    private void p(RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2312e
    public final void b(Status status) {
        p170j8.r.b(!status.g4(), "Failed result must not be success");
        p135h8.k kVarE = e(status);
        h(kVarE);
        n(kVarE);
    }

    protected abstract void m(h8.a.b bVar);

    protected void n(p135h8.k kVar) {
    }

    public final void o(h8.a.b bVar) throws DeadObjectException {
        try {
            m(bVar);
        } catch (DeadObjectException e10) {
            p(e10);
            throw e10;
        } catch (RemoteException e11) {
            p(e11);
        }
    }
}
