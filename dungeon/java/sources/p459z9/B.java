package p459z9;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4391f f58500a;

    public /* synthetic */ B(C4391f c4391f) {
        this.f58500a = c4391f;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C4391f.k(this.f58500a);
    }
}
