package p344t2;

import R1.r;
import U1.S;
import Z1.C1697k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1697k f54198c;

    public /* synthetic */ G(I.a aVar, r rVar, C1697k c1697k) {
        this.f54196a = aVar;
        this.f54197b = rVar;
        this.f54198c = c1697k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54196a.f54202b)).i(this.f54197b, this.f54198c);
    }
}
