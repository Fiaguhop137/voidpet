package p155ia;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f43777c;

    class a implements p155ia.i {
        a() {
        }

        @Override // p155ia.i
        public Object a() {
            return new TreeSet();
        }
    }

    class b implements p155ia.i {
        b() {
        }

        @Override // p155ia.i
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: ia.c$c, reason: collision with other inner class name */
    class C0516c implements p155ia.i {
        C0516c() {
        }

        @Override // p155ia.i
        public Object a() {
            return new ArrayDeque();
        }
    }

    class d implements p155ia.i {
        d() {
        }

        @Override // p155ia.i
        public Object a() {
            return new ArrayList();
        }
    }

    class e implements p155ia.i {
        e() {
        }

        @Override // p155ia.i
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements p155ia.i {
        f() {
        }

        @Override // p155ia.i
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    class g implements p155ia.i {
        g() {
        }

        @Override // p155ia.i
        public Object a() {
            return new TreeMap();
        }
    }

    class h implements p155ia.i {
        h() {
        }

        @Override // p155ia.i
        public Object a() {
            return new LinkedHashMap();
        }
    }

    class i implements p155ia.i {
        i() {
        }

        @Override // p155ia.i
        public Object a() {
            return new p155ia.h();
        }
    }

    class j implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f43778a;

        j(Class cls) {
            this.f43778a = cls;
        }

        @Override // p155ia.i
        public Object a() {
            try {
                return p155ia.n.f43839a.d(this.f43778a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f43778a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    class k implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43780a;

        k(String str) {
            this.f43780a = str;
        }

        @Override // p155ia.i
        public Object a() {
            throw new p119ga.g(this.f43780a);
        }
    }

    class l implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43782a;

        l(String str) {
            this.f43782a = str;
        }

        @Override // p155ia.i
        public Object a() {
            throw new p119ga.g(this.f43782a);
        }
    }

    class m implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43784a;

        m(String str) {
            this.f43784a = str;
        }

        @Override // p155ia.i
        public Object a() {
            throw new p119ga.g(this.f43784a);
        }
    }

    class n implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f43786a;

        n(Type type) {
            this.f43786a = type;
        }

        @Override // p155ia.i
        public Object a() {
            Type type = this.f43786a;
            if (!(type instanceof ParameterizedType)) {
                throw new p119ga.g("Invalid EnumSet type: " + this.f43786a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new p119ga.g("Invalid EnumSet type: " + this.f43786a.toString());
        }
    }

    class o implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f43787a;

        o(Type type) {
            this.f43787a = type;
        }

        @Override // p155ia.i
        public Object a() {
            Type type = this.f43787a;
            if (!(type instanceof ParameterizedType)) {
                throw new p119ga.g("Invalid EnumMap type: " + this.f43787a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new p119ga.g("Invalid EnumMap type: " + this.f43787a.toString());
        }
    }

    class p implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43788a;

        p(String str) {
            this.f43788a = str;
        }

        @Override // p155ia.i
        public Object a() {
            throw new p119ga.g(this.f43788a);
        }
    }

    class q implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43789a;

        q(String str) {
            this.f43789a = str;
        }

        @Override // p155ia.i
        public Object a() {
            throw new p119ga.g(this.f43789a);
        }
    }

    class r implements p155ia.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f43790a;

        r(Constructor constructor) {
            this.f43790a = constructor;
        }

        @Override // p155ia.i
        public Object a() {
            try {
                return this.f43790a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw p208la.a.e(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + p208la.a.c(this.f43790a) + "' with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + p208la.a.c(this.f43790a) + "' with no args", e12.getCause());
            }
        }
    }

    public c(Map map, boolean z10, List list) {
        this.f43775a = map;
        this.f43776b = z10;
        this.f43777c = list;
    }

    static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    private static p155ia.i c(Class cls, p119ga.n nVar) {
        String strM;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            p119ga.n nVar2 = p119ga.n.ALLOW;
            if (nVar == nVar2 || (p155ia.l.a(declaredConstructor, null) && (nVar != p119ga.n.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (nVar != nVar2 || (strM = p208la.a.m(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strM);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static p155ia.i d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new b();
            }
            return Queue.class.isAssignableFrom(cls) ? new C0516c() : new d();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new e();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new f();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new g();
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(p244na.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
    }

    private static p155ia.i e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private p155ia.i f(Class cls) {
        if (this.f43776b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public p155ia.i b(p244na.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        android.support.v4.media.session.b.a(this.f43775a.get(typeD));
        android.support.v4.media.session.b.a(this.f43775a.get(clsC));
        p155ia.i iVarE = e(typeD, clsC);
        if (iVarE != null) {
            return iVarE;
        }
        p119ga.n nVarB = p155ia.l.b(this.f43777c, clsC);
        p155ia.i iVarC = c(clsC, nVarB);
        if (iVarC != null) {
            return iVarC;
        }
        p155ia.i iVarD = d(typeD, clsC);
        if (iVarD != null) {
            return iVarD;
        }
        String strA = a(clsC);
        if (strA != null) {
            return new l(strA);
        }
        if (nVarB == p119ga.n.ALLOW) {
            return f(clsC);
        }
        return new m("Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f43775a.toString();
    }
}
