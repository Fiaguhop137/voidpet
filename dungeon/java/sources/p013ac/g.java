package p013ac;

import kotlin.jvm.internal.Intrinsics;
import p088ef.O;
import p157ic.C3594b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f19647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String name, C3594b[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        this.f19647g = n.DEFAULT;
    }

    protected final l m() {
        return this.f19647g;
    }

    public final g n(n queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f19647g = queue;
        return this;
    }

    public final g o(O scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f19647g = new i(scope);
        return this;
    }
}
