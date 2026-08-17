package p324s0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p270p0.a;

/* JADX INFO: renamed from: s0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4147l {
    public static final View a(InterfaceC4144j interfaceC4144j) {
        if (!interfaceC4144j.k0().D1()) {
            a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = M.b(AbstractC4146k.l(interfaceC4144j));
        Intrinsics.d(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
