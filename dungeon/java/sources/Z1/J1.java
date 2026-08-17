package Z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K1 f17986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17988c;

    public /* synthetic */ J1(K1 k10, boolean z10, boolean z11) {
        this.f17986a = k10;
        this.f17987b = z10;
        this.f17988c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17986a.f17990a.a(this.f17987b, this.f17988c);
    }
}
