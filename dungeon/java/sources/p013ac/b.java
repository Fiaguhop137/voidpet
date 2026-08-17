package p013ac;

import kotlin.jvm.internal.Intrinsics;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f19629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f19630c;

    public b(String name, a0 a0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f19628a = name;
        this.f19629b = a0Var;
    }

    public final g a() {
        g gVar = this.f19630c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final a0 b() {
        return this.f19629b;
    }

    public final String c() {
        return this.f19628a;
    }

    public final void d(g gVar) {
        this.f19630c = gVar;
    }
}
