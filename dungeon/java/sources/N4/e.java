package N4;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7390c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7391d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f7392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f7393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f7394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f7395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f7396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f7397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f7398k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f7400b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f7392e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f7393f = new e(aVar2, bVar);
        f7394g = new e(a.xMaxYMax, bVar);
        f7395h = new e(a.xMidYMin, bVar);
        f7396i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f7397j = new e(aVar, bVar2);
        f7398k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f7399a = aVar;
        this.f7400b = bVar;
    }

    public a a() {
        return this.f7399a;
    }

    public b b() {
        return this.f7400b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7399a == eVar.f7399a && this.f7400b == eVar.f7400b;
    }

    public String toString() {
        return this.f7399a + " " + this.f7400b;
    }
}
