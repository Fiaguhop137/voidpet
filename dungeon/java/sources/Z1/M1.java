package Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N1 f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18007b;

    public /* synthetic */ M1(N1 n10, boolean z10) {
        this.f18006a = n10;
        this.f18007b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18006a.f18011a.a(true, this.f18007b);
    }
}
