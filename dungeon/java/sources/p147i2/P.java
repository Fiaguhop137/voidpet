package p147i2;

import U1.AbstractC1459a;
import U1.L;
import Y1.c;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC3592q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f43654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3590o f43655b;

    public static class b implements InterfaceC3592q.b {
        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        @Override // p147i2.InterfaceC3592q.b
        public InterfaceC3592q b(InterfaceC3592q.a aVar) throws Throwable {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    L.a("configureCodec");
                    Surface surface = aVar.f43717d;
                    mediaCodecC.configure(aVar.f43715b, surface, aVar.f43718e, (surface == null && aVar.f43714a.f43734k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    L.b();
                    L.a("startCodec");
                    mediaCodecC.start();
                    L.b();
                    return new P(mediaCodecC, aVar.f43719f, null);
                } catch (IOException e10) {
                    e = e10;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e11) {
                    e = e11;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (RuntimeException e13) {
                e = e13;
            }
        }

        protected MediaCodec c(InterfaceC3592q.a aVar) throws IOException {
            AbstractC1459a.e(aVar.f43714a);
            String str = aVar.f43714a.f43724a;
            L.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            L.b();
            return mediaCodecCreateByCodecName;
        }
    }

    private P(MediaCodec mediaCodec, C3590o c3590o) {
        this.f43654a = mediaCodec;
        this.f43655b = c3590o;
        if (Build.VERSION.SDK_INT < 35 || c3590o == null) {
            return;
        }
        c3590o.b(mediaCodec);
    }

    /* synthetic */ P(MediaCodec mediaCodec, C3590o c3590o, a aVar) {
        this(mediaCodec, c3590o);
    }

    public static /* synthetic */ void q(P p10, InterfaceC3592q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        p10.getClass();
        dVar.a(p10, j10, j11);
    }

    @Override // p147i2.InterfaceC3592q
    public void a(int i10, int i11, c cVar, long j10, int i12) {
        this.f43654a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // p147i2.InterfaceC3592q
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f43654a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // p147i2.InterfaceC3592q
    public void c(Bundle bundle) {
        this.f43654a.setParameters(bundle);
    }

    @Override // p147i2.InterfaceC3592q
    public MediaFormat e() {
        return this.f43654a.getOutputFormat();
    }

    @Override // p147i2.InterfaceC3592q
    public void f() {
        this.f43654a.detachOutputSurface();
    }

    @Override // p147i2.InterfaceC3592q
    public void flush() {
        this.f43654a.flush();
    }

    @Override // p147i2.InterfaceC3592q
    public void g(int i10) {
        this.f43654a.setVideoScalingMode(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public ByteBuffer h(int i10) {
        return this.f43654a.getInputBuffer(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public void i(Surface surface) {
        this.f43654a.setOutputSurface(surface);
    }

    @Override // p147i2.InterfaceC3592q
    public boolean j() {
        return false;
    }

    @Override // p147i2.InterfaceC3592q
    public void k(int i10, long j10) {
        this.f43654a.releaseOutputBuffer(i10, j10);
    }

    @Override // p147i2.InterfaceC3592q
    public int l() {
        return this.f43654a.dequeueInputBuffer(0L);
    }

    @Override // p147i2.InterfaceC3592q
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f43654a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p147i2.InterfaceC3592q
    public void n(int i10, boolean z10) {
        this.f43654a.releaseOutputBuffer(i10, z10);
    }

    @Override // p147i2.InterfaceC3592q
    public ByteBuffer o(int i10) {
        return this.f43654a.getOutputBuffer(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public void p(InterfaceC3592q.d dVar, Handler handler) {
        this.f43654a.setOnFrameRenderedListener(new O(this, dVar), handler);
    }

    @Override // p147i2.InterfaceC3592q
    public void release() {
        C3590o c3590o;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.f43654a.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (c3590o = this.f43655b) != null) {
                c3590o.d(this.f43654a);
            }
            this.f43654a.release();
        }
    }
}
