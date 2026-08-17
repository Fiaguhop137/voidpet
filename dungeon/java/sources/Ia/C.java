package Ia;

import android.view.VelocityTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5120f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C f5121g = new C(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f5122h = new C(1.0d, 0.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C f5123i = new C(0.0d, -1.0d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C f5124j = new C(0.0d, 1.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C f5125k = new C(1.0d, -1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C f5126l = new C(1.0d, 1.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C f5127m = new C(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C f5128n = new C(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C f5129o = new C(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f5130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f5131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f5132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f5133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f5134e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i10) {
            switch (i10) {
                case 1:
                    return C.f5122h;
                case 2:
                    return C.f5121g;
                case 3:
                case 7:
                default:
                    return C.f5129o;
                case 4:
                    return C.f5123i;
                case 5:
                    return C.f5125k;
                case 6:
                    return C.f5127m;
                case 8:
                    return C.f5124j;
                case 9:
                    return C.f5126l;
                case 10:
                    return C.f5128n;
            }
        }

        public final C b(VelocityTracker tracker) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new C(tracker.getXVelocity(), tracker.getYVelocity());
        }
    }

    public C(double d10, double d11) {
        this.f5130a = d10;
        this.f5131b = d11;
        double dHypot = Math.hypot(d10, d11);
        this.f5134e = dHypot;
        boolean z10 = dHypot > 0.1d;
        this.f5132c = z10 ? d10 / dHypot : 0.0d;
        this.f5133d = z10 ? d11 / dHypot : 0.0d;
    }

    private final double j(C c10) {
        return (this.f5132c * c10.f5132c) + (this.f5133d * c10.f5133d);
    }

    public final double k() {
        return this.f5134e;
    }

    public final boolean l(C vector, double d10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j(vector) > d10;
    }
}
