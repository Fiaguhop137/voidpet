package Z1;

import android.content.Context;

/* JADX INFO: renamed from: Z1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1716s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1711p.b f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18475b;

    public /* synthetic */ RunnableC1716s(C1711p.b bVar, Context context) {
        this.f18474a = bVar;
        this.f18475b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1711p.b.d(this.f18474a, this.f18475b);
    }
}
