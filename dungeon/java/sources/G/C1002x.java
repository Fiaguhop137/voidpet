package G;

import kotlin.jvm.internal.Intrinsics;
import p359u.InterfaceC4210i;

/* JADX INFO: renamed from: G.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1002x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1002x f3708a = new C1002x();

    private C1002x() {
    }

    public final InterfaceC4210i a(p431y.h interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if ((interaction instanceof p431y.n) || (interaction instanceof p431y.b) || (interaction instanceof p431y.f) || (interaction instanceof p431y.d)) {
            return AbstractC1003y.f3709a;
        }
        return null;
    }

    public final InterfaceC4210i b(p431y.h interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (!(interaction instanceof p431y.n) && !(interaction instanceof p431y.b)) {
            if (interaction instanceof p431y.f) {
                return AbstractC1003y.f3711c;
            }
            if (interaction instanceof p431y.d) {
                return AbstractC1003y.f3710b;
            }
            return null;
        }
        return AbstractC1003y.f3710b;
    }
}
