package K9;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W9.b f6100b;

    public /* synthetic */ l(B b10, W9.b bVar) {
        this.f6099a = b10;
        this.f6100b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6099a.d(this.f6100b);
    }
}
