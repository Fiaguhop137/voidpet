package R3;

import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: R3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1369p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f10846a;

    public /* synthetic */ RunnableC1369p(ZipInputStream zipInputStream) {
        this.f10846a = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p077e4.r.c(this.f10846a);
    }
}
