package Ud;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.AbstractC1806u;
import p015ae.InterfaceC1788b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A implements kotlin.reflect.c, X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1.a f13456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.a f13457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1.a f13458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.a f13459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a1.a f13460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f13461f;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(((kotlin.reflect.j) obj).getName(), ((kotlin.reflect.j) obj2).getName());
        }
    }

    public A() {
        a1.a aVarC = a1.c(new C1539q(this));
        Intrinsics.checkNotNullExpressionValue(aVarC, "lazySoft(...)");
        this.f13456a = aVarC;
        a1.a aVarC2 = a1.c(new r(this));
        Intrinsics.checkNotNullExpressionValue(aVarC2, "lazySoft(...)");
        this.f13457b = aVarC2;
        a1.a aVarC3 = a1.c(new C1542s(this));
        Intrinsics.checkNotNullExpressionValue(aVarC3, "lazySoft(...)");
        this.f13458c = aVarC3;
        a1.a aVarC4 = a1.c(new C1544t(this));
        Intrinsics.checkNotNullExpressionValue(aVarC4, "lazySoft(...)");
        this.f13459d = aVarC4;
        a1.a aVarC5 = a1.c(new C1546u(this));
        Intrinsics.checkNotNullExpressionValue(aVarC5, "lazySoft(...)");
        this.f13460e = aVarC5;
        this.f13461f = Ad.j.a(Ad.m.PUBLICATION, new C1548v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p015ae.W A(InterfaceC1788b interfaceC1788b, int i10) {
        Object obj = interfaceC1788b.i().get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (p015ae.W) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 B(A a10) {
        Re.S returnType = a10.b0().getReturnType();
        Intrinsics.c(returnType);
        return new U0(returnType, new C1556z(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type C(A a10) {
        Type typeR = a10.R();
        return typeR == null ? a10.T().getReturnType() : typeR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D(A a10) {
        List<p015ae.m0> typeParameters = a10.b0().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(typeParameters, 10));
        for (p015ae.m0 m0Var : typeParameters) {
            Intrinsics.c(m0Var);
            arrayList.add(new W0(a10, m0Var));
        }
        return arrayList;
    }

    private final Object O(Map map) throws Sd.a {
        Object objQ;
        List<kotlin.reflect.j> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(parameters, 10));
        for (kotlin.reflect.j jVar : parameters) {
            if (map.containsKey(jVar)) {
                objQ = map.get(jVar);
                if (objQ == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                }
            } else if (jVar.u()) {
                objQ = null;
            } else {
                if (!jVar.b()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
                }
                objQ = Q(jVar.getType());
            }
            arrayList.add(objQ);
        }
        Vd.h hVarV = V();
        if (hVarV != null) {
            try {
                return hVarV.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new Sd.a(e10);
            }
        }
        throw new Y0("This callable does not support a default call: " + b0());
    }

    private final Object Q(kotlin.reflect.o oVar) {
        Class clsB = Ld.a.b(Td.b.b(oVar));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type R() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objW0 = CollectionsKt.w0(T().a());
            ParameterizedType parameterizedType = objW0 instanceof ParameterizedType ? (ParameterizedType) objW0 : null;
            if (Intrinsics.b(parameterizedType != null ? parameterizedType.getRawType() : null, Ed.b.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                Object objV0 = AbstractC3952n.v0(actualTypeArguments);
                WildcardType wildcardType = objV0 instanceof WildcardType ? (WildcardType) objV0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC3952n.R(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] S() {
        return (Object[]) ((Object[]) this.f13460e.invoke()).clone();
    }

    private final int X(kotlin.reflect.j jVar) {
        if (!((Boolean) this.f13461f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!j1.k(jVar.getType())) {
            return 1;
        }
        kotlin.reflect.o type = jVar.getType();
        Intrinsics.d(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = Vd.o.n(Re.F0.a(((U0) type).A()));
        Intrinsics.c(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(A a10) {
        List parameters = a10.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (j1.k(((kotlin.reflect.j) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] v(A a10) {
        int iX;
        List<kotlin.reflect.j> parameters = a10.getParameters();
        int size = parameters.size() + (a10.isSuspend() ? 1 : 0);
        if (((Boolean) a10.f13461f.getValue()).booleanValue()) {
            iX = 0;
            for (kotlin.reflect.j jVar : parameters) {
                iX += jVar.j() == kotlin.reflect.j.a.VALUE ? a10.X(jVar) : 0;
            }
        } else if (parameters.isEmpty()) {
            iX = 0;
        } else {
            Iterator it = parameters.iterator();
            iX = 0;
            while (it.hasNext()) {
                if (((kotlin.reflect.j) it.next()).j() == kotlin.reflect.j.a.VALUE && (iX = iX + 1) < 0) {
                    CollectionsKt.u();
                }
            }
        }
        int i10 = (iX + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (kotlin.reflect.j jVar2 : parameters) {
            if (jVar2.u() && !j1.l(jVar2.getType())) {
                objArr[jVar2.getIndex()] = j1.g(Td.c.f(jVar2.getType()));
            } else if (jVar2.b()) {
                objArr[jVar2.getIndex()] = a10.Q(jVar2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(A a10) {
        return j1.e(a10.b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList x(A a10) {
        int i10;
        InterfaceC1788b interfaceC1788bW = a10.b0();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (a10.Z()) {
            i10 = 0;
        } else {
            p015ae.c0 c0VarI = j1.i(interfaceC1788bW);
            if (c0VarI != null) {
                arrayList.add(new C1555y0(a10, 0, kotlin.reflect.j.a.INSTANCE, new C1550w(c0VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            p015ae.c0 c0VarR = interfaceC1788bW.R();
            if (c0VarR != null) {
                arrayList.add(new C1555y0(a10, i10, kotlin.reflect.j.a.EXTENSION_RECEIVER, new C1552x(c0VarR)));
                i10++;
            }
        }
        int size = interfaceC1788bW.i().size();
        while (i11 < size) {
            arrayList.add(new C1555y0(a10, i10, kotlin.reflect.j.a.VALUE, new C1554y(interfaceC1788bW, i11)));
            i11++;
            i10++;
        }
        if (a10.Y() && (interfaceC1788bW instanceof p212le.a) && arrayList.size() > 1) {
            CollectionsKt.A(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p015ae.W y(p015ae.c0 c0Var) {
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p015ae.W z(p015ae.c0 c0Var) {
        return c0Var;
    }

    public final Object P(Map args, Ed.b bVar) throws Sd.a {
        Intrinsics.checkNotNullParameter(args, "args");
        List<kotlin.reflect.j> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return T().call(isSuspend() ? new Ed.b[]{bVar} : new Ed.b[0]);
            } catch (IllegalAccessException e10) {
                throw new Sd.a(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrS = S();
        if (isSuspend()) {
            objArrS[parameters.size()] = bVar;
        }
        boolean zBooleanValue = ((Boolean) this.f13461f.getValue()).booleanValue();
        int i10 = 0;
        for (kotlin.reflect.j jVar : parameters) {
            int iX = zBooleanValue ? X(jVar) : 1;
            if (args.containsKey(jVar)) {
                objArrS[jVar.getIndex()] = args.get(jVar);
            } else if (jVar.u()) {
                if (zBooleanValue) {
                    int i11 = i10 + iX;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrS[i13];
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrS[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrS[i14];
                    Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrS[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!jVar.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
            }
            if (jVar.j() == kotlin.reflect.j.a.VALUE) {
                i10 += iX;
            }
        }
        if (!z10) {
            try {
                Vd.h hVarT = T();
                Object[] objArrCopyOf = Arrays.copyOf(objArrS, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return hVarT.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new Sd.a(e11);
            }
        }
        Vd.h hVarV = V();
        if (hVarV != null) {
            try {
                return hVarV.call(objArrS);
            } catch (IllegalAccessException e12) {
                throw new Sd.a(e12);
            }
        }
        throw new Y0("This callable does not support a default call: " + b0());
    }

    public abstract Vd.h T();

    public abstract AbstractC1514d0 U();

    public abstract Vd.h V();

    /* JADX INFO: renamed from: W */
    public abstract InterfaceC1788b b0();

    protected final boolean Y() {
        return Intrinsics.b(getName(), "<init>") && U().c().isAnnotation();
    }

    public abstract boolean Z();

    @Override // kotlin.reflect.c
    public Object call(Object... args) throws Sd.a {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return T().call(args);
        } catch (IllegalAccessException e10) {
            throw new Sd.a(e10);
        }
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return Y() ? O(args) : P(args, null);
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        Object objInvoke = this.f13456a.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.c
    public List getParameters() {
        Object objInvoke = this.f13457b.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.o getReturnType() {
        Object objInvoke = this.f13458c.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (kotlin.reflect.o) objInvoke;
    }

    @Override // kotlin.reflect.c
    public List getTypeParameters() {
        Object objInvoke = this.f13459d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.r getVisibility() {
        AbstractC1806u visibility = b0().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    @Override // kotlin.reflect.c
    public boolean isAbstract() {
        return b0().s() == p015ae.E.ABSTRACT;
    }

    @Override // kotlin.reflect.c
    public boolean isFinal() {
        return b0().s() == p015ae.E.FINAL;
    }

    @Override // kotlin.reflect.c
    public boolean isOpen() {
        return b0().s() == p015ae.E.OPEN;
    }
}
