package R3;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1361h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1363j f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10787b;

    public /* synthetic */ CallableC1361h(C1363j c1363j, int i10) {
        this.f10786a = c1363j;
        this.f10787b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C1363j.e(this.f10786a, this.f10787b);
    }
}
