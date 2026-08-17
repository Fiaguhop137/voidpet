package M0;

import O0.v;
import O0.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6759c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q f6760d = new q(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6762b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f6760d;
        }
    }

    private q(long j10, long j11) {
        this.f6761a = j10;
        this.f6762b = j11;
    }

    public /* synthetic */ q(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.d(0) : j10, (i10 & 2) != 0 ? w.d(0) : j11, null);
    }

    public /* synthetic */ q(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long b() {
        return this.f6761a;
    }

    public final long c() {
        return this.f6762b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return v.e(this.f6761a, qVar.f6761a) && v.e(this.f6762b, qVar.f6762b);
    }

    public int hashCode() {
        return (v.i(this.f6761a) * 31) + v.i(this.f6762b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) v.j(this.f6761a)) + ", restLine=" + ((Object) v.j(this.f6762b)) + ')';
    }
}
