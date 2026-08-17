package app.rive.runtime.kotlin.renderers;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Renderer f25795a;

    public /* synthetic */ a(Renderer renderer) {
        this.f25795a = renderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Renderer.stop$lambda$1(this.f25795a);
    }
}
