package Ie;

import Ke.k;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p230me.j;
import p248ne.D;
import p302qe.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f5416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p194ke.j f5417b;

    public c(j packageFragmentProvider, p194ke.j javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.f5416a = packageFragmentProvider;
        this.f5417b = javaResolverCache;
    }

    public final j a() {
        return this.f5416a;
    }

    public final InterfaceC1791e b(g javaClass) {
        D d10;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        p464ze.c cVarF = javaClass.f();
        if (cVarF != null && javaClass.L() == p302qe.D.SOURCE) {
            return this.f5417b.b(cVarF);
        }
        g gVarL = javaClass.l();
        if (gVarL == null) {
            if (cVarF == null || (d10 = (D) CollectionsKt.firstOrNull(this.f5416a.c(cVarF.d()))) == null) {
                return null;
            }
            return d10.N0(javaClass);
        }
        InterfaceC1791e interfaceC1791eB = b(gVarL);
        k kVarW = interfaceC1791eB != null ? interfaceC1791eB.W() : null;
        InterfaceC1794h interfaceC1794hF = kVarW != null ? kVarW.f(javaClass.getName(), p159ie.d.FROM_JAVA_LOADER) : null;
        if (interfaceC1794hF instanceof InterfaceC1791e) {
            return (InterfaceC1791e) interfaceC1794hF;
        }
        return null;
    }
}
