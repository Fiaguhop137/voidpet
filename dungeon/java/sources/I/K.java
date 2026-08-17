package I;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1089y f4499b;

    public K(U.l lVar, boolean z10, AbstractC1089y abstractC1089y) {
        this.f4498a = z10;
        this.f4499b = abstractC1089y;
    }

    public /* synthetic */ K(U.l lVar, boolean z10, AbstractC1089y abstractC1089y, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? false : z10, abstractC1089y);
    }

    public final U.l a() {
        if (this.f4498a) {
            return null;
        }
        this.f4499b.k();
        Intrinsics.b(null, null);
        return null;
    }
}
