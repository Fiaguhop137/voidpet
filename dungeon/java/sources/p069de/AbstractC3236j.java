package p069de;

import Qe.n;
import p015ae.InterfaceC1799m;
import p015ae.h0;
import p464ze.f;

/* JADX INFO: renamed from: de.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3236j extends AbstractC3227a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1799m f40085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0 f40086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC3236j(n nVar, InterfaceC1799m interfaceC1799m, f fVar, h0 h0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            E0(0);
        }
        if (interfaceC1799m == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (h0Var == null) {
            E0(3);
        }
        this.f40085f = interfaceC1799m;
        this.f40086g = h0Var;
        this.f40087h = z10;
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p015ae.InterfaceC1791e, p015ae.InterfaceC1800n, p015ae.InterfaceC1799m
    public InterfaceC1799m b() {
        InterfaceC1799m interfaceC1799m = this.f40085f;
        if (interfaceC1799m == null) {
            E0(4);
        }
        return interfaceC1799m;
    }

    public boolean isExternal() {
        return this.f40087h;
    }

    @Override // p015ae.InterfaceC1802p
    public h0 k() {
        h0 h0Var = this.f40086g;
        if (h0Var == null) {
            E0(5);
        }
        return h0Var;
    }
}
