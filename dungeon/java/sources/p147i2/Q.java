package p147i2;

import Y1.c;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class Q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f43656a;

    public Q(MediaCodec mediaCodec) {
        this.f43656a = mediaCodec;
    }

    @Override // p147i2.r
    public void a(int i10, int i11, c cVar, long j10, int i12) {
        this.f43656a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // p147i2.r
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f43656a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // p147i2.r
    public void c(Bundle bundle) {
        this.f43656a.setParameters(bundle);
    }

    @Override // p147i2.r
    public void d() {
    }

    @Override // p147i2.r
    public void flush() {
    }

    @Override // p147i2.r
    public void shutdown() {
    }

    @Override // p147i2.r
    public void start() {
    }
}
