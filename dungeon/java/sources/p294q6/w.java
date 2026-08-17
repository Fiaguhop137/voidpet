package p294q6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f51568u = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f51571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f51572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f51573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f51574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f51576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f51577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f51578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f51579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f51580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f51581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f51582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f51583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f51584t;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f51585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f51586b;

        public b(double d10, double d11) {
            this.f51585a = d10;
            this.f51586b = d11;
        }

        public /* synthetic */ b(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }

        public final double a() {
            return this.f51585a;
        }

        public final double b() {
            return this.f51586b;
        }

        public final void c(double d10) {
            this.f51585a = d10;
        }

        public final void d(double d10) {
            this.f51586b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f51585a, bVar.f51585a) == 0 && Double.compare(this.f51586b, bVar.f51586b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f51585a) * 31) + Double.hashCode(this.f51586b);
        }

        public String toString() {
            return "PhysicsState(position=" + this.f51585a + ", velocity=" + this.f51586b + ")";
        }
    }

    public w(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        b bVar = new b(0.0d, 0.0d, 3, null);
        this.f51576l = bVar;
        bVar.d(config.getDouble("initialVelocity"));
        a(config);
    }

    private final void c(double d10) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.f51581q += d10 <= 0.064d ? d10 : 0.064d;
        double d11 = this.f51572h;
        double d12 = this.f51573i;
        double d13 = this.f51571g;
        double d14 = -this.f51574j;
        double dSqrt = d11 / (((double) 2) * Math.sqrt(d13 * d12));
        double dSqrt2 = Math.sqrt(d13 / d12);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d15 = this.f51578n - this.f51577m;
        double d16 = this.f51581q;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d16);
            double d17 = dSqrt2 * dSqrt;
            double d18 = d14 + (d17 * d15);
            double d19 = d16 * dSqrt3;
            dSin2 = this.f51578n - ((((d18 / dSqrt3) * Math.sin(d19)) + (Math.cos(d19) * d15)) * dExp);
            dSin = ((d17 * dExp) * (((Math.sin(d19) * d18) / dSqrt3) + (Math.cos(d19) * d15))) - (dExp * ((Math.cos(d19) * d18) - ((dSqrt3 * d15) * Math.sin(d19))));
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d16);
            double d20 = this.f51578n - (((((dSqrt2 * d15) + d14) * d16) + d15) * dExp2);
            dSin = dExp2 * ((d14 * ((d16 * dSqrt2) - ((double) 1))) + (d16 * d15 * dSqrt2 * dSqrt2));
            dSin2 = d20;
        }
        this.f51576l.c(dSin2);
        this.f51576l.d(dSin);
        if (e() || (this.f51575k && f())) {
            if (this.f51571g > 0.0d) {
                double d21 = this.f51578n;
                this.f51577m = d21;
                this.f51576l.c(d21);
            } else {
                double dA = this.f51576l.a();
                this.f51578n = dA;
                this.f51577m = dA;
            }
            this.f51576l.d(0.0d);
        }
    }

    private final double d(b bVar) {
        return Math.abs(this.f51578n - bVar.a());
    }

    private final boolean e() {
        if (Math.abs(this.f51576l.b()) <= this.f51579o) {
            return d(this.f51576l) <= this.f51580p || this.f51571g == 0.0d;
        }
        return false;
    }

    private final boolean f() {
        if (this.f51571g <= 0.0d) {
            return false;
        }
        if (this.f51577m >= this.f51578n || this.f51576l.a() <= this.f51578n) {
            return this.f51577m > this.f51578n && this.f51576l.a() < this.f51578n;
        }
        return true;
    }

    @Override // p294q6.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f51571g = config.getDouble("stiffness");
        this.f51572h = config.getDouble("damping");
        this.f51573i = config.getDouble("mass");
        this.f51574j = this.f51576l.b();
        this.f51578n = config.getDouble("toValue");
        this.f51579o = config.getDouble("restSpeedThreshold");
        this.f51580p = config.getDouble("restDisplacementThreshold");
        this.f51575k = config.getBoolean("overshootClamping");
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f51582r = i10;
        this.f51481a = i10 == 0;
        this.f51583s = 0;
        this.f51581q = 0.0d;
        this.f51570f = false;
    }

    @Override // p294q6.e
    public void b(long j10) {
        B b10 = this.f51482b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (!this.f51570f) {
            if (this.f51583s == 0) {
                this.f51584t = b10.f51471f;
                this.f51583s = 1;
            }
            this.f51576l.c(b10.f51471f);
            this.f51577m = this.f51576l.a();
            this.f51569e = j11;
            this.f51581q = 0.0d;
            this.f51570f = true;
        }
        c((j11 - this.f51569e) / 1000.0d);
        this.f51569e = j11;
        b10.f51471f = this.f51576l.a();
        if (e()) {
            int i10 = this.f51582r;
            if (i10 != -1 && this.f51583s >= i10) {
                this.f51481a = true;
                return;
            }
            this.f51570f = false;
            b10.f51471f = this.f51584t;
            this.f51583s++;
        }
    }
}
