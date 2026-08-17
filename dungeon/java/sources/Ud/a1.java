package Ud;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 {

    public static class a extends b implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function0 f13569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile SoftReference f13570c;

        public a(Object obj, Function0 function0) {
            if (function0 == null) {
                f(0);
            }
            this.f13570c = null;
            this.f13569b = function0;
            if (obj != null) {
                this.f13570c = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // Ud.a1.b, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f13570c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return e(obj);
            }
            Object objInvoke = this.f13569b.invoke();
            this.f13570c = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f13571a = new a();

        static class a {
            a() {
            }
        }

        protected Object a(Object obj) {
            return obj == null ? f13571a : obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        protected Object e(Object obj) {
            if (obj == f13571a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(Object obj, Function0 function0) {
        if (function0 == null) {
            a(0);
        }
        return new a(obj, function0);
    }

    public static a c(Function0 function0) {
        if (function0 == null) {
            a(1);
        }
        return b(null, function0);
    }
}
