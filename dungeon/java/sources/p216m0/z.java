package p216m0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p019b0.e;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f48921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f48923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f48924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f48925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f48926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f48927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f48928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f48929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f48930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f48931o;

    private z(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f48917a = j10;
        this.f48918b = j11;
        this.f48919c = j12;
        this.f48920d = z10;
        this.f48921e = f10;
        this.f48922f = j13;
        this.f48923g = j14;
        this.f48924h = z11;
        this.f48925i = i10;
        this.f48926j = j15;
        this.f48928l = e.f25805b.c();
        this.f48929m = z12;
        this.f48930n = z12;
    }

    public /* synthetic */ z(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? N.f48810a.d() : i10, (i11 & 1024) != 0 ? e.f25805b.c() : j15, null);
    }

    public /* synthetic */ z(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    private z(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this.f48927k = list;
        this.f48928l = j16;
    }

    public /* synthetic */ z(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15, j16);
    }

    public static /* synthetic */ z c(z zVar, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? zVar.f48917a : j10;
        long j18 = (i11 & 2) != 0 ? zVar.f48918b : j11;
        long j19 = (i11 & 4) != 0 ? zVar.f48919c : j12;
        boolean z12 = (i11 & 8) != 0 ? zVar.f48920d : z10;
        long j20 = (i11 & 16) != 0 ? zVar.f48922f : j13;
        long j21 = (i11 & 32) != 0 ? zVar.f48923g : j14;
        boolean z13 = (i11 & 64) != 0 ? zVar.f48924h : z11;
        int i12 = (i11 & 128) != 0 ? zVar.f48925i : i10;
        if ((i11 & 512) != 0) {
            j16 = zVar.f48926j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return zVar.b(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    public final void a() {
        z zVar = this.f48931o;
        if (zVar == null) {
            this.f48929m = true;
            this.f48930n = true;
        } else if (zVar != null) {
            zVar.a();
        }
    }

    public final z b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        z zVarD = d(j10, j11, j12, z10, this.f48921e, j13, j14, z11, i10, list, j15);
        z zVar = this.f48931o;
        if (zVar == null) {
            zVar = this;
        }
        zVarD.f48931o = zVar;
        return zVarD;
    }

    public final z d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        z zVar = new z(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f48928l, null);
        z zVar2 = this.f48931o;
        if (zVar2 == null) {
            zVar2 = this;
        }
        zVar.f48931o = zVar2;
        return zVar;
    }

    public final List e() {
        List list = this.f48927k;
        return list == null ? CollectionsKt.l() : list;
    }

    public final long f() {
        return this.f48917a;
    }

    public final long g() {
        return this.f48928l;
    }

    public final long h() {
        return this.f48919c;
    }

    public final boolean i() {
        return this.f48920d;
    }

    public final float j() {
        return this.f48921e;
    }

    public final long k() {
        return this.f48923g;
    }

    public final boolean l() {
        return this.f48924h;
    }

    public final int m() {
        return this.f48925i;
    }

    public final long n() {
        return this.f48918b;
    }

    public final boolean o() {
        z zVar = this.f48931o;
        if (zVar != null) {
            return zVar.o();
        }
        return this.f48929m || this.f48930n;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) y.d(this.f48917a)) + ", uptimeMillis=" + this.f48918b + ", position=" + ((Object) e.s(this.f48919c)) + ", pressed=" + this.f48920d + ", pressure=" + this.f48921e + ", previousUptimeMillis=" + this.f48922f + ", previousPosition=" + ((Object) e.s(this.f48923g)) + ", previousPressed=" + this.f48924h + ", isConsumed=" + o() + ", type=" + ((Object) N.i(this.f48925i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) e.s(this.f48926j)) + ')';
    }
}
