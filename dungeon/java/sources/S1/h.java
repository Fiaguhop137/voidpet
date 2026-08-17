package S1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.c f11436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11437b;

    public /* synthetic */ h(g.c cVar, int i10) {
        this.f11436a = cVar;
        this.f11437b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11436a.f11435b.onAudioFocusChange(this.f11437b);
    }
}
