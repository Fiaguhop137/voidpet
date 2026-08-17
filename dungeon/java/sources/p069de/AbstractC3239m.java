package p069de;

import Ce.n;
import p015ae.InterfaceC1799m;
import p033be.b;
import p033be.h;
import p464ze.f;

/* JADX INFO: renamed from: de.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3239m extends b implements InterfaceC1799m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f40096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3239m(h hVar, f fVar) {
        super(hVar);
        if (hVar == null) {
            F(0);
        }
        if (fVar == null) {
            F(1);
        }
        this.f40096b = fVar;
    }

    private static /* synthetic */ void F(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String k0(InterfaceC1799m interfaceC1799m) {
        if (interfaceC1799m == null) {
            F(4);
        }
        try {
            String str = n.f1888k.M(interfaceC1799m) + "[" + interfaceC1799m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC1799m)) + "]";
            if (str == null) {
                F(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC1799m.getClass().getSimpleName() + " " + interfaceC1799m.getName();
            if (str2 == null) {
                F(6);
            }
            return str2;
        }
    }

    public InterfaceC1799m a() {
        return this;
    }

    @Override // p015ae.J
    public f getName() {
        f fVar = this.f40096b;
        if (fVar == null) {
            F(2);
        }
        return fVar;
    }

    public String toString() {
        return k0(this);
    }
}
