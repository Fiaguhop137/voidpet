package p308r2;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.L;
import U1.S;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f52085d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f52086e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f52087f = new c(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f52088g = new c(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p326s2.a f52089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f52090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f52091c;

    public interface b {
        void i(e eVar, long j10, long j11, boolean z10);

        void j(e eVar, long j10, long j11);

        default void l(e eVar, long j10, long j11, int i10) {
        }

        c n(e eVar, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f52092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f52093b;

        private c(int i10, long j10) {
            this.f52092a = i10;
            this.f52093b = j10;
        }

        /* synthetic */ c(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public boolean c() {
            int i10 = this.f52092a;
            return i10 == 0 || i10 == 1;
        }
    }

    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f52095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f52096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f52097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f52098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f52099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f52100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f52101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f52102i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f52095b = eVar;
            this.f52097d = bVar;
            this.f52094a = i10;
            this.f52096c = j10;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) AbstractC1459a.e(this.f52097d)).l(this.f52095b, jElapsedRealtime, jElapsedRealtime - this.f52096c, this.f52099f);
            this.f52098e = null;
            m.this.f52089a.execute((Runnable) AbstractC1459a.e(m.this.f52090b));
        }

        private void c() {
            m.this.f52090b = null;
        }

        private long d() {
            return Math.min((this.f52099f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f52102i = z10;
            this.f52098e = null;
            if (hasMessages(1)) {
                this.f52101h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f52101h = true;
                        this.f52095b.c();
                        Thread thread = this.f52100g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC1459a.e(this.f52097d)).i(this.f52095b, jElapsedRealtime, jElapsedRealtime - this.f52096c, true);
                this.f52097d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f52098e;
            if (iOException != null && this.f52099f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            AbstractC1459a.g(m.this.f52090b == null);
            m.this.f52090b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f52102i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f52096c;
            b bVar = (b) AbstractC1459a.e(this.f52097d);
            if (this.f52101h) {
                bVar.i(this.f52095b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.j(this.f52095b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    AbstractC1477t.d("LoadTask", "Unexpected exception handling load completed", e10);
                    m.this.f52091c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f52098e = iOException;
            int i12 = this.f52099f + 1;
            this.f52099f = i12;
            c cVarN = bVar.n(this.f52095b, jElapsedRealtime, j10, iOException, i12);
            if (cVarN.f52092a == 3) {
                m.this.f52091c = this.f52098e;
            } else if (cVarN.f52092a != 2) {
                if (cVarN.f52092a == 1) {
                    this.f52099f = 1;
                }
                f(cVarN.f52093b != -9223372036854775807L ? cVarN.f52093b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f52101h;
                    this.f52100g = Thread.currentThread();
                }
                if (!z10) {
                    L.a("load:" + this.f52095b.getClass().getSimpleName());
                    try {
                        this.f52095b.a();
                        L.b();
                    } catch (Throwable th) {
                        L.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f52100g = null;
                    Thread.interrupted();
                }
                if (this.f52102i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f52102i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f52102i) {
                    AbstractC1477t.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f52102i) {
                    return;
                }
                AbstractC1477t.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f52102i) {
                    return;
                }
                AbstractC1477t.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new h(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void o();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f52104a;

        public g(f fVar) {
            this.f52104a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52104a.o();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th);
        }
    }

    public m(String str) {
        this(p326s2.a.Z(S.N0("ExoPlayer:Loader:" + str), new l()));
    }

    public m(p326s2.a aVar) {
        this.f52089a = aVar;
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10, null);
    }

    @Override // p308r2.n
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC1459a.i(this.f52090b)).a(false);
    }

    public void g() {
        this.f52091c = null;
    }

    public boolean i() {
        return this.f52091c != null;
    }

    public boolean j() {
        return this.f52090b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f52091c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f52090b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f52094a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f52090b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f52089a.execute(new g(fVar));
        }
        this.f52089a.release();
    }

    public long n(e eVar, b bVar, int i10) {
        Looper looper = (Looper) AbstractC1459a.i(Looper.myLooper());
        this.f52091c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
