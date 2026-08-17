package p069de;

import Re.S;
import java.util.Collections;
import java.util.List;
import p015ae.InterfaceC1799m;
import p015ae.c0;
import p015ae.h0;
import p015ae.u0;
import p033be.h;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X extends AbstractC3240n implements u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected S f40048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(InterfaceC1799m interfaceC1799m, h hVar, f fVar, S s10, h0 h0Var) {
        super(interfaceC1799m, hVar, fVar, h0Var);
        if (interfaceC1799m == null) {
            F(0);
        }
        if (hVar == null) {
            F(1);
        }
        if (fVar == null) {
            F(2);
        }
        if (h0Var == null) {
            F(3);
        }
        this.f40048e = s10;
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
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void G0(S s10) {
        this.f40048e = s10;
    }

    public c0 O() {
        return null;
    }

    public c0 R() {
        return null;
    }

    public S getReturnType() {
        S type = getType();
        if (type == null) {
            F(10);
        }
        return type;
    }

    @Override // p015ae.s0
    public S getType() {
        S s10 = this.f40048e;
        if (s10 == null) {
            F(4);
        }
        return s10;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(8);
        }
        return list;
    }

    @Override // p015ae.InterfaceC1787a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(6);
        }
        return list;
    }

    @Override // p015ae.InterfaceC1787a
    public boolean j0() {
        return false;
    }
}
