package U1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y.e f12846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12847b;

    public /* synthetic */ D(y.e eVar, Context context) {
        this.f12846a = eVar;
        this.f12847b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y.this.i(this.f12847b);
    }
}
