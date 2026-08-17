package p069de;

import Fe.g;
import Qe.j;
import Re.S;
import kotlin.jvm.functions.Function0;
import p015ae.InterfaceC1799m;
import p015ae.h0;
import p033be.h;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y extends X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected j f40050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Function0 f40051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC1799m interfaceC1799m, h hVar, f fVar, S s10, boolean z10, h0 h0Var) {
        super(interfaceC1799m, hVar, fVar, s10, h0Var);
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
        this.f40049f = z10;
    }

    private static /* synthetic */ void F(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(j jVar, Function0 function0) {
        if (function0 == null) {
            F(5);
        }
        this.f40051h = function0;
        if (jVar == null) {
            jVar = (j) function0.invoke();
        }
        this.f40050g = jVar;
    }

    public void L0(Function0 function0) {
        if (function0 == null) {
            F(4);
        }
        K0(null, function0);
    }

    @Override // p015ae.u0
    public boolean Q() {
        return this.f40049f;
    }

    @Override // p015ae.u0
    public g q0() {
        j jVar = this.f40050g;
        if (jVar != null) {
            return (g) jVar.invoke();
        }
        return null;
    }
}
