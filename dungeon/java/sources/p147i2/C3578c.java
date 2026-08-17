package p147i2;

import B9.t;
import R1.r;
import R1.y;
import U1.L;
import Y1.c;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: i2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3578c implements InterfaceC3592q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f43659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3583h f43660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f43661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3590o f43662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43664f;

    /* JADX INFO: renamed from: i2.c$b */
    public static final class b implements InterfaceC3592q.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f43665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f43666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f43667d;

        public b(int i10) {
            this(new C3579d(i10), new C3580e(i10));
        }

        public b(t tVar, t tVar2) {
            this.f43665b = tVar;
            this.f43666c = tVar2;
            this.f43667d = false;
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(C3578c.v(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(C3578c.u(i10));
        }

        private static boolean g(r rVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || y.t(rVar.f10277o);
        }

        @Override // p147i2.InterfaceC3592q.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C3578c b(InterfaceC3592q.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            r c3581f;
            int i10;
            String str = aVar.f43714a.f43724a;
            C3578c c3578c = null;
            try {
                L.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f43667d && g(aVar.f43716c)) {
                        c3581f = new Q(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        c3581f = new C3581f(mediaCodecCreateByCodecName, (HandlerThread) this.f43666c.get());
                        i10 = 0;
                    }
                    C3578c c3578c2 = new C3578c(mediaCodecCreateByCodecName, (HandlerThread) this.f43665b.get(), c3581f, aVar.f43719f, null);
                    try {
                        L.b();
                        Surface surface = aVar.f43717d;
                        if (surface == null && aVar.f43714a.f43734k && Build.VERSION.SDK_INT >= 35) {
                            i10 |= 8;
                        }
                        c3578c2.x(aVar.f43715b, surface, aVar.f43718e, i10);
                        return c3578c2;
                    } catch (Exception e10) {
                        exc = e10;
                        c3578c = c3578c2;
                        if (c3578c != null) {
                            c3578c.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z10) {
            this.f43667d = z10;
        }
    }

    private C3578c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C3590o c3590o) {
        this.f43659a = mediaCodec;
        this.f43660b = new C3583h(handlerThread);
        this.f43661c = rVar;
        this.f43662d = c3590o;
        this.f43664f = 0;
    }

    /* synthetic */ C3578c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C3590o c3590o, a aVar) {
        this(mediaCodec, handlerThread, rVar, c3590o);
    }

    public static /* synthetic */ void q(C3578c c3578c, InterfaceC3592q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        c3578c.getClass();
        dVar.a(c3578c, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return w(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return w(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C3590o c3590o;
        this.f43660b.h(this.f43659a);
        L.a("configureCodec");
        this.f43659a.configure(mediaFormat, surface, mediaCrypto, i10);
        L.b();
        this.f43661c.start();
        L.a("startCodec");
        this.f43659a.start();
        L.b();
        if (Build.VERSION.SDK_INT >= 35 && (c3590o = this.f43662d) != null) {
            c3590o.b(this.f43659a);
        }
        this.f43664f = 1;
    }

    @Override // p147i2.InterfaceC3592q
    public void a(int i10, int i11, c cVar, long j10, int i12) {
        this.f43661c.a(i10, i11, cVar, j10, i12);
    }

    @Override // p147i2.InterfaceC3592q
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f43661c.b(i10, i11, i12, j10, i13);
    }

    @Override // p147i2.InterfaceC3592q
    public void c(Bundle bundle) {
        this.f43661c.c(bundle);
    }

    @Override // p147i2.InterfaceC3592q
    public boolean d(InterfaceC3592q.c cVar) {
        this.f43660b.p(cVar);
        return true;
    }

    @Override // p147i2.InterfaceC3592q
    public MediaFormat e() {
        return this.f43660b.g();
    }

    @Override // p147i2.InterfaceC3592q
    public void f() {
        this.f43659a.detachOutputSurface();
    }

    @Override // p147i2.InterfaceC3592q
    public void flush() {
        this.f43661c.flush();
        this.f43659a.flush();
        this.f43660b.e();
        this.f43659a.start();
    }

    @Override // p147i2.InterfaceC3592q
    public void g(int i10) {
        this.f43659a.setVideoScalingMode(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public ByteBuffer h(int i10) {
        return this.f43659a.getInputBuffer(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public void i(Surface surface) {
        this.f43659a.setOutputSurface(surface);
    }

    @Override // p147i2.InterfaceC3592q
    public boolean j() {
        return false;
    }

    @Override // p147i2.InterfaceC3592q
    public void k(int i10, long j10) {
        this.f43659a.releaseOutputBuffer(i10, j10);
    }

    @Override // p147i2.InterfaceC3592q
    public int l() {
        this.f43661c.d();
        return this.f43660b.c();
    }

    @Override // p147i2.InterfaceC3592q
    public int m(MediaCodec.BufferInfo bufferInfo) {
        this.f43661c.d();
        return this.f43660b.d(bufferInfo);
    }

    @Override // p147i2.InterfaceC3592q
    public void n(int i10, boolean z10) {
        this.f43659a.releaseOutputBuffer(i10, z10);
    }

    @Override // p147i2.InterfaceC3592q
    public ByteBuffer o(int i10) {
        return this.f43659a.getOutputBuffer(i10);
    }

    @Override // p147i2.InterfaceC3592q
    public void p(InterfaceC3592q.d dVar, Handler handler) {
        this.f43659a.setOnFrameRenderedListener(new C3577b(this, dVar), handler);
    }

    @Override // p147i2.InterfaceC3592q
    public void release() {
        C3590o c3590o;
        C3590o c3590o2;
        try {
            if (this.f43664f == 1) {
                this.f43661c.shutdown();
                this.f43660b.q();
            }
            this.f43664f = 2;
            if (this.f43663e) {
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.f43659a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (c3590o2 = this.f43662d) != null) {
                    c3590o2.d(this.f43659a);
                }
                this.f43659a.release();
                this.f43663e = true;
            }
        } catch (Throwable th) {
            if (!this.f43663e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f43659a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (c3590o = this.f43662d) != null) {
                        c3590o.d(this.f43659a);
                    }
                    this.f43659a.release();
                    this.f43663e = true;
                }
            }
            throw th;
        }
    }
}
