package p183k3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f47956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f47957b;

    public /* synthetic */ x(Runnable runnable, y yVar) {
        this.f47956a = runnable;
        this.f47957b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.b(this.f47956a, this.f47957b);
    }
}
