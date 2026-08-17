package I;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z0 extends D {
    public Z0(Function0 function0) {
        super(function0, null);
    }

    private final i2 f(C1020a1 c1020a1) {
        if (!c1020a1.i()) {
            if (c1020a1.c() != null) {
                return new P(c1020a1.c());
            }
            return c1020a1.f() != null ? new C1019a0(c1020a1.f()) : new f2(c1020a1.d());
        }
        A0 a0F = c1020a1.f();
        if (a0F == null) {
            Object objG = c1020a1.g();
            S1 s1E = c1020a1.e();
            if (s1E == null) {
                s1E = T1.m();
            }
            a0F = T1.f(objG, s1E);
        }
        return new C1019a0(a0F);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 I.i2) = (r5v5 I.i2), (r5v6 I.i2) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // I.D
    public i2 b(C1020a1 c1020a1, i2 i2Var) {
        P p10;
        i2 i2Var2;
        f2 f2Var;
        C1019a0 c1019a0;
        i2 i2Var3 = null;
        i2Var3 = null;
        i2Var3 = null;
        i2Var3 = null;
        i2Var3 = null;
        if (i2Var instanceof C1019a0) {
            if (c1020a1.i()) {
                c1019a0 = (C1019a0) i2Var;
                c1019a0.b().setValue(c1020a1.d());
            }
        } else if (i2Var instanceof f2) {
            if (c1020a1.j()) {
                f2Var = (f2) i2Var;
                if (Intrinsics.b(c1020a1.d(), f2Var.b())) {
                    i2Var2 = p10;
                    i2Var2 = f2Var;
                    i2Var3 = i2Var2;
                }
            }
        } else if (i2Var instanceof P) {
            p10 = (P) i2Var;
            if (c1020a1.c() == p10.b()) {
                i2Var2 = p10;
                i2Var2 = f2Var;
                i2Var3 = i2Var2;
            }
        }
        if (i2Var3 == null) {
            i2Var3 = c1019a0;
            return f(c1020a1);
        }
        i2Var3 = c1019a0;
        return i2Var3;
    }

    public abstract C1020a1 c(Object obj);

    public final C1020a1 d(Object obj) {
        return c(obj);
    }

    public final C1020a1 e(Object obj) {
        return c(obj).h();
    }
}
