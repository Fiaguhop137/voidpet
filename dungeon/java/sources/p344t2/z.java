package p344t2;

import R1.M;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f54437b;

    public /* synthetic */ z(I.a aVar, M m10) {
        this.f54436a = aVar;
        this.f54437b = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54436a.f54202b)).a(this.f54437b);
    }
}
