package p216m0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019b0.e;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f48779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f48781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f48783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f48784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f48785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f48786k;

    private C(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15) {
        this.f48776a = j10;
        this.f48777b = j11;
        this.f48778c = j12;
        this.f48779d = j13;
        this.f48780e = z10;
        this.f48781f = f10;
        this.f48782g = i10;
        this.f48783h = z11;
        this.f48784i = list;
        this.f48785j = j14;
        this.f48786k = j15;
    }

    public /* synthetic */ C(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean a() {
        return this.f48783h;
    }

    public final boolean b() {
        return this.f48780e;
    }

    public final List c() {
        return this.f48784i;
    }

    public final long d() {
        return this.f48776a;
    }

    public final long e() {
        return this.f48786k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return y.b(this.f48776a, c10.f48776a) && this.f48777b == c10.f48777b && e.j(this.f48778c, c10.f48778c) && e.j(this.f48779d, c10.f48779d) && this.f48780e == c10.f48780e && Float.compare(this.f48781f, c10.f48781f) == 0 && N.g(this.f48782g, c10.f48782g) && this.f48783h == c10.f48783h && Intrinsics.b(this.f48784i, c10.f48784i) && e.j(this.f48785j, c10.f48785j) && e.j(this.f48786k, c10.f48786k);
    }

    public final long f() {
        return this.f48779d;
    }

    public final long g() {
        return this.f48778c;
    }

    public final float h() {
        return this.f48781f;
    }

    public int hashCode() {
        return (((((((((((((((((((y.c(this.f48776a) * 31) + Long.hashCode(this.f48777b)) * 31) + e.o(this.f48778c)) * 31) + e.o(this.f48779d)) * 31) + Boolean.hashCode(this.f48780e)) * 31) + Float.hashCode(this.f48781f)) * 31) + N.h(this.f48782g)) * 31) + Boolean.hashCode(this.f48783h)) * 31) + this.f48784i.hashCode()) * 31) + e.o(this.f48785j)) * 31) + e.o(this.f48786k);
    }

    public final long i() {
        return this.f48785j;
    }

    public final int j() {
        return this.f48782g;
    }

    public final long k() {
        return this.f48777b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) y.d(this.f48776a)) + ", uptime=" + this.f48777b + ", positionOnScreen=" + ((Object) e.s(this.f48778c)) + ", position=" + ((Object) e.s(this.f48779d)) + ", down=" + this.f48780e + ", pressure=" + this.f48781f + ", type=" + ((Object) N.i(this.f48782g)) + ", activeHover=" + this.f48783h + ", historical=" + this.f48784i + ", scrollDelta=" + ((Object) e.s(this.f48785j)) + ", originalEventPosition=" + ((Object) e.s(this.f48786k)) + ')';
    }
}
