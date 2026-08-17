package Z1;

import android.content.IntentFilter;

/* JADX INFO: renamed from: Z1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1670b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1679e f18228a;

    public /* synthetic */ RunnableC1670b(C1679e c1679e) {
        this.f18228a = c1679e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1679e c1679e = this.f18228a;
        c1679e.f18240a.registerReceiver(c1679e.f18241b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}
