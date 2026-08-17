package R3;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p323s.C4123x;
import p323s.g0;

/* JADX INFO: renamed from: R3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1364k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f10822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f10823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f10824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f10825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g0 f10826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4123x f10827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f10828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f10829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f10830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f10831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f10832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10833o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10836r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f10819a = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f10820b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10834p = 0;

    public void a(String str) {
        p077e4.g.c(str);
        this.f10820b.add(str);
    }

    public Rect b() {
        return this.f10829k;
    }

    public g0 c() {
        return this.f10826h;
    }

    public float d() {
        return (long) ((e() / this.f10832n) * 1000.0f);
    }

    public float e() {
        return this.f10831m - this.f10830l;
    }

    public float f() {
        return this.f10831m;
    }

    public Map g() {
        return this.f10824f;
    }

    public float h(float f10) {
        return p077e4.l.i(this.f10830l, this.f10831m, f10);
    }

    public float i() {
        return this.f10832n;
    }

    public Map j() {
        float fE = p077e4.r.e();
        if (fE != this.f10823e) {
            for (Map.Entry entry : this.f10822d.entrySet()) {
                this.f10822d.put((String) entry.getKey(), ((O) entry.getValue()).a(this.f10823e / fE));
            }
        }
        this.f10823e = fE;
        return this.f10822d;
    }

    public List k() {
        return this.f10828j;
    }

    public X3.h l(String str) {
        int size = this.f10825g.size();
        for (int i10 = 0; i10 < size; i10++) {
            X3.h hVar = (X3.h) this.f10825g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f10834p;
    }

    public X n() {
        return this.f10819a;
    }

    public List o(String str) {
        return (List) this.f10821c.get(str);
    }

    public float p() {
        return this.f10830l;
    }

    public boolean q() {
        return this.f10833o;
    }

    public void r(int i10) {
        this.f10834p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List list, C4123x c4123x, Map map, Map map2, float f13, g0 g0Var, Map map3, List list2, int i10, int i11) {
        this.f10829k = rect;
        this.f10830l = f10;
        this.f10831m = f11;
        this.f10832n = f12;
        this.f10828j = list;
        this.f10827i = c4123x;
        this.f10821c = map;
        this.f10822d = map2;
        this.f10823e = f13;
        this.f10826h = g0Var;
        this.f10824f = map3;
        this.f10825g = list2;
        this.f10835q = i10;
        this.f10836r = i11;
    }

    public p005a4.e t(long j10) {
        return (p005a4.e) this.f10827i.e(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f10828j.iterator();
        while (it.hasNext()) {
            sb2.append(((p005a4.e) it.next()).z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f10833o = z10;
    }

    public void v(boolean z10) {
        this.f10819a.b(z10);
    }
}
