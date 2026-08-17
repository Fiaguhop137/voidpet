package p069de;

import Le.g;
import p015ae.InterfaceC1799m;
import p033be.h;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public class N extends AbstractC3229c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1799m f40024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f40025d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1799m interfaceC1799m, g gVar, h hVar) {
        this(interfaceC1799m, gVar, hVar, p464ze.h.f58587i);
        if (interfaceC1799m == null) {
            F(0);
        }
        if (gVar == null) {
            F(1);
        }
        if (hVar == null) {
            F(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1799m interfaceC1799m, g gVar, h hVar, f fVar) {
        super(hVar, fVar);
        if (interfaceC1799m == null) {
            F(3);
        }
        if (gVar == null) {
            F(4);
        }
        if (hVar == null) {
            F(5);
        }
        if (fVar == null) {
            F(6);
        }
        this.f40024c = interfaceC1799m;
        this.f40025d = gVar;
    }

    private static /* synthetic */ void F(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p015ae.InterfaceC1799m
    public InterfaceC1799m b() {
        InterfaceC1799m interfaceC1799m = this.f40024c;
        if (interfaceC1799m == null) {
            F(8);
        }
        return interfaceC1799m;
    }

    @Override // p015ae.c0
    public g getValue() {
        g gVar = this.f40025d;
        if (gVar == null) {
            F(7);
        }
        return gVar;
    }
}
