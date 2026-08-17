package kotlin.ranges;

import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Iterable, Nd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f48377d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48380c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, int i12) {
            return new b(i10, i11, i12);
        }
    }

    public b(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f48378a = i10;
        this.f48379b = Hd.c.c(i10, i11, i12);
        this.f48380c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f48378a == bVar.f48378a && this.f48379b == bVar.f48379b && this.f48380c == bVar.f48380c;
    }

    public final int g() {
        return this.f48378a;
    }

    public final int h() {
        return this.f48379b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48378a * 31) + this.f48379b) * 31) + this.f48380c;
    }

    public final int i() {
        return this.f48380c;
    }

    public boolean isEmpty() {
        if (this.f48380c > 0) {
            return this.f48378a > this.f48379b;
        }
        return this.f48378a < this.f48379b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public K iterator() {
        return new Rd.c(this.f48378a, this.f48379b, this.f48380c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f48380c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f48378a);
            sb2.append("..");
            sb2.append(this.f48379b);
            sb2.append(" step ");
            i10 = this.f48380c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f48378a);
            sb2.append(" downTo ");
            sb2.append(this.f48379b);
            sb2.append(" step ");
            i10 = -this.f48380c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
