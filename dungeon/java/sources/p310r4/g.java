package p310r4;

import com.bumptech.glide.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p274p4.d;
import p274p4.f;
import p274p4.h;
import p274p4.k;
import p274p4.l;
import p328s4.b;
import p346t4.a;
import p382v4.n;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f52187a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52188b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f52189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f52190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class f52193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f52194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f52195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f52196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class f52197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f52198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f52199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f52200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f52201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f52202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f52203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f52204r;

    g() {
    }

    void a() {
        this.f52189c = null;
        this.f52190d = null;
        this.f52200n = null;
        this.f52193g = null;
        this.f52197k = null;
        this.f52195i = null;
        this.f52201o = null;
        this.f52196j = null;
        this.f52202p = null;
        this.f52187a.clear();
        this.f52198l = false;
        this.f52188b.clear();
        this.f52199m = false;
    }

    b b() {
        return this.f52189c.a();
    }

    List c() {
        if (!this.f52199m) {
            this.f52199m = true;
            this.f52188b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) listG.get(i10);
                if (!this.f52188b.contains(aVar.f56230a)) {
                    this.f52188b.add(aVar.f56230a);
                }
                for (int i11 = 0; i11 < aVar.f56231b.size(); i11++) {
                    if (!this.f52188b.contains(aVar.f56231b.get(i11))) {
                        this.f52188b.add(aVar.f56231b.get(i11));
                    }
                }
            }
        }
        return this.f52188b;
    }

    a d() {
        return this.f52194h.a();
    }

    j e() {
        return this.f52202p;
    }

    int f() {
        return this.f52192f;
    }

    List g() {
        if (!this.f52198l) {
            this.f52198l = true;
            this.f52187a.clear();
            List listI = this.f52189c.h().i(this.f52190d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVarA = ((n) listI.get(i10)).a(this.f52190d, this.f52191e, this.f52192f, this.f52195i);
                if (aVarA != null) {
                    this.f52187a.add(aVarA);
                }
            }
        }
        return this.f52187a;
    }

    t h(Class cls) {
        return this.f52189c.h().h(cls, this.f52193g, this.f52197k);
    }

    Class i() {
        return this.f52190d.getClass();
    }

    List j(File file) {
        return this.f52189c.h().i(file);
    }

    h k() {
        return this.f52195i;
    }

    com.bumptech.glide.h l() {
        return this.f52201o;
    }

    List m() {
        return this.f52189c.h().j(this.f52190d.getClass(), this.f52193g, this.f52197k);
    }

    k n(v vVar) {
        return this.f52189c.h().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f52189c.h().l(obj);
    }

    f p() {
        return this.f52200n;
    }

    d q(Object obj) {
        return this.f52189c.h().m(obj);
    }

    Class r() {
        return this.f52197k;
    }

    l s(Class cls) {
        l lVar = (l) this.f52196j.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f52196j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f52196j.isEmpty() || !this.f52203q) {
            return p418x4.h.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f52191e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(e eVar, Object obj, f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.h hVar, h hVar2, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f52189c = eVar;
        this.f52190d = obj;
        this.f52200n = fVar;
        this.f52191e = i10;
        this.f52192f = i11;
        this.f52202p = jVar;
        this.f52193g = cls;
        this.f52194h = eVar2;
        this.f52197k = cls2;
        this.f52201o = hVar;
        this.f52195i = hVar2;
        this.f52196j = map;
        this.f52203q = z10;
        this.f52204r = z11;
    }

    boolean w(v vVar) {
        return this.f52189c.h().n(vVar);
    }

    boolean x() {
        return this.f52204r;
    }

    boolean y(f fVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) listG.get(i10)).f56230a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
