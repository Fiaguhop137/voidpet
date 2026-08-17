package p344t2;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I.a f54432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f54435d;

    public /* synthetic */ y(I.a aVar, String str, long j10, long j11) {
        this.f54432a = aVar;
        this.f54433b = str;
        this.f54434c = j10;
        this.f54435d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((I) S.i(this.f54432a.f54202b)).h(this.f54433b, this.f54434c, this.f54435d);
    }
}
