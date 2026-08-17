package K9;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W9.b f6102b;

    public /* synthetic */ m(x xVar, W9.b bVar) {
        this.f6101a = xVar;
        this.f6102b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6101a.a(this.f6102b);
    }
}
