package Z1;

/* JADX INFO: renamed from: Z1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1673c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1679e f18231a;

    public /* synthetic */ RunnableC1673c(C1679e c1679e) {
        this.f18231a = c1679e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1679e c1679e = this.f18231a;
        c1679e.f18240a.unregisterReceiver(c1679e.f18241b);
    }
}
