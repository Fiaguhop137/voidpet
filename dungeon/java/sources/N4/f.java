package N4;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.r f7415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f7416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f7417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.C1182b f7418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f7419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.C1182b f7420f;

    public f() {
        this.f7415a = null;
        this.f7416b = null;
        this.f7417c = null;
        this.f7418d = null;
        this.f7419e = null;
        this.f7420f = null;
    }

    public f(f fVar) {
        this.f7415a = null;
        this.f7416b = null;
        this.f7417c = null;
        this.f7418d = null;
        this.f7419e = null;
        this.f7420f = null;
        if (fVar == null) {
            return;
        }
        this.f7415a = fVar.f7415a;
        this.f7416b = fVar.f7416b;
        this.f7418d = fVar.f7418d;
        this.f7419e = fVar.f7419e;
        this.f7420f = fVar.f7420f;
    }

    public f a(String str) {
        this.f7415a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f7415a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.f7416b != null;
    }

    public boolean d() {
        return this.f7417c != null;
    }

    public boolean e() {
        return this.f7419e != null;
    }

    public boolean f() {
        return this.f7418d != null;
    }

    public boolean g() {
        return this.f7420f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f7420f = new g.C1182b(f10, f11, f12, f13);
        return this;
    }
}
