package p002a1;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.e f19098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f19099b;

    public /* synthetic */ l(k.e eVar, Typeface typeface) {
        this.f19098a = eVar;
        this.f19099b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19098a.g(this.f19099b);
    }
}
