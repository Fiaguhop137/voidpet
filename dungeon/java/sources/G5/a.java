package G5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p419x5.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0087a f3946c = new C0087a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3948b;

    /* JADX INFO: renamed from: G5.a$a, reason: collision with other inner class name */
    public static final class C0087a {
        private C0087a() {
        }

        public /* synthetic */ C0087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(d animationInformation) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f3947a = animationInformation;
        this.f3948b = -1L;
    }

    @Override // G5.b
    public long a(long j10) {
        long jD = d();
        long jL = 0;
        if (jD == 0) {
            return -1L;
        }
        if (!e() && j10 / jD >= this.f3947a.b()) {
            return -1L;
        }
        long j11 = j10 % jD;
        int iA = this.f3947a.a();
        for (int i10 = 0; i10 < iA && jL <= j11; i10++) {
            jL += (long) this.f3947a.l(i10);
        }
        return j10 + (jL - j11);
    }

    @Override // G5.b
    public int b(long j10, long j11) {
        long jD = d();
        if (jD == 0) {
            return c(0L);
        }
        if (e() || j10 / jD < this.f3947a.b()) {
            return c(j10 % jD);
        }
        return -1;
    }

    public final int c(long j10) {
        int i10 = 0;
        long jL = 0;
        while (true) {
            jL += (long) this.f3947a.l(i10);
            int i11 = i10 + 1;
            if (j10 < jL) {
                return i10;
            }
            i10 = i11;
        }
    }

    public long d() {
        long j10 = this.f3948b;
        if (j10 != -1) {
            return j10;
        }
        this.f3948b = 0L;
        int iA = this.f3947a.a();
        for (int i10 = 0; i10 < iA; i10++) {
            this.f3948b += (long) this.f3947a.l(i10);
        }
        return this.f3948b;
    }

    public boolean e() {
        return this.f3947a.b() == 0;
    }
}
