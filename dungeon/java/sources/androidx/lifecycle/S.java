package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24316b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O1.a.c f24317c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O1.d f24318a;

    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0301a f24319f = new C0301a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f24320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final O1.a.c f24321h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f24322e;

        /* JADX INFO: renamed from: androidx.lifecycle.S$a$a, reason: collision with other inner class name */
        public static final class C0301a {
            private C0301a() {
            }

            public /* synthetic */ C0301a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f24320g == null) {
                    a.f24320g = new a(application);
                }
                a aVar = a.f24320g;
                Intrinsics.c(aVar);
                return aVar;
            }
        }

        public static final class b implements O1.a.c {
        }

        static {
            O1.a.C0141a c0141a = O1.a.f8309b;
            f24321h = new b();
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        private a(Application application, int i10) {
            this.f24322e = application;
        }

        private final Q h(Class cls, Application application) {
            if (!AbstractC1978a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                Q q10 = (Q) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.c(q10);
                return q10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.S.d, androidx.lifecycle.S.c
        public Q a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f24322e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.S.d, androidx.lifecycle.S.c
        public Q c(Class modelClass, O1.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f24322e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f24321h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC1978a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ S b(b bVar, U u10, c cVar, O1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = P1.f.f8586a.b(u10);
            }
            if ((i10 & 4) != 0) {
                aVar = P1.f.f8586a.a(u10);
            }
            return bVar.a(u10, cVar, aVar);
        }

        public final S a(U owner, c factory, O1.a extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new S(owner.g(), factory, extras);
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24323a = a.f24324a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f24324a = new a();

            private a() {
            }
        }

        default Q a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return P1.f.f8586a.d();
        }

        default Q b(kotlin.reflect.d modelClass, O1.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(Ld.a.b(modelClass), extras);
        }

        default Q c(Class modelClass, O1.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f24326c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24325b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final O1.a.c f24327d = S.f24317c;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f24326c == null) {
                    d.f24326c = new d();
                }
                d dVar = d.f24326c;
                Intrinsics.c(dVar);
                return dVar;
            }
        }

        @Override // androidx.lifecycle.S.c
        public Q a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return P1.c.f8581a.a(modelClass);
        }

        @Override // androidx.lifecycle.S.c
        public Q b(kotlin.reflect.d modelClass, O1.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return c(Ld.a.b(modelClass), extras);
        }

        @Override // androidx.lifecycle.S.c
        public Q c(Class modelClass, O1.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    public static class e {
        public abstract void d(Q q10);
    }

    public static final class f implements O1.a.c {
    }

    static {
        O1.a.C0141a c0141a = O1.a.f8309b;
        f24317c = new f();
    }

    private S(O1.d dVar) {
        this.f24318a = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(T store, c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(T store, c factory, O1.a defaultCreationExtras) {
        this(new O1.d(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    public /* synthetic */ S(T t10, c cVar, O1.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t10, cVar, (i10 & 4) != 0 ? O1.a.b.f8311c : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S(U owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        T tG = owner.g();
        P1.f fVar = P1.f.f8586a;
        this(tG, fVar.b(owner), fVar.a(owner));
    }

    public Q a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return c(Ld.a.e(modelClass));
    }

    public final Q b(String key, kotlin.reflect.d modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return this.f24318a.d(modelClass, key);
    }

    public final Q c(kotlin.reflect.d modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return O1.d.e(this.f24318a, modelClass, null, 2, null);
    }
}
