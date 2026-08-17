package p423x9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f57425a;

    public /* synthetic */ l(t tVar) {
        this.f57425a = tVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        t.h(this.f57425a);
    }
}
