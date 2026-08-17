package G8;

/* JADX INFO: loaded from: classes2.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f3954a;

    /* synthetic */ j(l lVar, i iVar) {
        this.f3954a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f3954a.a();
        if (jA == -1 || com.google.android.gms.common.util.h.d().a() <= jA) {
            return;
        }
        l.e(this.f3954a.f3956a);
    }
}
