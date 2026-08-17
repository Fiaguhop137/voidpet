package p184k4;

import com.applovin.impl.b2;
import com.applovin.impl.c2;
import com.applovin.impl.q3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q3 f48012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f48013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f48014c;

    public /* synthetic */ o0(q3 q3Var, b2 b2Var, c2 c2Var) {
        this.f48012a = q3Var;
        this.f48013b = b2Var;
        this.f48014c = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48012a.a(this.f48013b, this.f48014c);
    }
}
