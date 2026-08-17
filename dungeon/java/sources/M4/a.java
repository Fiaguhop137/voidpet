package M4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f6801a = new C0123a();

    /* JADX INFO: renamed from: M4.a$a, reason: collision with other inner class name */
    class C0123a implements g {
        C0123a() {
        }

        @Override // M4.a.g
        public void a(Object obj) {
        }
    }

    class b implements d {
        b() {
        }

        @Override // M4.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // M4.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object create();
    }

    private static final class e implements p199l1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f6802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f6803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p199l1.e f6804c;

        e(p199l1.e eVar, d dVar, g gVar) {
            this.f6804c = eVar;
            this.f6802a = dVar;
            this.f6803b = gVar;
        }

        @Override // p199l1.e
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).h().b(true);
            }
            this.f6803b.a(obj);
            return this.f6804c.a(obj);
        }

        @Override // p199l1.e
        public Object acquire() {
            Object objAcquire = this.f6804c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f6802a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objAcquire.getClass());
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).h().b(false);
            }
            return objAcquire;
        }
    }

    public interface f {
        M4.c h();
    }

    public interface g {
        void a(Object obj);
    }

    private static p199l1.e a(p199l1.e eVar, d dVar) {
        return b(eVar, dVar, c());
    }

    private static p199l1.e b(p199l1.e eVar, d dVar, g gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static g c() {
        return f6801a;
    }

    public static p199l1.e d(int i10, d dVar) {
        return a(new p199l1.f(i10), dVar);
    }

    public static p199l1.e e() {
        return f(20);
    }

    public static p199l1.e f(int i10) {
        return b(new p199l1.f(i10), new b(), new c());
    }
}
