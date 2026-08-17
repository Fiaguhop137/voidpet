package G0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3794g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final q f3795h = new q(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I0.e f3801f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f3795h;
        }
    }

    private q(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, I0.e eVar) {
        this.f3796a = z10;
        this.f3797b = i10;
        this.f3798c = z11;
        this.f3799d = i11;
        this.f3800e = i12;
        this.f3801f = eVar;
    }

    public /* synthetic */ q(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, I0.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? v.f3806a.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? w.f3812a.h() : i11, (i13 & 16) != 0 ? p.f3783b.a() : i12, (i13 & 32) != 0 ? null : yVar, (i13 & 64) != 0 ? I0.e.f4901c.b() : eVar, null);
    }

    public /* synthetic */ q(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, I0.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, yVar, eVar);
    }

    public final boolean b() {
        return this.f3798c;
    }

    public final int c() {
        return this.f3797b;
    }

    public final int d() {
        return this.f3800e;
    }

    public final int e() {
        return this.f3799d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f3796a != qVar.f3796a || !v.f(this.f3797b, qVar.f3797b) || this.f3798c != qVar.f3798c || !w.k(this.f3799d, qVar.f3799d) || !p.l(this.f3800e, qVar.f3800e)) {
            return false;
        }
        qVar.getClass();
        return Intrinsics.b(null, null) && Intrinsics.b(this.f3801f, qVar.f3801f);
    }

    public final y f() {
        return null;
    }

    public final boolean g() {
        return this.f3796a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f3796a) * 31) + v.g(this.f3797b)) * 31) + Boolean.hashCode(this.f3798c)) * 31) + w.l(this.f3799d)) * 31) + p.m(this.f3800e)) * 961) + this.f3801f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f3796a + ", capitalization=" + ((Object) v.h(this.f3797b)) + ", autoCorrect=" + this.f3798c + ", keyboardType=" + ((Object) w.m(this.f3799d)) + ", imeAction=" + ((Object) p.n(this.f3800e)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.f3801f + ')';
    }
}
