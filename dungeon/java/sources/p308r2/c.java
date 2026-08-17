package p308r2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a.C0623a.C0624a f52028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52031d;

    public /* synthetic */ c(d.a.C0623a.C0624a c0624a, int i10, long j10, long j11) {
        this.f52028a = c0624a;
        this.f52029b = i10;
        this.f52030c = j10;
        this.f52031d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f52028a.f52034b.J(this.f52029b, this.f52030c, this.f52031d);
    }
}
