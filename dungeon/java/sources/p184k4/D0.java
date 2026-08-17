package p184k4;

import com.applovin.impl.c2;
import com.applovin.impl.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f47973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47975c;

    public /* synthetic */ D0(c2 c2Var, String str, int i10) {
        this.f47973a = c2Var;
        this.f47974b = str;
        this.f47975c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x1.b(this.f47973a, this.f47974b, this.f47975c);
    }
}
