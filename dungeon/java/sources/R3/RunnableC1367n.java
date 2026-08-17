package R3;

import java.io.InputStream;

/* JADX INFO: renamed from: R3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1367n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f10842a;

    public /* synthetic */ RunnableC1367n(InputStream inputStream) {
        this.f10842a = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p077e4.r.c(this.f10842a);
    }
}
