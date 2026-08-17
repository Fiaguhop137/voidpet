package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54187b;

    public /* synthetic */ C(I.a aVar, String str) {
        this.f54186a = aVar;
        this.f54187b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54186a.f54202b)).g(this.f54187b);
    }
}
