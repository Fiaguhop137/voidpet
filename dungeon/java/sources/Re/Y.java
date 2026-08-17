package Re;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qe.n f11099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f11100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qe.i f11101d;

    public Y(Qe.n storageManager, Function0 computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f11099b = storageManager;
        this.f11100c = computation;
        this.f11101d = storageManager.c(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S V0(Se.g gVar, Y y10) {
        return gVar.a((Ve.i) y10.f11100c.invoke());
    }

    @Override // Re.O0
    protected S R0() {
        return (S) this.f11101d.invoke();
    }

    @Override // Re.O0
    public boolean S0() {
        return this.f11101d.o();
    }

    @Override // Re.S
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Y X0(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new Y(this.f11099b, new X(kotlinTypeRefiner, this));
    }
}
