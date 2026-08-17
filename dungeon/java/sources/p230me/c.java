package p230me;

import Ad.j;
import Ad.m;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1793g;
import p015ae.InterfaceC1799m;
import p033be.h;
import p176je.E;
import p302qe.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    private static final k c(k kVar, InterfaceC1799m interfaceC1799m, z zVar, int i10, Lazy lazy) {
        return new k(kVar.a(), zVar != null ? new m(kVar, interfaceC1799m, zVar, i10) : kVar.f(), lazy);
    }

    public static final k d(k kVar, p typeParameterResolver) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new k(kVar.a(), typeParameterResolver, kVar.c());
    }

    public static final k e(k kVar, InterfaceC1793g containingDeclaration, z zVar, int i10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return c(kVar, containingDeclaration, zVar, i10, j.a(m.NONE, new a(kVar, containingDeclaration)));
    }

    public static /* synthetic */ k f(k kVar, InterfaceC1793g interfaceC1793g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, interfaceC1793g, zVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E g(k kVar, InterfaceC1793g interfaceC1793g) {
        return j(kVar, interfaceC1793g.getAnnotations());
    }

    public static final k h(k kVar, InterfaceC1799m containingDeclaration, z typeParameterOwner, int i10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return c(kVar, containingDeclaration, typeParameterOwner, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, InterfaceC1799m interfaceC1799m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, interfaceC1799m, zVar, i10);
    }

    public static final E j(k kVar, h additionalAnnotations) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), additionalAnnotations);
    }

    public static final k k(k kVar, h additionalAnnotations) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), j.a(m.NONE, new b(kVar, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E l(k kVar, h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d components) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new k(components, kVar.f(), kVar.c());
    }
}
