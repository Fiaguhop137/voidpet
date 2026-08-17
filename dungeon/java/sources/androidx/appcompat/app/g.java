package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.c f20009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f20010b;

    public /* synthetic */ g(f.c cVar, Runnable runnable) {
        this.f20009a = cVar;
        this.f20010b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.c.a(this.f20009a, this.f20010b);
    }
}
