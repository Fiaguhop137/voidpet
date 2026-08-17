package p069de;

import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1800n;
import p015ae.InterfaceC1802p;
import p015ae.h0;
import p033be.h;
import p464ze.f;

/* JADX INFO: renamed from: de.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3240n extends AbstractC3239m implements InterfaceC1800n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1799m f40097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f40098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC3240n(InterfaceC1799m interfaceC1799m, h hVar, f fVar, h0 h0Var) {
        super(hVar, fVar);
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
        this.f40097c = interfaceC1799m;
        this.f40098d = h0Var;
    }

    private static /* synthetic */ void F(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p069de.AbstractC3239m, p015ae.InterfaceC1799m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1802p a() {
        InterfaceC1802p interfaceC1802p = (InterfaceC1802p) super.a();
        if (interfaceC1802p == null) {
            F(4);
        }
        return interfaceC1802p;
    }

    public InterfaceC1799m b() {
        InterfaceC1799m interfaceC1799m = this.f40097c;
        if (interfaceC1799m == null) {
            F(5);
        }
        return interfaceC1799m;
    }

    public h0 k() {
        h0 h0Var = this.f40098d;
        if (h0Var == null) {
            F(6);
        }
        return h0Var;
    }
}
