package p409wd;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f56830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f56831b;

    public /* synthetic */ c(g gVar, Boolean bool) {
        this.f56830a = gVar;
        this.f56831b = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56830a.k(this.f56831b);
    }
}
