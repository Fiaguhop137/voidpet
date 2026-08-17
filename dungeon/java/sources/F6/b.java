package F6;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2967b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f2966a = cVar;
        this.f2967b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.e(this.f2966a, this.f2967b);
    }
}
