package p147i2;

import U1.AbstractC1459a;
import U1.C1469k;
import U1.S;
import Y1.c;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p359u.G;

/* JADX INFO: renamed from: i2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C3581f implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f43670g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f43671h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f43672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f43673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f43674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f43675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1469k f43676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43677f;

    /* JADX INFO: renamed from: i2.f$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3581f.this.j(message);
        }
    }

    /* JADX INFO: renamed from: i2.f$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f43682d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f43683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43684f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f43679a = i10;
            this.f43680b = i11;
            this.f43681c = i12;
            this.f43683e = j10;
            this.f43684f = i13;
        }
    }

    public C3581f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1469k());
    }

    C3581f(MediaCodec mediaCodec, HandlerThread handlerThread, C1469k c1469k) {
        this.f43672a = mediaCodec;
        this.f43673b = handlerThread;
        this.f43676e = c1469k;
        this.f43675d = new AtomicReference();
    }

    private void f() {
        this.f43676e.d();
        ((Handler) AbstractC1459a.e(this.f43674c)).obtainMessage(3).sendToTarget();
        this.f43676e.a();
    }

    private static void g(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f16802f;
        cryptoInfo.numBytesOfClearData = i(cVar.f16800d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f16801e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC1459a.e(h(cVar.f16798b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC1459a.e(h(cVar.f16797a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f16799c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f16803g, cVar.f16804h));
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public void j(Message message) {
        b bVar;
        b bVar2;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                bVar2 = null;
                if (i10 == 3) {
                    this.f43676e.f();
                } else if (i10 != 4) {
                    G.a(this.f43675d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    m((Bundle) message.obj);
                }
            } else {
                bVar = (b) message.obj;
                l(bVar.f43679a, bVar.f43680b, bVar.f43682d, bVar.f43683e, bVar.f43684f);
            }
            if (bVar2 != null) {
                p(bVar2);
            }
        }
        bVar = (b) message.obj;
        k(bVar.f43679a, bVar.f43680b, bVar.f43681c, bVar.f43683e, bVar.f43684f);
        bVar2 = bVar;
        if (bVar2 != null) {
            p(bVar2);
        }
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f43672a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            G.a(this.f43675d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f43671h) {
                this.f43672a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            G.a(this.f43675d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f43672a.setParameters(bundle);
        } catch (RuntimeException e10) {
            G.a(this.f43675d, null, e10);
        }
    }

    private void n() {
        ((Handler) AbstractC1459a.e(this.f43674c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque arrayDeque = f43670g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque arrayDeque = f43670g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // p147i2.r
    public void a(int i10, int i11, c cVar, long j10, int i12) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        g(cVar, bVarO.f43682d);
        ((Handler) S.i(this.f43674c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // p147i2.r
    public void b(int i10, int i11, int i12, long j10, int i13) {
        d();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) S.i(this.f43674c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // p147i2.r
    public void c(Bundle bundle) {
        d();
        ((Handler) S.i(this.f43674c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p147i2.r
    public void d() {
        RuntimeException runtimeException = (RuntimeException) this.f43675d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p147i2.r
    public void flush() {
        if (this.f43677f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // p147i2.r
    public void shutdown() {
        if (this.f43677f) {
            flush();
            this.f43673b.quit();
        }
        this.f43677f = false;
    }

    @Override // p147i2.r
    public void start() {
        if (this.f43677f) {
            return;
        }
        this.f43673b.start();
        this.f43674c = new a(this.f43673b.getLooper());
        this.f43677f = true;
    }
}
