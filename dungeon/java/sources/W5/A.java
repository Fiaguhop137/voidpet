package W5;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f14629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f14630b;

    public /* synthetic */ A(B b10, Runnable runnable) {
        this.f14629a = b10;
        this.f14630b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.b(this.f14629a, this.f14630b);
    }
}
