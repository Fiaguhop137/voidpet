package Ud;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p123ge.AbstractC3442f;

/* JADX INFO: renamed from: Ud.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1533n {

    /* JADX INFO: renamed from: Ud.n$a */
    public static final class a extends AbstractC1533n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f13632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f13633b;

        /* JADX INFO: renamed from: Ud.n$a$a, reason: collision with other inner class name */
        public static final class C0189a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Cd.a.d(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) {
            super(null);
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            this.f13632a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            this.f13633b = AbstractC3952n.y0(declaredMethods, new C0189a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return AbstractC3442f.f(returnType);
        }

        @Override // Ud.AbstractC1533n
        public String a() {
            return CollectionsKt.s0(this.f13633b, "", "<init>(", ")V", 0, null, C1531m.f13629a, 24, null);
        }

        public final List d() {
            return this.f13633b;
        }
    }

    /* JADX INFO: renamed from: Ud.n$b */
    public static final class b extends AbstractC1533n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Constructor f13634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.f13634a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            Intrinsics.c(cls);
            return AbstractC3442f.f(cls);
        }

        @Override // Ud.AbstractC1533n
        public String a() {
            Class<?>[] parameterTypes = this.f13634a.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return AbstractC3952n.n0(parameterTypes, "", "<init>(", ")V", 0, null, C1535o.f13641a, 24, null);
        }

        public final Constructor d() {
            return this.f13634a;
        }
    }

    /* JADX INFO: renamed from: Ud.n$c */
    public static final class c extends AbstractC1533n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f13635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "method");
            this.f13635a = method;
        }

        @Override // Ud.AbstractC1533n
        public String a() {
            return h1.d(this.f13635a);
        }

        public final Method b() {
            return this.f13635a;
        }
    }

    /* JADX INFO: renamed from: Ud.n$d */
    public static final class d extends AbstractC1533n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ye.d.b f13636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ye.d.b signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f13636a = signature;
            this.f13637b = signature.a();
        }

        @Override // Ud.AbstractC1533n
        public String a() {
            return this.f13637b;
        }

        public final String b() {
            return this.f13636a.d();
        }
    }

    /* JADX INFO: renamed from: Ud.n$e */
    public static final class e extends AbstractC1533n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ye.d.b f13638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ye.d.b signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f13638a = signature;
            this.f13639b = signature.a();
        }

        @Override // Ud.AbstractC1533n
        public String a() {
            return this.f13639b;
        }

        public final String b() {
            return this.f13638a.d();
        }

        public final String c() {
            return this.f13638a.e();
        }
    }

    private AbstractC1533n() {
    }

    public /* synthetic */ AbstractC1533n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();
}
