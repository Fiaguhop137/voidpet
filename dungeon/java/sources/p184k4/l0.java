package p184k4;

import com.applovin.impl.s1;
import com.applovin.impl.u1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f48008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f48009b;

    public /* synthetic */ l0(s1 s1Var, u1 u1Var) {
        this.f48008a = s1Var;
        this.f48009b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48008a.f28345f.accept(this.f48009b);
    }
}
