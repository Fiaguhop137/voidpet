package kotlin.ranges;

import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Iterable, Nd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f48381d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48384c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(long j10, long j11, long j12) {
            return new c(j10, j11, j12);
        }
    }

    public c(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f48382a = j10;
        this.f48383b = Hd.c.d(j10, j11, j12);
        this.f48384c = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f48382a == cVar.f48382a && this.f48383b == cVar.f48383b && this.f48384c == cVar.f48384c;
    }

    public final long g() {
        return this.f48382a;
    }

    public final long h() {
        return this.f48383b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f48382a;
        long j12 = this.f48383b;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f48384c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public final long i() {
        return this.f48384c;
    }

    public boolean isEmpty() {
        long j10 = this.f48384c;
        long j11 = this.f48382a;
        long j12 = this.f48383b;
        if (j10 > 0) {
            return j11 > j12;
        }
        return j11 < j12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public L iterator() {
        return new Rd.d(this.f48382a, this.f48383b, this.f48384c);
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f48384c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f48382a);
            sb2.append("..");
            sb2.append(this.f48383b);
            sb2.append(" step ");
            j10 = this.f48384c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f48382a);
            sb2.append(" downTo ");
            sb2.append(this.f48383b);
            sb2.append(" step ");
            j10 = -this.f48384c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
