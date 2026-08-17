package p147i2;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f43652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3592q.d f43653b;

    public /* synthetic */ O(P p10, InterfaceC3592q.d dVar) {
        this.f43652a = p10;
        this.f43653b = dVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        P.q(this.f43652a, this.f43653b, mediaCodec, j10, j11);
    }
}
