package p184k4;

import com.applovin.impl.c2;
import com.applovin.impl.x1;
import com.applovin.impl.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f47976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f47977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f47978c;

    public /* synthetic */ E0(x1 x1Var, z1 z1Var, c2 c2Var) {
        this.f47976a = x1Var;
        this.f47977b = z1Var;
        this.f47978c = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47976a.b(this.f47977b, this.f47978c);
    }
}
