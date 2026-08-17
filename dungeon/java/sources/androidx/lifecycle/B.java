package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProcessLifecycleOwner f24244a;

    public /* synthetic */ B(ProcessLifecycleOwner processLifecycleOwner) {
        this.f24244a = processLifecycleOwner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProcessLifecycleOwner.j(this.f24244a);
    }
}
