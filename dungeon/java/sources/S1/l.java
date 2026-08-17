package S1;

import U1.C1469k;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1469k f11439b;

    public /* synthetic */ l(Context context, C1469k c1469k) {
        this.f11438a = context;
        this.f11439b = c1469k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a(this.f11438a, this.f11439b);
    }
}
