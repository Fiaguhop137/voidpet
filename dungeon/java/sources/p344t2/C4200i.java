package p344t2;

import java.util.Arrays;

/* JADX INFO: renamed from: t2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4200i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54225d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54227f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f54222a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f54223b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f54226e = -9223372036854775807L;

    /* JADX INFO: renamed from: t2.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f54228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f54231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f54232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f54233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f54234g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f54235h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f54232e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f54233f / j10;
        }

        public long b() {
            return this.f54233f;
        }

        public boolean d() {
            long j10 = this.f54231d;
            if (j10 == 0) {
                return false;
            }
            return this.f54234g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f54231d > 15 && this.f54235h == 0;
        }

        public void f(long j10) {
            long j11 = this.f54231d;
            if (j11 == 0) {
                this.f54228a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f54228a;
                this.f54229b = j12;
                this.f54233f = j12;
                this.f54232e = 1L;
            } else {
                long j13 = j10 - this.f54230c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f54229b) <= 1000000) {
                    this.f54232e++;
                    this.f54233f += j13;
                    boolean[] zArr = this.f54234g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f54235h--;
                    }
                } else {
                    boolean[] zArr2 = this.f54234g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f54235h++;
                    }
                }
            }
            this.f54231d++;
            this.f54230c = j10;
        }

        public void g() {
            this.f54231d = 0L;
            this.f54232e = 0L;
            this.f54233f = 0L;
            this.f54235h = 0;
            Arrays.fill(this.f54234g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f54222a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f54222a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f54227f;
    }

    public long d() {
        if (e()) {
            return this.f54222a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f54222a.e();
    }

    public void f(long j10) {
        this.f54222a.f(j10);
        if (this.f54222a.e() && !this.f54225d) {
            this.f54224c = false;
        } else if (this.f54226e != -9223372036854775807L) {
            if (!this.f54224c || this.f54223b.d()) {
                this.f54223b.g();
                this.f54223b.f(this.f54226e);
            }
            this.f54224c = true;
            this.f54223b.f(j10);
        }
        if (this.f54224c && this.f54223b.e()) {
            a aVar = this.f54222a;
            this.f54222a = this.f54223b;
            this.f54223b = aVar;
            this.f54224c = false;
            this.f54225d = false;
        }
        this.f54226e = j10;
        this.f54227f = this.f54222a.e() ? 0 : this.f54227f + 1;
    }

    public void g() {
        this.f54222a.g();
        this.f54223b.g();
        this.f54224c = false;
        this.f54226e = -9223372036854775807L;
        this.f54227f = 0;
    }
}
