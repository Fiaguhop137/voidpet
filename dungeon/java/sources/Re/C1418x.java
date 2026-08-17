package Re;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1799m;

/* JADX INFO: renamed from: Re.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1418x implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1418x f11189a = new C1418x();

    private C1418x() {
    }

    @Override // Re.q0
    public r0 a(p033be.h annotations, v0 v0Var, InterfaceC1799m interfaceC1799m) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations.isEmpty() ? r0.f11157b.k() : r0.f11157b.j(CollectionsKt.e(new C1413s(annotations)));
    }
}
