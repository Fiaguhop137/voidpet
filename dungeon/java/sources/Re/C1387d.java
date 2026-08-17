package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1387d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1387d f11105a = new C1387d();

    private C1387d() {
    }

    private final boolean a(Ve.r rVar, Ve.j jVar, Ve.j jVar2) {
        if (rVar.Z(jVar) != rVar.Z(jVar2) || rVar.w0(jVar) != rVar.w0(jVar2) || rVar.v(jVar) != rVar.v(jVar2) || !rVar.k0(rVar.c(jVar), rVar.c(jVar2))) {
            return false;
        }
        if (rVar.j(jVar, jVar2)) {
            return true;
        }
        int iZ = rVar.Z(jVar);
        for (int i10 = 0; i10 < iZ; i10++) {
            Ve.m mVarY = rVar.Y(jVar, i10);
            Ve.m mVarY2 = rVar.Y(jVar2, i10);
            if (rVar.f(mVarY) != rVar.f(mVarY2)) {
                return false;
            }
            if (!rVar.f(mVarY)) {
                if (rVar.T(mVarY) != rVar.T(mVarY2)) {
                    return false;
                }
                Ve.i iVarL = rVar.L(mVarY);
                Intrinsics.c(iVarL);
                Ve.i iVarL2 = rVar.L(mVarY2);
                Intrinsics.c(iVarL2);
                if (!c(rVar, iVarL, iVarL2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean c(Ve.r rVar, Ve.i iVar, Ve.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        Ve.j jVarE = rVar.e(iVar);
        Ve.j jVarE2 = rVar.e(iVar2);
        if (jVarE != null && jVarE2 != null) {
            return a(rVar, jVarE, jVarE2);
        }
        Ve.g gVarJ0 = rVar.J0(iVar);
        Ve.g gVarJ1 = rVar.J0(iVar2);
        return gVarJ0 != null && gVarJ1 != null && a(rVar, rVar.h(gVarJ0), rVar.h(gVarJ1)) && a(rVar, rVar.g(gVarJ0), rVar.g(gVarJ1));
    }

    public final boolean b(Ve.r context, Ve.i a10, Ve.i b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return c(context, a10, b10);
    }
}
