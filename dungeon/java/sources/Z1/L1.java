package Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N1 f18000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18002c;

    public /* synthetic */ L1(N1 n10, boolean z10, boolean z11) {
        this.f18000a = n10;
        this.f18001b = z10;
        this.f18002c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18000a.f18011a.a(this.f18001b, this.f18002c);
    }
}
