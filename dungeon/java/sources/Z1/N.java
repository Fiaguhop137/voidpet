package Z1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1711p.c f18008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18009b;

    public /* synthetic */ N(C1711p.c cVar, Context context) {
        this.f18008a = cVar;
        this.f18009b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1711p.c.e(this.f18008a, this.f18009b);
    }
}
