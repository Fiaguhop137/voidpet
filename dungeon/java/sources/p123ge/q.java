package p123ge;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import p015ae.w0;
import p015ae.x0;
import p302qe.D;
import p302qe.InterfaceC4072a;
import p302qe.g;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends u implements j, A, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f42392a;

    /* synthetic */ class a extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42393a = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Boolean.valueOf(p10.isSynthetic());
        }
    }

    /* synthetic */ class b extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42394a = new b();

        b() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final t invoke(Constructor p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new t(p10);
        }
    }

    /* synthetic */ class c extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f42395a = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Boolean.valueOf(p10.isSynthetic());
        }
    }

    /* synthetic */ class d extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f42396a = new d();

        d() {
            super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final w invoke(Field p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new w(p10);
        }
    }

    /* synthetic */ class e extends AbstractC3975l implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f42397a = new e();

        e() {
            super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final z invoke(Method p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return new z(p10);
        }
    }

    public q(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f42392a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Class cls) {
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f R(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!f.s(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return f.p(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!qVar.w()) {
            return true;
        }
        Intrinsics.c(method);
        return !qVar.c0(method);
    }

    private final boolean c0(Method method) {
        String name = method.getName();
        if (Intrinsics.b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (Intrinsics.b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // p302qe.g
    public Sequence D() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrC = C3438b.f42364a.c(this.f42392a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class cls : clsArrC) {
                arrayList.add(new s(cls));
            }
            Sequence sequenceZ = CollectionsKt.Z(arrayList);
            if (sequenceZ != null) {
                return sequenceZ;
            }
        }
        return k.j();
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return false;
    }

    @Override // p302qe.g
    public boolean K() {
        return this.f42392a.isInterface();
    }

    @Override // p302qe.g
    public D L() {
        return null;
    }

    @Override // p302qe.g
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public List g() {
        Constructor<?>[] declaredConstructors = this.f42392a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return k.V(k.N(k.D(AbstractC3952n.J(declaredConstructors), a.f42393a), b.f42394a));
    }

    @Override // p123ge.j
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Class s() {
        return this.f42392a;
    }

    @Override // p302qe.g
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List y() {
        Field[] declaredFields = this.f42392a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return k.V(k.N(k.D(AbstractC3952n.J(declaredFields), c.f42395a), d.f42396a));
    }

    @Override // p302qe.g
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List B() {
        Class<?>[] declaredClasses = this.f42392a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return k.V(k.O(k.D(AbstractC3952n.J(declaredClasses), n.f42389a), o.f42390a));
    }

    @Override // p302qe.g
    public Collection a() {
        if (Intrinsics.b(this.f42392a, Object.class)) {
            return CollectionsKt.l();
        }
        I i10 = new I(2);
        Type genericSuperclass = this.f42392a.getGenericSuperclass();
        i10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        i10.b(this.f42392a.getGenericInterfaces());
        List listO = CollectionsKt.o(i10.d(new Type[i10.c()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p302qe.g
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List C() {
        Method[] declaredMethods = this.f42392a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return k.V(k.N(k.C(AbstractC3952n.J(declaredMethods), new p(this)), e.f42397a));
    }

    @Override // p302qe.g
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q l() {
        Class<?> declaringClass = this.f42392a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && Intrinsics.b(this.f42392a, ((q) obj).f42392a);
    }

    @Override // p302qe.g
    public p464ze.c f() {
        return AbstractC3442f.e(this.f42392a).a();
    }

    @Override // p302qe.InterfaceC4075d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p123ge.j, p302qe.InterfaceC4075d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? CollectionsKt.l() : listB;
    }

    @Override // p123ge.A
    public int getModifiers() {
        return this.f42392a.getModifiers();
    }

    @Override // p302qe.t
    public f getName() {
        if (!this.f42392a.isAnonymousClass()) {
            f fVarP = f.p(this.f42392a.getSimpleName());
            Intrinsics.c(fVarP);
            return fVarP;
        }
        String name = this.f42392a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f fVarP2 = f.p(StringsKt.W0(name, ".", null, 2, null));
        Intrinsics.c(fVarP2);
        return fVarP2;
    }

    @Override // p302qe.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f42392a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // p302qe.s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return w0.h.f19769c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return w0.e.f19766c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? p087ee.c.f40742c : p087ee.b.f40741c;
        }
        return p087ee.a.f40740c;
    }

    public int hashCode() {
        return this.f42392a.hashCode();
    }

    @Override // p302qe.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p302qe.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p302qe.s
    public boolean j() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // p302qe.g
    public Collection m() {
        Object[] objArrD = C3438b.f42364a.d(this.f42392a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new D(obj));
        }
        return arrayList;
    }

    @Override // p302qe.g
    public boolean o() {
        return this.f42392a.isAnnotation();
    }

    @Override // p302qe.g
    public boolean q() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = C3438b.f42364a.e(this.f42392a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // p302qe.g
    public boolean r() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f42392a;
    }

    @Override // p123ge.j, p302qe.InterfaceC4075d
    public C3443g u(p464ze.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }

    @Override // p302qe.InterfaceC4075d
    public /* bridge */ /* synthetic */ InterfaceC4072a u(p464ze.c cVar) {
        return u(cVar);
    }

    @Override // p302qe.g
    public boolean w() {
        return this.f42392a.isEnum();
    }

    @Override // p302qe.g
    public boolean z() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = C3438b.f42364a.f(this.f42392a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }
}
