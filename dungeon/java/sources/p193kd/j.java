package p193kd;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f48079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f48080b;

    public /* synthetic */ j(h hVar, Exception exc) {
        this.f48079a = hVar;
        this.f48080b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.d.c(this.f48079a, this.f48080b);
    }
}
