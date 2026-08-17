package p019b0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25816i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i f25817j = j.c(0.0f, 0.0f, 0.0f, 0.0f, p019b0.a.f25799a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f25824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f25825h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private i(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f25818a = f10;
        this.f25819b = f11;
        this.f25820c = f12;
        this.f25821d = f13;
        this.f25822e = j10;
        this.f25823f = j11;
        this.f25824g = j12;
        this.f25825h = j13;
    }

    public /* synthetic */ i(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f25821d;
    }

    public final long b() {
        return this.f25825h;
    }

    public final long c() {
        return this.f25824g;
    }

    public final float d() {
        return this.f25821d - this.f25819b;
    }

    public final float e() {
        return this.f25818a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f25818a, iVar.f25818a) == 0 && Float.compare(this.f25819b, iVar.f25819b) == 0 && Float.compare(this.f25820c, iVar.f25820c) == 0 && Float.compare(this.f25821d, iVar.f25821d) == 0 && p019b0.a.c(this.f25822e, iVar.f25822e) && p019b0.a.c(this.f25823f, iVar.f25823f) && p019b0.a.c(this.f25824g, iVar.f25824g) && p019b0.a.c(this.f25825h, iVar.f25825h);
    }

    public final float f() {
        return this.f25820c;
    }

    public final float g() {
        return this.f25819b;
    }

    public final long h() {
        return this.f25822e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f25818a) * 31) + Float.hashCode(this.f25819b)) * 31) + Float.hashCode(this.f25820c)) * 31) + Float.hashCode(this.f25821d)) * 31) + p019b0.a.d(this.f25822e)) * 31) + p019b0.a.d(this.f25823f)) * 31) + p019b0.a.d(this.f25824g)) * 31) + p019b0.a.d(this.f25825h);
    }

    public final long i() {
        return this.f25823f;
    }

    public final float j() {
        return this.f25820c - this.f25818a;
    }

    public String toString() {
        long j10 = this.f25822e;
        long j11 = this.f25823f;
        long j12 = this.f25824g;
        long j13 = this.f25825h;
        String str = b.a(this.f25818a, 1) + ", " + b.a(this.f25819b, 1) + ", " + b.a(this.f25820c, 1) + ", " + b.a(this.f25821d, 1);
        if (!p019b0.a.c(j10, j11) || !p019b0.a.c(j11, j12) || !p019b0.a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) p019b0.a.e(j10)) + ", topRight=" + ((Object) p019b0.a.e(j11)) + ", bottomRight=" + ((Object) p019b0.a.e(j12)) + ", bottomLeft=" + ((Object) p019b0.a.e(j13)) + ')';
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + b.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + b.a(Float.intBitsToFloat(i10), 1) + ", y=" + b.a(Float.intBitsToFloat(i11), 1) + ')';
    }
}
