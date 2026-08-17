package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f23881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.b f23882b;

    public /* synthetic */ E(F f10, F.b bVar) {
        this.f23881a = f10;
        this.f23882b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F.e(this.f23881a, this.f23882b);
    }
}
