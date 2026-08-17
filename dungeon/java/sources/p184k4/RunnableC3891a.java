package p184k4;

import com.applovin.impl.b1;
import com.applovin.impl.e1;
import java.util.List;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3891a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f47988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f47989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f47990c;

    public /* synthetic */ RunnableC3891a(e1 e1Var, b1 b1Var, List list) {
        this.f47988a = e1Var;
        this.f47989b = b1Var;
        this.f47990c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47988a.b(this.f47989b, this.f47990c);
    }
}
