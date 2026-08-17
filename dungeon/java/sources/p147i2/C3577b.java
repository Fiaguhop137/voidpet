package p147i2;

import android.media.MediaCodec;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3577b implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3578c f43657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3592q.d f43658b;

    public /* synthetic */ C3577b(C3578c c3578c, InterfaceC3592q.d dVar) {
        this.f43657a = c3578c;
        this.f43658b = dVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        C3578c.q(this.f43657a, this.f43658b, mediaCodec, j10, j11);
    }
}
