package p380v2;

import U1.AbstractC1459a;

/* JADX INFO: loaded from: classes.dex */
public interface J {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f55970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f55971b;

        public a(K k10) {
            this(k10, k10);
        }

        public a(K k10, K k11) {
            this.f55970a = (K) AbstractC1459a.e(k10);
            this.f55971b = (K) AbstractC1459a.e(k11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f55970a.equals(aVar.f55970a) && this.f55971b.equals(aVar.f55971b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f55970a.hashCode() * 31) + this.f55971b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f55970a);
            if (this.f55970a.equals(this.f55971b)) {
                str = "";
            } else {
                str = ", " + this.f55971b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f55972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f55973b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f55972a = j10;
            this.f55973b = new a(j11 == 0 ? K.f55974c : new K(0L, j11));
        }

        @Override // p380v2.J
        public a e(long j10) {
            return this.f55973b;
        }

        @Override // p380v2.J
        public boolean i() {
            return false;
        }

        @Override // p380v2.J
        public long m() {
            return this.f55972a;
        }
    }

    a e(long j10);

    boolean i();

    long m();
}
