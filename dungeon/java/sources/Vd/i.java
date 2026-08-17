package Vd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Vd.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f14285e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Member f14286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f14287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f14288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f14289d;

    public static final class a extends i implements Vd.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f14290f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC3952n.s(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f14290f = obj;
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            I i10 = new I(3);
            i10.a(this.f14290f);
            i10.b(args);
            i10.a(null);
            return constructor.newInstance(i10.d(new Object[i10.c()]));
        }
    }

    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC3952n.s(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            I i10 = new I(2);
            i10.b(args);
            i10.a(null);
            return constructor.newInstance(i10.d(new Object[i10.c()]));
        }
    }

    public static final class c extends i implements Vd.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f14291f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f14291f = obj;
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            I i10 = new I(2);
            i10.a(this.f14291f);
            i10.b(args);
            return constructor.newInstance(i10.d(new Object[i10.c()]));
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class e extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            return ((Constructor) b()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    public static abstract class f extends i {

        public static final class a extends f implements Vd.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Object f14292f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f14292f = obj;
            }

            @Override // Vd.i.f, Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                return ((Field) b()).get(this.f14292f);
            }
        }

        public static final class b extends f implements Vd.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Vd.i
            public void d(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.d(args);
                e(AbstractC3952n.S(args));
            }
        }

        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            return ((Field) b()).get(f() != null ? AbstractC3952n.R(args) : null);
        }
    }

    public static abstract class g extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f14293f;

        public static final class a extends g implements Vd.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f14294g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f14294g = obj;
            }

            @Override // Vd.i.g, Vd.h
            public Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                ((Field) b()).set(this.f14294g, AbstractC3952n.R(args));
                return Unit.f48228a;
            }
        }

        public static final class b extends g implements Vd.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Vd.i.g, Vd.h
            public Object call(Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                ((Field) b()).set(null, AbstractC3952n.o0(args));
                return Unit.f48228a;
            }
        }

        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // Vd.i.g, Vd.i
            public void d(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.d(args);
                e(AbstractC3952n.S(args));
            }
        }

        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            super(field, TYPE, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f14293f = z10;
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        @Override // Vd.h
        public Object call(Object[] args) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(args, "args");
            d(args);
            ((Field) b()).set(f() != null ? AbstractC3952n.R(args) : null, AbstractC3952n.o0(args));
            return Unit.f48228a;
        }

        @Override // Vd.i
        public void d(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            super.d(args);
            if (this.f14293f && AbstractC3952n.o0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    public static abstract class h extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f14295f;

        public static final class a extends h implements Vd.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f14296g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.f14296g = obj;
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                return g(this.f14296g, args);
            }
        }

        public static final class b extends h implements Vd.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                return g(null, args);
            }
        }

        public static final class c extends h implements Vd.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f14297g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Object f14298h;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z10, Object obj) {
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC3952n.s(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f14297g = z10;
                this.f14298h = obj;
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                I i10 = new I(2);
                i10.a(this.f14298h);
                i10.b(args);
                return g(null, i10.d(new Object[i10.c()]));
            }

            public final Object h() {
                return this.f14298h;
            }

            public final boolean i() {
                return this.f14297g;
            }
        }

        public static final class d extends h implements Vd.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object[] f14299g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] boundReceiverComponents) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) AbstractC3952n.N(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.f14299g = boundReceiverComponents;
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                I i10 = new I(2);
                i10.b(this.f14299g);
                i10.b(args);
                return g(null, i10.d(new Object[i10.c()]));
            }

            public final Object[] h() {
                return this.f14299g;
            }

            public final int i() {
                return this.f14299g.length;
            }
        }

        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                return g(args[0], args.length <= 1 ? new Object[0] : AbstractC3952n.s(args, 1, args.length));
            }
        }

        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                e(AbstractC3952n.S(args));
                return g(null, args.length <= 1 ? new Object[0] : AbstractC3952n.s(args, 1, args.length));
            }
        }

        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // Vd.h
            public Object call(Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                d(args);
                return g(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f14295f = Intrinsics.b(getReturnType(), Void.TYPE);
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        protected final Object g(Object obj, Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.f14295f ? Unit.f48228a : ((Method) b()).invoke(obj, Arrays.copyOf(args, args.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    private i(Member member, Type type, Class cls, Type[] typeArr) {
        List listJ0;
        this.f14286a = member;
        this.f14287b = type;
        this.f14288c = cls;
        if (cls != null) {
            I i10 = new I(2);
            i10.a(cls);
            i10.b(typeArr);
            listJ0 = CollectionsKt.o(i10.d(new Type[i10.c()]));
            listJ0 = listJ0 == null ? AbstractC3952n.J0(typeArr) : listJ0;
        }
        this.f14289d = listJ0;
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // Vd.h
    public List a() {
        return this.f14289d;
    }

    @Override // Vd.h
    public final Member b() {
        return this.f14286a;
    }

    @Override // Vd.h
    public boolean c() {
        return Vd.h.a.b(this);
    }

    public void d(Object[] objArr) {
        Vd.h.a.a(this, objArr);
    }

    protected final void e(Object obj) {
        if (obj == null || !this.f14286a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class f() {
        return this.f14288c;
    }

    @Override // Vd.h
    public final Type getReturnType() {
        return this.f14287b;
    }
}
