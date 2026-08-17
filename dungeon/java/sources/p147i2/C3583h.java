package p147i2;

import U1.AbstractC1459a;
import U1.S;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p323s.C4105e;

/* JADX INFO: renamed from: i2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3583h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f43687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f43688c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f43693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f43694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f43695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f43696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f43697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f43698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f43699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC3592q.c f43700o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43686a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4105e f43689d = new C4105e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4105e f43690e = new C4105e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f43691f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f43692g = new ArrayDeque();

    C3583h(HandlerThread handlerThread) {
        this.f43687b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f43690e.a(-2);
        this.f43692g.add(mediaFormat);
    }

    private void f() {
        if (!this.f43692g.isEmpty()) {
            this.f43694i = (MediaFormat) this.f43692g.getLast();
        }
        this.f43689d.b();
        this.f43690e.b();
        this.f43691f.clear();
        this.f43692g.clear();
    }

    private boolean i() {
        return this.f43697l > 0 || this.f43698m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f43699n;
        if (illegalStateException == null) {
            return;
        }
        this.f43699n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f43696k;
        if (cryptoException == null) {
            return;
        }
        this.f43696k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f43695j;
        if (codecException == null) {
            return;
        }
        this.f43695j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f43686a) {
            try {
                if (this.f43698m) {
                    return;
                }
                long j10 = this.f43697l - 1;
                this.f43697l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f43686a) {
            this.f43699n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f43686a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f43689d.d()) {
                    iE = this.f43689d.e();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f43686a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f43690e.d()) {
                    return -1;
                }
                int iE = this.f43690e.e();
                if (iE >= 0) {
                    AbstractC1459a.i(this.f43693h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f43691f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f43693h = (MediaFormat) this.f43692g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f43686a) {
            this.f43697l++;
            ((Handler) S.i(this.f43688c)).post(new RunnableC3582g(this));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f43686a) {
            try {
                mediaFormat = this.f43693h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC1459a.g(this.f43688c == null);
        this.f43687b.start();
        Handler handler = new Handler(this.f43687b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f43688c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f43686a) {
            this.f43696k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f43686a) {
            this.f43695j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f43686a) {
            try {
                this.f43689d.a(i10);
                InterfaceC3592q.c cVar = this.f43700o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f43686a) {
            try {
                MediaFormat mediaFormat = this.f43694i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f43694i = null;
                }
                this.f43690e.a(i10);
                this.f43691f.add(bufferInfo);
                InterfaceC3592q.c cVar = this.f43700o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f43686a) {
            b(mediaFormat);
            this.f43694i = null;
        }
    }

    public void p(InterfaceC3592q.c cVar) {
        synchronized (this.f43686a) {
            this.f43700o = cVar;
        }
    }

    public void q() {
        synchronized (this.f43686a) {
            this.f43698m = true;
            this.f43687b.quit();
            f();
        }
    }
}
