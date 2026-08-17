package U1;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f12933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1476s.a f12935c;

    public /* synthetic */ r(CopyOnWriteArraySet copyOnWriteArraySet, int i10, C1476s.a aVar) {
        this.f12933a = copyOnWriteArraySet;
        this.f12934b = i10;
        this.f12935c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1476s.a(this.f12933a, this.f12934b, this.f12935c);
    }
}
