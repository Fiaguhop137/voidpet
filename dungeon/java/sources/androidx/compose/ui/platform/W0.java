package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {
    private static final boolean a(p019b0.i iVar) {
        return Float.intBitsToFloat((int) (iVar.h() >> 32)) + Float.intBitsToFloat((int) (iVar.i() >> 32)) <= iVar.j() && Float.intBitsToFloat((int) (iVar.b() >> 32)) + Float.intBitsToFloat((int) (iVar.c() >> 32)) <= iVar.j() && Float.intBitsToFloat((int) (iVar.h() & 4294967295L)) + Float.intBitsToFloat((int) (iVar.b() & 4294967295L)) <= iVar.d() && Float.intBitsToFloat((int) (iVar.i() & 4294967295L)) + Float.intBitsToFloat((int) (iVar.c() & 4294967295L)) <= iVar.d();
    }

    public static final boolean b(p037c0.k0 k0Var, float f10, float f11, p037c0.o0 o0Var, p037c0.o0 o0Var2) {
        if (k0Var instanceof c0.k0.b) {
            return e(((c0.k0.b) k0Var).b(), f10, f11);
        }
        if (k0Var instanceof c0.k0.c) {
            return f((c0.k0.c) k0Var, f10, f11, o0Var, o0Var2);
        }
        if (k0Var instanceof c0.k0.a) {
            return d(((c0.k0.a) k0Var).b(), f10, f11, o0Var, o0Var2);
        }
        throw new Ad.n();
    }

    public static /* synthetic */ boolean c(p037c0.k0 k0Var, float f10, float f11, p037c0.o0 o0Var, p037c0.o0 o0Var2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            o0Var = null;
        }
        if ((i10 & 16) != 0) {
            o0Var2 = null;
        }
        return b(k0Var, f10, f11, o0Var, o0Var2);
    }

    private static final boolean d(p037c0.o0 o0Var, float f10, float f11, p037c0.o0 o0Var2, p037c0.o0 o0Var3) {
        p019b0.g gVar = new p019b0.g(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (o0Var2 == null) {
            o0Var2 = p037c0.M.a();
        }
        p037c0.o0.b(o0Var2, gVar, null, 2, null);
        if (o0Var3 == null) {
            o0Var3 = p037c0.M.a();
        }
        o0Var3.g(o0Var, o0Var2, p037c0.q0.f26733a.b());
        boolean zIsEmpty = o0Var3.isEmpty();
        o0Var3.reset();
        o0Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(p019b0.g gVar, float f10, float f11) {
        return gVar.e() <= f10 && f10 < gVar.f() && gVar.h() <= f11 && f11 < gVar.c();
    }

    private static final boolean f(c0.k0.c cVar, float f10, float f11, p037c0.o0 o0Var, p037c0.o0 o0Var2) {
        p019b0.i iVarB = cVar.b();
        if (f10 < iVarB.e() || f10 >= iVarB.f() || f11 < iVarB.g() || f11 >= iVarB.a()) {
            return false;
        }
        if (!a(iVarB)) {
            p037c0.o0 o0VarA = o0Var2 == null ? p037c0.M.a() : o0Var2;
            p037c0.o0.c(o0VarA, iVarB, null, 2, null);
            return d(o0VarA, f10, f11, o0Var, o0Var2);
        }
        float fE = iVarB.e() + Float.intBitsToFloat((int) (iVarB.h() >> 32));
        float fG = iVarB.g() + Float.intBitsToFloat((int) (iVarB.h() & 4294967295L));
        float f12 = iVarB.f() - Float.intBitsToFloat((int) (iVarB.i() >> 32));
        float fG2 = iVarB.g() + Float.intBitsToFloat((int) (iVarB.i() & 4294967295L));
        float f13 = iVarB.f() - Float.intBitsToFloat((int) (iVarB.c() >> 32));
        float fA = iVarB.a() - Float.intBitsToFloat((int) (iVarB.c() & 4294967295L));
        float fA2 = iVarB.a() - Float.intBitsToFloat((int) (4294967295L & iVarB.b()));
        float fE2 = iVarB.e() + Float.intBitsToFloat((int) (iVarB.b() >> 32));
        if (f10 < fE && f11 < fG) {
            return g(f10, f11, iVarB.h(), fE, fG);
        }
        if (f10 < fE2 && f11 > fA2) {
            return g(f10, f11, iVarB.b(), fE2, fA2);
        }
        if (f10 > f12 && f11 < fG2) {
            return g(f10, f11, iVarB.i(), f12, fG2);
        }
        if (f10 <= f13 || f11 <= fA) {
            return true;
        }
        return g(f10, f11, iVarB.c(), f13, fA);
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
