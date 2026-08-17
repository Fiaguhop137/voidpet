package p005a4;

import R3.C1364k;
import Y3.j;
import Y3.k;
import Y3.n;
import Z3.h;
import java.util.List;
import java.util.Locale;
import p041c4.C2123j;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1364k f19425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f19428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f19431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f19432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f19436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f19437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f19438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f19439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f19440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f19441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Y3.b f19442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f19443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f19444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f19445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Z3.a f19446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final C2123j f19447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final h f19448y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List list, C1364k c1364k, String str, long j10, a aVar, long j11, String str2, List list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List list3, b bVar, Y3.b bVar2, boolean z10, Z3.a aVar2, C2123j c2123j, h hVar) {
        this.f19424a = list;
        this.f19425b = c1364k;
        this.f19426c = str;
        this.f19427d = j10;
        this.f19428e = aVar;
        this.f19429f = j11;
        this.f19430g = str2;
        this.f19431h = list2;
        this.f19432i = nVar;
        this.f19433j = i10;
        this.f19434k = i11;
        this.f19435l = i12;
        this.f19436m = f10;
        this.f19437n = f11;
        this.f19438o = f12;
        this.f19439p = f13;
        this.f19440q = jVar;
        this.f19441r = kVar;
        this.f19443t = list3;
        this.f19444u = bVar;
        this.f19442s = bVar2;
        this.f19445v = z10;
        this.f19446w = aVar2;
        this.f19447x = c2123j;
        this.f19448y = hVar;
    }

    public h a() {
        return this.f19448y;
    }

    public Z3.a b() {
        return this.f19446w;
    }

    C1364k c() {
        return this.f19425b;
    }

    public C2123j d() {
        return this.f19447x;
    }

    public long e() {
        return this.f19427d;
    }

    List f() {
        return this.f19443t;
    }

    public a g() {
        return this.f19428e;
    }

    List h() {
        return this.f19431h;
    }

    b i() {
        return this.f19444u;
    }

    public String j() {
        return this.f19426c;
    }

    long k() {
        return this.f19429f;
    }

    float l() {
        return this.f19439p;
    }

    float m() {
        return this.f19438o;
    }

    public String n() {
        return this.f19430g;
    }

    List o() {
        return this.f19424a;
    }

    int p() {
        return this.f19435l;
    }

    int q() {
        return this.f19434k;
    }

    int r() {
        return this.f19433j;
    }

    float s() {
        return this.f19437n / this.f19425b.e();
    }

    j t() {
        return this.f19440q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f19441r;
    }

    Y3.b v() {
        return this.f19442s;
    }

    float w() {
        return this.f19436m;
    }

    n x() {
        return this.f19432i;
    }

    public boolean y() {
        return this.f19445v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e eVarT = this.f19425b.t(k());
        if (eVarT != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarT.j());
            e eVarT2 = this.f19425b.t(eVarT.k());
            while (eVarT2 != null) {
                sb2.append("->");
                sb2.append(eVarT2.j());
                eVarT2 = this.f19425b.t(eVarT2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f19424a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object obj : this.f19424a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(obj);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
