package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3152s extends r {

    /* JADX INFO: renamed from: com.google.protobuf.s$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38021a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f38021a = iArr;
            try {
                iArr[C0.b.f37693c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38021a[C0.b.f37694d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38021a[C0.b.f37695e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38021a[C0.b.f37696f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38021a[C0.b.f37697g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38021a[C0.b.f37698h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38021a[C0.b.f37699i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38021a[C0.b.f37700j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38021a[C0.b.f37705o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38021a[C0.b.f37707q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38021a[C0.b.f37708r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38021a[C0.b.f37709s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38021a[C0.b.f37710t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38021a[C0.b.f37706p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38021a[C0.b.f37704n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38021a[C0.b.f37701k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38021a[C0.b.f37702l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f38021a[C0.b.f37703m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C3152s() {
    }

    @Override // com.google.protobuf.r
    int a(Map.Entry entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.r
    Object b(C3151q c3151q, T t10, int i10) {
        return c3151q.a(t10, i10);
    }

    @Override // com.google.protobuf.r
    C3155v c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.r
    C3155v d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.r
    boolean e(T t10) {
        return t10 instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.r
    void f(Object obj) {
        c(obj).x();
    }

    @Override // com.google.protobuf.r
    Object g(Object obj, m0 m0Var, Object obj2, C3151q c3151q, C3155v c3155v, Object obj3, v0 v0Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj2;
        int iF = eVar.f();
        if (eVar.f37805d.f() && eVar.f37805d.k()) {
            switch (a.f38021a[eVar.d().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    m0Var.F(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    m0Var.B(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    m0Var.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    m0Var.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    m0Var.v(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    m0Var.p(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    m0Var.w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    m0Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    m0Var.s(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    m0Var.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    m0Var.u(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    m0Var.q(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    m0Var.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    m0Var.i(arrayList);
                    obj3 = p0.z(obj, iF, arrayList, eVar.f37805d.g(), obj3, v0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f37805d.j());
            }
            c3155v.C(eVar.f37805d, arrayList);
            return obj3;
        }
        if (eVar.d() != C0.b.f37706p) {
            switch (a.f38021a[eVar.d().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(m0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(m0Var.G());
                    break;
                case 4:
                    objValueOf = Long.valueOf(m0Var.r());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(m0Var.o());
                    break;
                case 6:
                    objValueOf = Long.valueOf(m0Var.a());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(m0Var.t());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(m0Var.d());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(m0Var.g());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(m0Var.D());
                    break;
                case 11:
                    objValueOf = Long.valueOf(m0Var.e());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(m0Var.k());
                    break;
                case 13:
                    objValueOf = Long.valueOf(m0Var.x());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = m0Var.n();
                    break;
                case 16:
                    objValueOf = m0Var.y();
                    break;
                case 17:
                    if (!eVar.g()) {
                        Object objI2 = c3155v.i(eVar.f37805d);
                        if (objI2 instanceof GeneratedMessageLite) {
                            n0 n0VarD = j0.a().d(objI2);
                            if (!((GeneratedMessageLite) objI2).isMutable()) {
                                Object objB = n0VarD.b();
                                n0VarD.a(objB, objI2);
                                c3155v.C(eVar.f37805d, objB);
                                objI2 = objB;
                            }
                            m0Var.N(objI2, n0VarD, c3151q);
                            return obj3;
                        }
                    }
                    objValueOf = m0Var.K(eVar.e().getClass(), c3151q);
                    break;
                case 18:
                    if (!eVar.g()) {
                        Object objI3 = c3155v.i(eVar.f37805d);
                        if (objI3 instanceof GeneratedMessageLite) {
                            n0 n0VarD2 = j0.a().d(objI3);
                            if (!((GeneratedMessageLite) objI3).isMutable()) {
                                Object objB2 = n0VarD2.b();
                                n0VarD2.a(objB2, objI3);
                                c3155v.C(eVar.f37805d, objB2);
                                objI3 = objB2;
                            }
                            m0Var.O(objI3, n0VarD2, c3151q);
                            return obj3;
                        }
                    }
                    objValueOf = m0Var.M(eVar.e().getClass(), c3151q);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iO = m0Var.o();
            if (eVar.f37805d.g().a(iO) == null) {
                return p0.J(obj, iF, iO, obj3, v0Var);
            }
            objValueOf = Integer.valueOf(iO);
        }
        if (eVar.g()) {
            c3155v.a(eVar.f37805d, objValueOf);
            return obj3;
        }
        int i10 = a.f38021a[eVar.d().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = c3155v.i(eVar.f37805d)) != null) {
            objValueOf = A.h(objI, objValueOf);
        }
        c3155v.C(eVar.f37805d, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.r
    void h(m0 m0Var, Object obj, C3151q c3151q, C3155v c3155v) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        c3155v.C(eVar.f37805d, m0Var.M(eVar.e().getClass(), c3151q));
    }

    @Override // com.google.protobuf.r
    void i(AbstractC3142h abstractC3142h, Object obj, C3151q c3151q, C3155v c3155v) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        T.a aVarNewBuilderForType = eVar.e().newBuilderForType();
        AbstractC3143i abstractC3143iS = abstractC3142h.s();
        aVarNewBuilderForType.h0(abstractC3143iS, c3151q);
        c3155v.C(eVar.f37805d, aVarNewBuilderForType.G());
        abstractC3143iS.a(0);
    }

    @Override // com.google.protobuf.r
    void j(D0 d10, Map.Entry entry) {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f38021a[dVar.j().ordinal()]) {
                case 1:
                    d10.p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    d10.B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    d10.u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    d10.f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    d10.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    d10.s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    d10.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    d10.v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    d10.o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    d10.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    d10.i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    d10.H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    d10.m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    d10.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    d10.L(dVar.getNumber(), (AbstractC3142h) entry.getValue());
                    break;
                case 16:
                    d10.e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    d10.K(dVar.getNumber(), entry.getValue(), j0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    d10.N(dVar.getNumber(), entry.getValue(), j0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f38021a[dVar.j().ordinal()]) {
            case 1:
                p0.O(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 2:
                p0.S(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 3:
                p0.V(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 4:
                p0.d0(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 5:
                p0.U(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 6:
                p0.R(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 7:
                p0.Q(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 8:
                p0.M(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 9:
                p0.c0(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 10:
                p0.X(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 11:
                p0.Y(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 12:
                p0.Z(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 13:
                p0.a0(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 14:
                p0.U(dVar.getNumber(), (List) entry.getValue(), d10, dVar.k());
                break;
            case 15:
                p0.N(dVar.getNumber(), (List) entry.getValue(), d10);
                break;
            case 16:
                p0.b0(dVar.getNumber(), (List) entry.getValue(), d10);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    p0.T(dVar.getNumber(), (List) entry.getValue(), d10, j0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    p0.W(dVar.getNumber(), (List) entry.getValue(), d10, j0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
