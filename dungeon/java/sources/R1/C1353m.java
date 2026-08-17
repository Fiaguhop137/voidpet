package R1;

import U1.AbstractC1459a;
import U1.S;
import java.util.Objects;

/* JADX INFO: renamed from: R1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1353m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1353m f10183e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f10184f = S.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f10185g = S.z0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f10186h = S.z0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f10187i = S.z0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10191d;

    /* JADX INFO: renamed from: R1.m$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10195d;

        public b(int i10) {
            this.f10192a = i10;
        }

        public C1353m e() {
            AbstractC1459a.a(this.f10193b <= this.f10194c);
            return new C1353m(this, null);
        }

        public b f(int i10) {
            this.f10194c = i10;
            return this;
        }

        public b g(int i10) {
            this.f10193b = i10;
            return this;
        }
    }

    private C1353m(b bVar) {
        this.f10188a = bVar.f10192a;
        this.f10189b = bVar.f10193b;
        this.f10190c = bVar.f10194c;
        this.f10191d = bVar.f10195d;
    }

    /* synthetic */ C1353m(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353m)) {
            return false;
        }
        C1353m c1353m = (C1353m) obj;
        return this.f10188a == c1353m.f10188a && this.f10189b == c1353m.f10189b && this.f10190c == c1353m.f10190c && Objects.equals(this.f10191d, c1353m.f10191d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f10188a) * 31) + this.f10189b) * 31) + this.f10190c) * 31;
        String str = this.f10191d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
