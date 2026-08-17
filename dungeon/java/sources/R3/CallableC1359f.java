package R3;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: R3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1359f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1363j f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10785b;

    public /* synthetic */ CallableC1359f(C1363j c1363j, String str) {
        this.f10784a = c1363j;
        this.f10785b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C1363j.c(this.f10784a, this.f10785b);
    }
}
