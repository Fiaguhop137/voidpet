package C0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1104g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0 f1105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0835l f1106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f1107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f1108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f1109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f1110f;

    private L0(K0 k10, C0835l c0835l, long j10) {
        this.f1105a = k10;
        this.f1106b = c0835l;
        this.f1107c = j10;
        this.f1108d = c0835l.i();
        this.f1109e = c0835l.m();
        this.f1110f = c0835l.y();
    }

    public /* synthetic */ L0(K0 k10, C0835l c0835l, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k10, c0835l, j10);
    }

    public static /* synthetic */ L0 b(L0 l10, K0 k10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = l10.f1105a;
        }
        if ((i10 & 2) != 0) {
            j10 = l10.f1107c;
        }
        return l10.a(k10, j10);
    }

    public static /* synthetic */ int p(L0 l10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return l10.o(i10, z10);
    }

    public final boolean A(int i10) {
        return this.f1106b.A(i10);
    }

    public final L0 a(K0 k10, long j10) {
        return new L0(k10, this.f1106b, j10, null);
    }

    public final M0.h c(int i10) {
        return this.f1106b.e(i10);
    }

    public final p019b0.g d(int i10) {
        return this.f1106b.f(i10);
    }

    public final p019b0.g e(int i10) {
        return this.f1106b.g(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l10 = (L0) obj;
        return Intrinsics.b(this.f1105a, l10.f1105a) && Intrinsics.b(this.f1106b, l10.f1106b) && O0.r.e(this.f1107c, l10.f1107c) && this.f1108d == l10.f1108d && this.f1109e == l10.f1109e && Intrinsics.b(this.f1110f, l10.f1110f);
    }

    public final boolean f() {
        return this.f1106b.h() || ((float) ((int) (this.f1107c & 4294967295L))) < this.f1106b.j();
    }

    public final boolean g() {
        return ((float) ((int) (this.f1107c >> 32))) < this.f1106b.z();
    }

    public final float h() {
        return this.f1108d;
    }

    public int hashCode() {
        return (((((((((this.f1105a.hashCode() * 31) + this.f1106b.hashCode()) * 31) + O0.r.h(this.f1107c)) * 31) + Float.hashCode(this.f1108d)) * 31) + Float.hashCode(this.f1109e)) * 31) + this.f1110f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f1106b.k(i10, z10);
    }

    public final float k() {
        return this.f1109e;
    }

    public final K0 l() {
        return this.f1105a;
    }

    public final float m(int i10) {
        return this.f1106b.n(i10);
    }

    public final int n() {
        return this.f1106b.o();
    }

    public final int o(int i10, boolean z10) {
        return this.f1106b.p(i10, z10);
    }

    public final int q(int i10) {
        return this.f1106b.q(i10);
    }

    public final int r(float f10) {
        return this.f1106b.r(f10);
    }

    public final float s(int i10) {
        return this.f1106b.s(i10);
    }

    public final float t(int i10) {
        return this.f1106b.t(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f1105a + ", multiParagraph=" + this.f1106b + ", size=" + ((Object) O0.r.i(this.f1107c)) + ", firstBaseline=" + this.f1108d + ", lastBaseline=" + this.f1109e + ", placeholderRects=" + this.f1110f + ')';
    }

    public final int u(int i10) {
        return this.f1106b.u(i10);
    }

    public final float v(int i10) {
        return this.f1106b.v(i10);
    }

    public final C0835l w() {
        return this.f1106b;
    }

    public final M0.h x(int i10) {
        return this.f1106b.w(i10);
    }

    public final List y() {
        return this.f1110f;
    }

    public final long z() {
        return this.f1107c;
    }
}
