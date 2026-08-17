package p459z9;

/* JADX INFO: loaded from: classes2.dex */
final class E extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4391f f58506b;

    E(C4391f c4391f) {
        this.f58506b = c4391f;
    }

    @Override // p459z9.A
    public final void b() {
        synchronized (this.f58506b.f58519f) {
            try {
                if (this.f58506b.f58525l.get() > 0 && this.f58506b.f58525l.decrementAndGet() > 0) {
                    this.f58506b.f58515b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C4391f c4391f = this.f58506b;
                if (c4391f.f58527n != null) {
                    c4391f.f58515b.c("Unbind from service.", new Object[0]);
                    C4391f c4391f2 = this.f58506b;
                    c4391f2.f58514a.unbindService(c4391f2.f58526m);
                    this.f58506b.f58520g = false;
                    this.f58506b.f58527n = null;
                    this.f58506b.f58526m = null;
                }
                this.f58506b.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
