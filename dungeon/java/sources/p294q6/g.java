package p294q6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f51494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f51495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f51497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f51498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f51500k;

    public g(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f51496g = -1L;
        this.f51499j = 1;
        this.f51500k = 1;
        a(config);
    }

    @Override // p294q6.e
    public void a(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f51494e = config.getDouble("velocity");
        this.f51495f = config.getDouble("deceleration");
        this.f51496g = -1L;
        this.f51497h = 0.0d;
        this.f51498i = 0.0d;
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f51499j = i10;
        this.f51500k = 1;
        this.f51481a = i10 == 0;
    }

    @Override // p294q6.e
    public void b(long j10) {
        B b10 = this.f51482b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (this.f51496g == -1) {
            this.f51496g = j11 - ((long) 16);
            double d10 = this.f51497h;
            if (d10 == this.f51498i) {
                this.f51497h = b10.f51471f;
            } else {
                b10.f51471f = d10;
            }
            this.f51498i = b10.f51471f;
        }
        double d11 = this.f51497h;
        double d12 = this.f51494e;
        double d13 = 1;
        double d14 = this.f51495f;
        double dExp = d11 + ((d12 / (d13 - d14)) * (d13 - Math.exp((-(d13 - d14)) * (j11 - this.f51496g))));
        if (Math.abs(this.f51498i - dExp) < 0.1d) {
            int i10 = this.f51499j;
            if (i10 != -1 && this.f51500k >= i10) {
                this.f51481a = true;
                return;
            } else {
                this.f51496g = -1L;
                this.f51500k++;
            }
        }
        this.f51498i = dExp;
        b10.f51471f = dExp;
    }
}
