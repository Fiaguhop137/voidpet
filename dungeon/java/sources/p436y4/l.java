package p436y4;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f57898a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f57899b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f57900c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f57901d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f57902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f57903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f57904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p274p4.g f57905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f57906i;

    private static class a extends l {
        a() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    private static class b extends l {
        b() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    private static class c extends l {
        c() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : l.f57900c.a(i10, i11, i12, i13);
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f57900c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends l {
        d() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends l {
        e() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return l.f57906i ? g.QUALITY : g.MEMORY;
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            if (l.f57906i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class f extends l {
        f() {
        }

        @Override // p436y4.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p436y4.l
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f57902e = dVar;
        f57903f = new f();
        f57904g = dVar;
        f57905h = p274p4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f57906i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
