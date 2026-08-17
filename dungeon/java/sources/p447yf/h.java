package p447yf;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p339sf.G;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f58136a = new LinkedHashSet();

    public final synchronized void a(G route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f58136a.remove(route);
    }

    public final synchronized void b(G failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f58136a.add(failedRoute);
    }

    public final synchronized boolean c(G route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f58136a.contains(route);
    }
}
