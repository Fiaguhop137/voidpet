package D2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2124b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f2127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f2128d;

        public a(String str, String str2, long j10, long j11) {
            this.f2125a = str;
            this.f2126b = str2;
            this.f2127c = j10;
            this.f2128d = j11;
        }
    }

    public c(long j10, List list) {
        this.f2123a = j10;
        this.f2124b = list;
    }

    public K2.a a(long j10) {
        long j11;
        if (this.f2124b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f2124b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f2124b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f2125a) | z10;
            if (size == 0) {
                j12 -= aVar.f2128d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f2127c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new K2.a(j13, j14, this.f2123a, j15, j16);
    }
}
