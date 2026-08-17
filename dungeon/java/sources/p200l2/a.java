package p200l2;

import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SsMediaSource f48593a;

    public /* synthetic */ a(SsMediaSource ssMediaSource) {
        this.f48593a = ssMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48593a.N();
    }
}
