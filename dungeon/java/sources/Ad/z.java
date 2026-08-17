package Ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f345b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f346a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ z(long j10) {
        this.f346a = j10;
    }

    public static final /* synthetic */ z e(long j10) {
        return new z(j10);
    }

    public static long g(long j10) {
        return j10;
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof z) && j10 == ((z) obj).r();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static String p(long j10) {
        return E.d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return E.b(r(), ((z) obj).r());
    }

    public boolean equals(Object obj) {
        return h(this.f346a, obj);
    }

    public int hashCode() {
        return o(this.f346a);
    }

    public final /* synthetic */ long r() {
        return this.f346a;
    }

    public String toString() {
        return p(this.f346a);
    }
}
