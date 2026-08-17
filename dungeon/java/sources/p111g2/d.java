package p111g2;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.C0482c f41969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f41970b;

    public /* synthetic */ d(c.C0482c c0482c, Uri uri) {
        this.f41969a = c0482c;
        this.f41970b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.C0482c.a(this.f41969a, this.f41970b);
    }
}
