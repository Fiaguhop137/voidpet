package app.rive.runtime.kotlin.renderers;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Renderer f25796a;

    public /* synthetic */ b(Renderer renderer) {
        this.f25796a = renderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Renderer.scheduleFrame$lambda$3(this.f25796a);
    }
}
