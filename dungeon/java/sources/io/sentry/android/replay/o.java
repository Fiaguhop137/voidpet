package io.sentry.android.replay;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f45479a;

    public /* synthetic */ o(p pVar) {
        this.f45479a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a.c(this.f45479a);
    }
}
