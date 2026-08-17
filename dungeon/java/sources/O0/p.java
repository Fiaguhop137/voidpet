package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8283e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f8284f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8288d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f8284f;
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this.f8285a = i10;
        this.f8286b = i11;
        this.f8287c = i12;
        this.f8288d = i13;
    }

    public static /* synthetic */ p c(p pVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pVar.f8285a;
        }
        if ((i14 & 2) != 0) {
            i11 = pVar.f8286b;
        }
        if ((i14 & 4) != 0) {
            i12 = pVar.f8287c;
        }
        if ((i14 & 8) != 0) {
            i13 = pVar.f8288d;
        }
        return pVar.b(i10, i11, i12, i13);
    }

    public final p b(int i10, int i11, int i12, int i13) {
        return new p(i10, i11, i12, i13);
    }

    public final int d() {
        return this.f8288d;
    }

    public final int e() {
        return this.f8288d - this.f8286b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8285a == pVar.f8285a && this.f8286b == pVar.f8286b && this.f8287c == pVar.f8287c && this.f8288d == pVar.f8288d;
    }

    public final int f() {
        return this.f8285a;
    }

    public final int g() {
        return this.f8287c;
    }

    public final int h() {
        return this.f8286b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f8285a) * 31) + Integer.hashCode(this.f8286b)) * 31) + Integer.hashCode(this.f8287c)) * 31) + Integer.hashCode(this.f8288d);
    }

    public final long i() {
        return n.d((((long) this.f8286b) & 4294967295L) | (((long) this.f8285a) << 32));
    }

    public final boolean j() {
        return this.f8285a >= this.f8287c || this.f8286b >= this.f8288d;
    }

    public final p k(int i10, int i11) {
        return new p(this.f8285a + i10, this.f8286b + i11, this.f8287c + i10, this.f8288d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f8285a + ", " + this.f8286b + ", " + this.f8287c + ", " + this.f8288d + ')';
    }
}
