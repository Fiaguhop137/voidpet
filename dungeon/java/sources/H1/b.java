package H1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f4119b;

    public /* synthetic */ b(String str, g gVar) {
        this.f4118a = str;
        this.f4119b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.d(this.f4118a, this.f4119b);
    }
}
