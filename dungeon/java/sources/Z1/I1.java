package Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K1 f17983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17984b;

    public /* synthetic */ I1(K1 k10, boolean z10) {
        this.f17983a = k10;
        this.f17984b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17983a.f17990a.a(true, this.f17984b);
    }
}
