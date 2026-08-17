package X9;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.installations.c f15334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15335b;

    public /* synthetic */ d(com.google.firebase.installations.c cVar, boolean z10) {
        this.f15334a = cVar;
        this.f15335b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15334a.j(this.f15335b);
    }
}
