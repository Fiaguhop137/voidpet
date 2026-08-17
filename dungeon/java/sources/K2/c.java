package K2;

import R1.x;
import U1.AbstractC1459a;
import U1.S;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5897a;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f5898d = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5901c;

        public a(long j10, long j11, int i10) {
            AbstractC1459a.a(j10 < j11);
            this.f5899a = j10;
            this.f5900b = j11;
            this.f5901c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f5899a == aVar.f5899a && this.f5900b == aVar.f5900b && this.f5901c == aVar.f5901c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f5899a), Long.valueOf(this.f5900b), Integer.valueOf(this.f5901c));
        }

        public String toString() {
            return S.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f5899a), Long.valueOf(this.f5900b), Integer.valueOf(this.f5901c));
        }
    }

    public c(List list) {
        this.f5897a = list;
        AbstractC1459a.a(!d(list));
    }

    private static boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((a) list.get(0)).f5900b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f5899a < j10) {
                return true;
            }
            j10 = ((a) list.get(i10)).f5900b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f5897a.equals(((c) obj).f5897a);
    }

    public int hashCode() {
        return this.f5897a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f5897a;
    }
}
