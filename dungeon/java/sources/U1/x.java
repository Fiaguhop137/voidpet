package U1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f12961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12962b;

    public /* synthetic */ x(y yVar, Context context) {
        this.f12961a = yVar;
        this.f12962b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12961a.j(this.f12962b);
    }
}
