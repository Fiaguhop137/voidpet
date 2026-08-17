package p021b2;

import U1.AbstractC1459a;
import U1.InterfaceC1466h;
import U1.S;
import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f25910A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f25911B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f25912C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f25913D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f25914E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f25915F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f25916G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f25917H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private InterfaceC1466h f25918I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f25920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f25921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private A f25923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f25931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Method f25933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f25934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f25937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f25938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f25939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f25940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f25941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25943y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f25944z;

    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public B(a aVar) {
        this.f25919a = (a) AbstractC1459a.e(aVar);
        try {
            this.f25933o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f25920b = new long[10];
        this.f25915F = -9223372036854775807L;
        this.f25914E = -9223372036854775807L;
        this.f25918I = InterfaceC1466h.f12906a;
    }

    private boolean b() {
        return this.f25925g && ((AudioTrack) AbstractC1459a.e(this.f25921c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f25944z != -9223372036854775807L) {
            return Math.min(this.f25912C, g());
        }
        long jC = this.f25918I.c();
        if (jC - this.f25938t >= 5) {
            y(jC);
            this.f25938t = jC;
        }
        return this.f25939u + this.f25917H + (this.f25940v << 32);
    }

    private long e(long j10) {
        long jG0;
        if (this.f25943y == 0) {
            jG0 = this.f25944z != -9223372036854775807L ? S.Z0(g(), this.f25924f) : f();
        } else {
            jG0 = S.g0(j10 + this.f25931m, this.f25927i);
        }
        long jMax = Math.max(0L, jG0 - this.f25934p);
        return this.f25944z != -9223372036854775807L ? Math.min(S.Z0(this.f25912C, this.f25924f), jMax) : jMax;
    }

    private long f() {
        return S.Z0(d(), this.f25924f);
    }

    private long g() {
        if (((AudioTrack) AbstractC1459a.e(this.f25921c)).getPlayState() == 2) {
            return this.f25911B;
        }
        return this.f25911B + S.E(S.g0(S.M0(this.f25918I.c()) - this.f25944z, this.f25927i), this.f25924f);
    }

    private boolean i() {
        int underrunCount = ((AudioTrack) AbstractC1459a.e(this.f25921c)).getUnderrunCount();
        boolean z10 = underrunCount > this.f25930l;
        this.f25930l = underrunCount;
        return z10;
    }

    private void n() {
        long jB = this.f25918I.b() / 1000;
        if (jB - this.f25932n >= 30000) {
            long jF = f();
            if (jF != 0) {
                this.f25920b[this.f25942x] = S.m0(jF, this.f25927i) - jB;
                this.f25942x = (this.f25942x + 1) % 10;
                int i10 = this.f25943y;
                if (i10 < 10) {
                    this.f25943y = i10 + 1;
                }
                this.f25932n = jB;
                this.f25931m = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f25943y;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f25931m += this.f25920b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f25925g) {
            return;
        }
        p(jB);
        ((A) AbstractC1459a.e(this.f25923e)).i(jB, this.f25927i, e(jB));
    }

    private void o(long j10) {
        if (this.f25913D) {
            long j11 = this.f25929k;
            if (j11 == -9223372036854775807L || j10 < j11) {
                return;
            }
            long jA = this.f25918I.a() - S.o1(S.m0(j10 - j11, this.f25927i));
            this.f25929k = -9223372036854775807L;
            this.f25919a.a(jA);
        }
    }

    private void p(long j10) {
        Method method;
        if (!this.f25936r || (method = this.f25933o) == null || j10 - this.f25937s < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) S.i((Integer) method.invoke(AbstractC1459a.e(this.f25921c), null))).intValue()) * 1000) - this.f25926h;
            this.f25934p = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f25934p = jMax;
            if (jMax > 5000000) {
                this.f25919a.c(jMax);
                this.f25934p = 0L;
            }
        } catch (Exception unused) {
            this.f25933o = null;
        }
        this.f25937s = j10;
    }

    private static boolean q(int i10) {
        return false;
    }

    private void t() {
        this.f25931m = 0L;
        this.f25943y = 0;
        this.f25942x = 0;
        this.f25932n = 0L;
        this.f25914E = -9223372036854775807L;
        this.f25915F = -9223372036854775807L;
        this.f25928j = false;
    }

    private void y(long j10) {
        AudioTrack audioTrack = (AudioTrack) AbstractC1459a.e(this.f25921c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f25925g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f25941w = this.f25939u;
            }
            playbackHeadPosition += this.f25941w;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f25939u > 0 && playState == 3) {
                if (this.f25910A == -9223372036854775807L) {
                    this.f25910A = j10;
                    return;
                }
                return;
            }
            this.f25910A = -9223372036854775807L;
        }
        long j11 = this.f25939u;
        if (j11 > playbackHeadPosition) {
            if (this.f25916G) {
                this.f25917H += j11;
                this.f25916G = false;
            } else {
                this.f25940v++;
            }
        }
        this.f25939u = playbackHeadPosition;
    }

    public void a() {
        this.f25916G = true;
        A a10 = this.f25923e;
        if (a10 != null) {
            a10.d();
        }
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) AbstractC1459a.e(this.f25921c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long jB = this.f25918I.b() / 1000;
        A a10 = (A) AbstractC1459a.e(this.f25923e);
        boolean zF = a10.f();
        long jE = zF ? a10.e(jB, this.f25927i) : e(jB);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(jE);
            }
            return jE;
        }
        if (zF || !a10.h()) {
            o(jE);
        }
        long j10 = this.f25915F;
        if (j10 != -9223372036854775807L) {
            long j11 = jE - this.f25914E;
            long jG0 = S.g0(jB - j10, this.f25927i);
            long j12 = this.f25914E + jG0;
            long jAbs = Math.abs(j12 - jE);
            if (j11 != 0 && jAbs < 1000000) {
                long j13 = (jG0 * 10) / 100;
                jE = S.p(jE, j12 - j13, j12 + j13);
            }
        }
        if (!this.f25913D && !this.f25928j) {
            long j14 = this.f25914E;
            if (j14 != -9223372036854775807L && jE > j14) {
                this.f25928j = true;
                this.f25919a.a(this.f25918I.a() - S.o1(S.m0(S.o1(jE - j14), this.f25927i)));
            }
        }
        this.f25915F = jB;
        this.f25914E = jE;
        return jE;
    }

    public void h(long j10) {
        this.f25911B = d();
        this.f25944z = S.M0(this.f25918I.c());
        this.f25912C = j10;
    }

    public boolean j(long j10) {
        return j10 > S.E(c(), this.f25924f) || b();
    }

    public boolean k() {
        return ((AudioTrack) AbstractC1459a.e(this.f25921c)).getPlayState() == 3;
    }

    public boolean l(long j10) {
        return this.f25910A != -9223372036854775807L && j10 > 0 && this.f25918I.c() - this.f25910A >= 200;
    }

    public boolean m(long j10) {
        int playState = ((AudioTrack) AbstractC1459a.e(this.f25921c)).getPlayState();
        if (this.f25925g) {
            if (playState == 2) {
                this.f25935q = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (i()) {
            this.f25919a.b(this.f25922d, S.o1(this.f25926h));
        }
        return true;
    }

    public void r() {
        t();
        if (this.f25944z == -9223372036854775807L) {
            ((A) AbstractC1459a.e(this.f25923e)).j();
        }
        this.f25911B = d();
    }

    public void s() {
        t();
        this.f25921c = null;
        this.f25923e = null;
    }

    public void u(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12, boolean z11) {
        this.f25921c = audioTrack;
        this.f25922d = i12;
        this.f25923e = new A(audioTrack, this.f25919a);
        this.f25924f = audioTrack.getSampleRate();
        this.f25925g = z10 && q(i10);
        boolean zD0 = S.D0(i10);
        this.f25936r = zD0;
        this.f25926h = zD0 ? S.Z0(i12 / i11, this.f25924f) : -9223372036854775807L;
        this.f25939u = 0L;
        this.f25940v = 0L;
        this.f25916G = false;
        this.f25917H = 0L;
        this.f25941w = 0L;
        this.f25935q = false;
        this.f25944z = -9223372036854775807L;
        this.f25910A = -9223372036854775807L;
        this.f25937s = 0L;
        this.f25934p = 0L;
        this.f25927i = 1.0f;
        this.f25930l = 0;
        this.f25929k = -9223372036854775807L;
        this.f25913D = z11;
    }

    public void v(float f10) {
        this.f25927i = f10;
        A a10 = this.f25923e;
        if (a10 != null) {
            a10.j();
        }
        t();
    }

    public void w(InterfaceC1466h interfaceC1466h) {
        this.f25918I = interfaceC1466h;
    }

    public void x() {
        if (this.f25944z != -9223372036854775807L) {
            this.f25944z = S.M0(this.f25918I.c());
        }
        this.f25929k = f();
        ((A) AbstractC1459a.e(this.f25923e)).j();
    }
}
