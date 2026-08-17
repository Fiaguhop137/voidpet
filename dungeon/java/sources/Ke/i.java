package Ke;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qe.i f6222b;

    public i(Qe.n storageManager, Function0 getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.f6222b = storageManager.c(new h(getScope));
    }

    public /* synthetic */ i(Qe.n nVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Qe.f.f9575e : nVar, function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Function0 getScope) {
        this(null, getScope, 1, null);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k k(Function0 function0) {
        k kVar = (k) function0.invoke();
        return kVar instanceof a ? ((a) kVar).h() : kVar;
    }

    @Override // Ke.a
    protected k i() {
        return (k) this.f6222b.invoke();
    }
}
