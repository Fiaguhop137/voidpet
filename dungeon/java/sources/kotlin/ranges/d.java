package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c implements Rd.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f48385e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f48386f = new d(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f48386f;
        }
    }

    public d(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // kotlin.ranges.c
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return g() == dVar.g() && h() == dVar.h();
    }

    @Override // kotlin.ranges.c
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (g() ^ (g() >>> 32))) + (h() ^ (h() >>> 32)));
    }

    @Override // kotlin.ranges.c, Rd.b
    public boolean isEmpty() {
        return g() > h();
    }

    @Override // Rd.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(h());
    }

    @Override // Rd.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return Long.valueOf(g());
    }

    @Override // kotlin.ranges.c
    public String toString() {
        return g() + ".." + h();
    }
}
