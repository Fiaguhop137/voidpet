package G1;

import androidx.fragment.app.C1975f;
import androidx.fragment.app.F;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.c f3828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.c f3829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4101a f3831d;

    public /* synthetic */ c(F.c cVar, F.c cVar2, boolean z10, C4101a c4101a) {
        this.f3828a = cVar;
        this.f3829b = cVar2;
        this.f3830c = z10;
        this.f3831d = c4101a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1975f.P(this.f3828a, this.f3829b, this.f3830c, this.f3831d);
    }
}
