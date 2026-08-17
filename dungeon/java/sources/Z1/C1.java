package Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f17961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17962b;

    public /* synthetic */ C1(F1 f10, int i10) {
        this.f17961a = f10;
        this.f17962b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F1.d(this.f17961a, this.f17962b);
    }
}
