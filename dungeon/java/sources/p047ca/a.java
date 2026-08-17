package p047ca;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f27258p = new C0354a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f27262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f27263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f27266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f27269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f27270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f27271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f27272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f27273o;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    public static final class C0354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f27274a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27275b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27276c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f27277d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f27278e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f27279f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f27280g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27281h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27282i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f27283j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f27284k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f27285l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f27286m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f27287n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f27288o = "";

        C0354a() {
        }

        public a a() {
            return new a(this.f27274a, this.f27275b, this.f27276c, this.f27277d, this.f27278e, this.f27279f, this.f27280g, this.f27281h, this.f27282i, this.f27283j, this.f27284k, this.f27285l, this.f27286m, this.f27287n, this.f27288o);
        }

        public C0354a b(String str) {
            this.f27286m = str;
            return this;
        }

        public C0354a c(String str) {
            this.f27280g = str;
            return this;
        }

        public C0354a d(String str) {
            this.f27288o = str;
            return this;
        }

        public C0354a e(b bVar) {
            this.f27285l = bVar;
            return this;
        }

        public C0354a f(String str) {
            this.f27276c = str;
            return this;
        }

        public C0354a g(String str) {
            this.f27275b = str;
            return this;
        }

        public C0354a h(c cVar) {
            this.f27277d = cVar;
            return this;
        }

        public C0354a i(String str) {
            this.f27279f = str;
            return this;
        }

        public C0354a j(int i10) {
            this.f27281h = i10;
            return this;
        }

        public C0354a k(long j10) {
            this.f27274a = j10;
            return this;
        }

        public C0354a l(d dVar) {
            this.f27278e = dVar;
            return this;
        }

        public C0354a m(String str) {
            this.f27283j = str;
            return this;
        }

        public C0354a n(int i10) {
            this.f27282i = i10;
            return this;
        }
    }

    public enum b implements S9.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27293a;

        b(int i10) {
            this.f27293a = i10;
        }

        @Override // S9.c
        public int getNumber() {
            return this.f27293a;
        }
    }

    public enum c implements S9.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27299a;

        c(int i10) {
            this.f27299a = i10;
        }

        @Override // S9.c
        public int getNumber() {
            return this.f27299a;
        }
    }

    public enum d implements S9.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27305a;

        d(int i10) {
            this.f27305a = i10;
        }

        @Override // S9.c
        public int getNumber() {
            return this.f27305a;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f27259a = j10;
        this.f27260b = str;
        this.f27261c = str2;
        this.f27262d = cVar;
        this.f27263e = dVar;
        this.f27264f = str3;
        this.f27265g = str4;
        this.f27266h = i10;
        this.f27267i = i11;
        this.f27268j = str5;
        this.f27269k = j11;
        this.f27270l = bVar;
        this.f27271m = str6;
        this.f27272n = j12;
        this.f27273o = str7;
    }

    public static C0354a p() {
        return new C0354a();
    }

    public String a() {
        return this.f27271m;
    }

    public long b() {
        return this.f27269k;
    }

    public long c() {
        return this.f27272n;
    }

    public String d() {
        return this.f27265g;
    }

    public String e() {
        return this.f27273o;
    }

    public b f() {
        return this.f27270l;
    }

    public String g() {
        return this.f27261c;
    }

    public String h() {
        return this.f27260b;
    }

    public c i() {
        return this.f27262d;
    }

    public String j() {
        return this.f27264f;
    }

    public int k() {
        return this.f27266h;
    }

    public long l() {
        return this.f27259a;
    }

    public d m() {
        return this.f27263e;
    }

    public String n() {
        return this.f27268j;
    }

    public int o() {
        return this.f27267i;
    }
}
