package X9;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.installations.c f15332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15333b;

    public /* synthetic */ c(com.google.firebase.installations.c cVar, boolean z10) {
        this.f15332a = cVar;
        this.f15333b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15332a.i(this.f15333b);
    }
}
