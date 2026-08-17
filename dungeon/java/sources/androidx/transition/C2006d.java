package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2006d implements h1.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f25572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2013k f25573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f25574c;

    public /* synthetic */ C2006d(Runnable runnable, AbstractC2013k abstractC2013k, Runnable runnable2) {
        this.f25572a = runnable;
        this.f25573b = abstractC2013k;
        this.f25574c = runnable2;
    }

    @Override // h1.d.a
    public final void onCancel() {
        C2007e.v(this.f25572a, this.f25573b, this.f25574c);
    }
}
