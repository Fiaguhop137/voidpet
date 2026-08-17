package p002a1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.e f19100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19101b;

    public /* synthetic */ m(k.e eVar, int i10) {
        this.f19100a = eVar;
        this.f19101b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19100a.f(this.f19101b);
    }
}
