package Ne;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ne.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1243q implements InterfaceC1236j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p015ae.O f8209a;

    public C1243q(p015ae.O packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f8209a = packageFragmentProvider;
    }

    @Override // Ne.InterfaceC1236j
    public C1235i a(p464ze.b classId) {
        C1235i c1235iA;
        Intrinsics.checkNotNullParameter(classId, "classId");
        for (p015ae.N n10 : p015ae.T.c(this.f8209a, classId.f())) {
            if ((n10 instanceof r) && (c1235iA = ((r) n10).G0().a(classId)) != null) {
                return c1235iA;
            }
        }
        return null;
    }
}
