package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f23879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.b f23880b;

    public /* synthetic */ D(F f10, F.b bVar) {
        this.f23879a = f10;
        this.f23880b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F.d(this.f23879a, this.f23880b);
    }
}
