package p021b2;

import U1.S;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B.a f25896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f25902i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f25903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f25904b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f25905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f25907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f25909g;

        public a(AudioTrack audioTrack) {
            this.f25903a = audioTrack;
        }

        public void a() {
            this.f25908f = true;
        }

        public long b() {
            return this.f25907e;
        }

        public long c() {
            return this.f25904b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f25903a.getTimestamp(this.f25904b);
            if (timestamp) {
                long j10 = this.f25904b.framePosition;
                long j11 = this.f25906d;
                if (j11 > j10) {
                    if (this.f25908f) {
                        this.f25909g += j11;
                        this.f25908f = false;
                    } else {
                        this.f25905c++;
                    }
                }
                this.f25906d = j10;
                this.f25907e = j10 + this.f25909g + (this.f25905c << 32);
            }
            return timestamp;
        }
    }

    public A(AudioTrack audioTrack, B.a aVar) {
        this.f25894a = new a(audioTrack);
        this.f25895b = audioTrack.getSampleRate();
        this.f25896c = aVar;
        j();
    }

    private void a(long j10, float f10, long j11) {
        long jC = this.f25894a.c();
        long jB = b(j10, f10);
        if (Math.abs(jC - j10) > 5000000) {
            this.f25896c.e(this.f25894a.b(), jC, j10, j11);
            k(4);
        } else if (Math.abs(jB - j11) > 5000000) {
            this.f25896c.d(this.f25894a.b(), jC, j10, j11);
            k(4);
        } else if (this.f25897d == 4) {
            j();
        }
    }

    private long b(long j10, float f10) {
        return c(this.f25894a.b(), this.f25894a.c(), j10, f10);
    }

    private long c(long j10, long j11, long j12, float f10) {
        return S.Z0(j10, this.f25895b) + S.g0(j12 - j11, f10);
    }

    private boolean g(long j10, float f10) {
        long jB = this.f25894a.b();
        long j11 = this.f25901h;
        if (jB <= j11) {
            return false;
        }
        return Math.abs(b(j10, f10) - c(j11, this.f25902i, j10, f10)) < 1000;
    }

    private void k(int i10) {
        this.f25897d = i10;
        if (i10 == 0) {
            this.f25900g = 0L;
            this.f25901h = -1L;
            this.f25902i = -9223372036854775807L;
            this.f25898e = System.nanoTime() / 1000;
            this.f25899f = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f25899f = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f25899f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f25899f = 500000L;
        }
    }

    public void d() {
        this.f25894a.a();
    }

    public long e(long j10, float f10) {
        return b(j10, f10);
    }

    public boolean f() {
        return this.f25897d == 2;
    }

    public boolean h() {
        int i10 = this.f25897d;
        return i10 == 0 || i10 == 1;
    }

    public void i(long j10, float f10, long j11) {
        if (j10 - this.f25900g < this.f25899f) {
            return;
        }
        this.f25900g = j10;
        boolean zD = this.f25894a.d();
        if (zD) {
            a(j10, f10, j11);
        }
        int i10 = this.f25897d;
        if (i10 == 0) {
            if (!zD) {
                if (j10 - this.f25898e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.f25894a.c() >= this.f25898e) {
                    this.f25901h = this.f25894a.b();
                    this.f25902i = this.f25894a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            if (!zD) {
                j();
                return;
            }
            if (g(j10, f10)) {
                k(2);
                return;
            } else if (j10 - this.f25898e > 2000000) {
                k(3);
                return;
            } else {
                this.f25901h = this.f25894a.b();
                this.f25902i = this.f25894a.c();
                return;
            }
        }
        if (i10 == 2) {
            if (zD) {
                return;
            }
            j();
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        } else if (zD) {
            j();
        }
    }

    public void j() {
        k(0);
    }
}
