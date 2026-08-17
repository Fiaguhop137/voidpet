package p069de;

import He.e;
import Ke.k;
import Ke.t;
import Qe.i;
import Qe.n;
import Re.AbstractC1388d0;
import Re.E0;
import Re.G0;
import Re.J0;
import Re.V;
import Se.g;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1801o;
import p015ae.c0;
import p015ae.l0;
import p464ze.f;

/* JADX INFO: renamed from: de.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3227a extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f40052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final i f40053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f40054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f40055e;

    /* JADX INFO: renamed from: de.a$a, reason: collision with other inner class name */
    class C0444a implements Function0 {

        /* JADX INFO: renamed from: de.a$a$a, reason: collision with other inner class name */
        class C0445a implements Function1 {
            C0445a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC1388d0 invoke(g gVar) {
                InterfaceC1794h interfaceC1794hF = gVar.f(AbstractC3227a.this);
                if (interfaceC1794hF == null) {
                    return (AbstractC1388d0) AbstractC3227a.this.f40053c.invoke();
                }
                if (interfaceC1794hF instanceof l0) {
                    return V.c((l0) interfaceC1794hF, J0.g(interfaceC1794hF.l().getParameters()));
                }
                return interfaceC1794hF instanceof z ? J0.u(interfaceC1794hF.l().o(gVar), ((z) interfaceC1794hF).k0(gVar), this) : interfaceC1794hF.q();
            }
        }

        C0444a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1388d0 invoke() {
            AbstractC3227a abstractC3227a = AbstractC3227a.this;
            return J0.v(abstractC3227a, abstractC3227a.Z(), new C0445a());
        }
    }

    /* JADX INFO: renamed from: de.a$b */
    class b implements Function0 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k invoke() {
            return new Ke.g(AbstractC3227a.this.Z());
        }
    }

    /* JADX INFO: renamed from: de.a$c */
    class c implements Function0 {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 invoke() {
            return new C3245t(AbstractC3227a.this);
        }
    }

    public AbstractC3227a(n nVar, f fVar) {
        if (nVar == null) {
            E0(0);
        }
        if (fVar == null) {
            E0(1);
        }
        this.f40052b = fVar;
        this.f40053c = nVar.c(new C0444a());
        this.f40054d = nVar.c(new b());
        this.f40055e = nVar.c(new c());
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p069de.z
    public k F(E0 e10, g gVar) {
        if (e10 == null) {
            E0(10);
        }
        if (gVar == null) {
            E0(11);
        }
        if (!e10.f()) {
            return new t(k0(gVar), G0.g(e10));
        }
        k kVarK0 = k0(gVar);
        if (kVarK0 == null) {
            E0(12);
        }
        return kVarK0;
    }

    @Override // p015ae.j0
    /* JADX INFO: renamed from: G0 */
    public InterfaceC1791e c(G0 g10) {
        if (g10 == null) {
            E0(18);
        }
        return g10.k() ? this : new C3250y(this, g10);
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o interfaceC1801o, Object obj) {
        return interfaceC1801o.i(this, obj);
    }

    @Override // p015ae.InterfaceC1791e
    public c0 J0() {
        c0 c0Var = (c0) this.f40055e.invoke();
        if (c0Var == null) {
            E0(5);
        }
        return c0Var;
    }

    @Override // p015ae.InterfaceC1791e
    public k N(E0 e10) {
        if (e10 == null) {
            E0(15);
        }
        k kVarF = F(e10, e.r(De.i.g(this)));
        if (kVarF == null) {
            E0(16);
        }
        return kVarF;
    }

    @Override // p015ae.InterfaceC1791e
    public k W() {
        k kVar = (k) this.f40054d.invoke();
        if (kVar == null) {
            E0(4);
        }
        return kVar;
    }

    @Override // p015ae.InterfaceC1791e
    public k Z() {
        k kVarK0 = k0(e.r(De.i.g(this)));
        if (kVarK0 == null) {
            E0(17);
        }
        return kVarK0;
    }

    @Override // p015ae.InterfaceC1799m
    public InterfaceC1791e a() {
        return this;
    }

    @Override // p015ae.InterfaceC1791e
    public List b0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(6);
        }
        return list;
    }

    @Override // p015ae.J
    public f getName() {
        f fVar = this.f40052b;
        if (fVar == null) {
            E0(2);
        }
        return fVar;
    }

    @Override // p015ae.InterfaceC1791e, p015ae.InterfaceC1794h
    public AbstractC1388d0 q() {
        AbstractC1388d0 abstractC1388d0 = (AbstractC1388d0) this.f40053c.invoke();
        if (abstractC1388d0 == null) {
            E0(20);
        }
        return abstractC1388d0;
    }
}
