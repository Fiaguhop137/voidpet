package p069de;

import Le.i;
import Re.G0;
import Re.N0;
import Re.S;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p015ae.AbstractC1805t;
import p015ae.AbstractC1806u;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1801o;
import p015ae.W;
import p015ae.c0;
import p015ae.h0;
import p033be.h;
import p464ze.f;

/* JADX INFO: renamed from: de.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3229c extends AbstractC3239m implements c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3229c(h hVar) {
        super(hVar, p464ze.h.f58587i);
        if (hVar == null) {
            F(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3229c(h hVar, f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            F(1);
        }
        if (fVar == null) {
            F(2);
        }
    }

    private static /* synthetic */ void F(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p069de.AbstractC3239m, p015ae.InterfaceC1799m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public W a() {
        return this;
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o interfaceC1801o, Object obj) {
        return interfaceC1801o.g(this, obj);
    }

    @Override // p015ae.InterfaceC1787a
    public c0 O() {
        return null;
    }

    @Override // p015ae.InterfaceC1787a
    public c0 R() {
        return null;
    }

    @Override // p015ae.j0
    public c0 c(G0 g10) {
        if (g10 == null) {
            F(3);
        }
        if (!g10.k()) {
            S sP = b() instanceof InterfaceC1791e ? g10.p(getType(), N0.OUT_VARIANCE) : g10.p(getType(), N0.INVARIANT);
            if (sP == null) {
                return null;
            }
            if (sP != getType()) {
                return new N(b(), new i(sP), getAnnotations());
            }
        }
        return this;
    }

    @Override // p015ae.InterfaceC1787a
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            F(8);
        }
        return set;
    }

    @Override // p015ae.InterfaceC1787a
    public S getReturnType() {
        return getType();
    }

    @Override // p015ae.s0
    public S getType() {
        S type = getValue().getType();
        if (type == null) {
            F(6);
        }
        return type;
    }

    @Override // p015ae.InterfaceC1787a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(5);
        }
        return list;
    }

    @Override // p015ae.InterfaceC1803q
    public AbstractC1806u getVisibility() {
        AbstractC1806u abstractC1806u = AbstractC1805t.f19746f;
        if (abstractC1806u == null) {
            F(9);
        }
        return abstractC1806u;
    }

    @Override // p015ae.InterfaceC1787a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(7);
        }
        return list;
    }

    @Override // p015ae.InterfaceC1787a
    public boolean j0() {
        return false;
    }

    @Override // p015ae.InterfaceC1802p
    public h0 k() {
        h0 h0Var = h0.f19733a;
        if (h0Var == null) {
            F(11);
        }
        return h0Var;
    }
}
