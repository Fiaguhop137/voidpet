package U3;

import R3.AbstractC1358e;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f13032c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p095f4.c f13034e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f13030a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13031b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f13033d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f13035f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f13036g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f13037h = -1.0f;

    public interface b {
        void b();
    }

    private static final class c implements d {
        private c() {
        }

        /* synthetic */ c(C0185a c0185a) {
            this();
        }

        @Override // U3.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // U3.a.d
        public p095f4.a b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // U3.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // U3.a.d
        public float d() {
            return 0.0f;
        }

        @Override // U3.a.d
        public float e() {
            return 1.0f;
        }

        @Override // U3.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d {
        boolean a(float f10);

        p095f4.a b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    private static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f13038a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p095f4.a f13040c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f13041d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p095f4.a f13039b = f(0.0f);

        e(List list) {
            this.f13038a = list;
        }

        private p095f4.a f(float f10) {
            List list = this.f13038a;
            p095f4.a aVar = (p095f4.a) list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f13038a.size() - 2; size >= 1; size--) {
                p095f4.a aVar2 = (p095f4.a) this.f13038a.get(size);
                if (this.f13039b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (p095f4.a) this.f13038a.get(0);
        }

        @Override // U3.a.d
        public boolean a(float f10) {
            p095f4.a aVar = this.f13040c;
            p095f4.a aVar2 = this.f13039b;
            if (aVar == aVar2 && this.f13041d == f10) {
                return true;
            }
            this.f13040c = aVar2;
            this.f13041d = f10;
            return false;
        }

        @Override // U3.a.d
        public p095f4.a b() {
            return this.f13039b;
        }

        @Override // U3.a.d
        public boolean c(float f10) {
            if (this.f13039b.a(f10)) {
                return !this.f13039b.i();
            }
            this.f13039b = f(f10);
            return true;
        }

        @Override // U3.a.d
        public float d() {
            return ((p095f4.a) this.f13038a.get(0)).f();
        }

        @Override // U3.a.d
        public float e() {
            List list = this.f13038a;
            return ((p095f4.a) list.get(list.size() - 1)).c();
        }

        @Override // U3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p095f4.a f13042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f13043b = -1.0f;

        f(List list) {
            this.f13042a = (p095f4.a) list.get(0);
        }

        @Override // U3.a.d
        public boolean a(float f10) {
            if (this.f13043b == f10) {
                return true;
            }
            this.f13043b = f10;
            return false;
        }

        @Override // U3.a.d
        public p095f4.a b() {
            return this.f13042a;
        }

        @Override // U3.a.d
        public boolean c(float f10) {
            return !this.f13042a.i();
        }

        @Override // U3.a.d
        public float d() {
            return this.f13042a.f();
        }

        @Override // U3.a.d
        public float e() {
            return this.f13042a.c();
        }

        @Override // U3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List list) {
        this.f13032c = q(list);
    }

    private float g() {
        if (this.f13036g == -1.0f) {
            this.f13036g = this.f13032c.d();
        }
        return this.f13036g;
    }

    private static d q(List list) {
        if (list.isEmpty()) {
            return new c(null);
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f13030a.add(bVar);
    }

    protected p095f4.a b() {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        p095f4.a aVarB = this.f13032c.b();
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    float c() {
        if (this.f13037h == -1.0f) {
            this.f13037h = this.f13032c.e();
        }
        return this.f13037h;
    }

    protected float d() {
        Interpolator interpolator;
        p095f4.a aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f41715d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f13031b) {
            return 0.0f;
        }
        p095f4.a aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f13033d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f13033d;
    }

    public Object h() {
        float fE = e();
        if (this.f13034e == null && this.f13032c.a(fE) && !p()) {
            return this.f13035f;
        }
        p095f4.a aVarB = b();
        Interpolator interpolator = aVarB.f41716e;
        Object objI = (interpolator == null || aVarB.f41717f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f41717f.getInterpolation(fE));
        this.f13035f = objI;
        return objI;
    }

    abstract Object i(p095f4.a aVar, float f10);

    protected Object j(p095f4.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f13034e != null;
    }

    public void l() {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f13030a.size(); i10++) {
            ((b) this.f13030a.get(i10)).b();
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f13031b = true;
    }

    public void n(float f10) {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f13032c.isEmpty()) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f13033d) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f13033d = f10;
            if (this.f13032c.c(f10)) {
                l();
            }
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(p095f4.c cVar) {
        p095f4.c cVar2 = this.f13034e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13034e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    protected boolean p() {
        return false;
    }
}
