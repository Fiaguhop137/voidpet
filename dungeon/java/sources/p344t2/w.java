package p344t2;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.S;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4200i f54396a = new C4200i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f54397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f54398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f54400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f54401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f54403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f54409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f54410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f54411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f54412q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                AbstractC1477t.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f54413a;

        public b(DisplayManager displayManager) {
            this.f54413a = displayManager;
        }

        private Display a() {
            return this.f54413a.getDisplay(0);
        }

        public void b() {
            this.f54413a.registerDisplayListener(this, S.z());
            w.this.p(a());
        }

        public void c() {
            this.f54413a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                w.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f54415f = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f54416a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f54417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f54418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f54419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f54420e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f54418c = handlerThread;
            handlerThread.start();
            Handler handlerY = S.y(handlerThread.getLooper(), this);
            this.f54417b = handlerY;
            handlerY.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f54419d;
            if (choreographer != null) {
                int i10 = this.f54420e + 1;
                this.f54420e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f54419d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                AbstractC1477t.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f54415f;
        }

        private void f() {
            Choreographer choreographer = this.f54419d;
            if (choreographer != null) {
                int i10 = this.f54420e - 1;
                this.f54420e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f54416a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f54417b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f54416a = j10;
            ((Choreographer) AbstractC1459a.e(this.f54419d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f54417b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public w(Context context) {
        b bVarF = f(context);
        this.f54397b = bVarF;
        this.f54398c = bVarF != null ? c.d() : null;
        this.f54406k = -9223372036854775807L;
        this.f54407l = -9223372036854775807L;
        this.f54401f = -1.0f;
        this.f54404i = 1.0f;
        this.f54405j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f54400e) == null || this.f54405j == Integer.MIN_VALUE || this.f54403h == 0.0f) {
            return;
        }
        this.f54403h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f54408m = 0L;
        this.f54411p = -1L;
        this.f54409n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f54406k = refreshRate;
            this.f54407l = (refreshRate * 80) / 100;
        } else {
            AbstractC1477t.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f54406k = -9223372036854775807L;
            this.f54407l = -9223372036854775807L;
        }
    }

    private void q() {
        if (Build.VERSION.SDK_INT < 30 || this.f54400e == null) {
            return;
        }
        float fB = this.f54396a.e() ? this.f54396a.b() : this.f54401f;
        float f10 = this.f54402g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f54402g) < ((!this.f54396a.e() || this.f54396a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f54396a.c() < 30) {
            return;
        }
        this.f54402g = fB;
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f54400e) == null || this.f54405j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f54399d) {
            float f11 = this.f54402g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f54404i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f54403h != f10) {
            this.f54403h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f54411p == -1 || !this.f54396a.e()) {
            j11 = j10;
        } else {
            long jA = this.f54412q + ((long) ((this.f54396a.a() * (this.f54408m - this.f54411p)) / this.f54404i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f54409n = this.f54408m;
        this.f54410o = j11;
        c cVar = this.f54398c;
        if (cVar != null && this.f54406k != -9223372036854775807L) {
            long j12 = cVar.f54416a;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f54406k) - this.f54407l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f54401f = f10;
        this.f54396a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f54409n;
        if (j11 != -1) {
            this.f54411p = j11;
            this.f54412q = this.f54410o;
        }
        this.f54408m++;
        this.f54396a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f54404i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f54399d = true;
        n();
        if (this.f54397b != null) {
            ((c) AbstractC1459a.e(this.f54398c)).a();
            this.f54397b.b();
        }
        r(false);
    }

    public void l() {
        this.f54399d = false;
        b bVar = this.f54397b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC1459a.e(this.f54398c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f54400e == surface) {
            return;
        }
        d();
        this.f54400e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f54405j == i10) {
            return;
        }
        this.f54405j = i10;
        r(true);
    }
}
