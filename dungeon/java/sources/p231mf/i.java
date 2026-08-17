package p231mf;

import p088ef.T;

/* JADX INFO: loaded from: classes3.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f49340c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f49340c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f49340c.run();
    }

    public String toString() {
        return "Task[" + T.a(this.f49340c) + '@' + T.b(this.f49340c) + ", " + this.f49338a + ", " + j.c(this.f49339b) + ']';
    }
}
