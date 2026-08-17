package V0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f13854d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f13856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13857g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f13851a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13852b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13853c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f13855e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f13858h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f13859i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13860j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f13861k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List f13862l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f13854d = mVar;
    }

    @Override // V0.d
    public void a(d dVar) {
        Iterator it = this.f13862l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f13860j) {
                return;
            }
        }
        this.f13853c = true;
        d dVar2 = this.f13851a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f13852b) {
            this.f13854d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f13862l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f13860j) {
            g gVar = this.f13859i;
            if (gVar != null) {
                if (!gVar.f13860j) {
                    return;
                } else {
                    this.f13856f = this.f13858h * gVar.f13857g;
                }
            }
            d(fVar.f13857g + this.f13856f);
        }
        d dVar3 = this.f13851a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f13861k.add(dVar);
        if (this.f13860j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f13862l.clear();
        this.f13861k.clear();
        this.f13860j = false;
        this.f13857g = 0;
        this.f13853c = false;
        this.f13852b = false;
    }

    public void d(int i10) {
        if (this.f13860j) {
            return;
        }
        this.f13860j = true;
        this.f13857g = i10;
        for (d dVar : this.f13861k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13854d.f13887b.r());
        sb2.append(":");
        sb2.append(this.f13855e);
        sb2.append("(");
        sb2.append(this.f13860j ? Integer.valueOf(this.f13857g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f13862l.size());
        sb2.append(":d=");
        sb2.append(this.f13861k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
