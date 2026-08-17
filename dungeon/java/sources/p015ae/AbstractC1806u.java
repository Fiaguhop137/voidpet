package p015ae;

import Le.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ae.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1806u {
    protected AbstractC1806u() {
    }

    public final Integer a(AbstractC1806u visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract x0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(g gVar, InterfaceC1803q interfaceC1803q, InterfaceC1799m interfaceC1799m, boolean z10);

    public abstract AbstractC1806u f();

    public final String toString() {
        return b().toString();
    }
}
