package p324s0;

import androidx.compose.ui.focus.g;
import p270p0.a;

/* JADX INFO: renamed from: s0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4134e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4134e f53140a = new C4134e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f53141b;

    private C4134e() {
    }

    @Override // androidx.compose.ui.focus.g
    public void g(boolean z10) {
        f53141b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.g
    public boolean i() {
        Boolean bool = f53141b;
        if (bool != null) {
            return bool.booleanValue();
        }
        a.c("canFocus is read before it is written");
        throw new Ad.g();
    }

    public final boolean o() {
        return f53141b != null;
    }

    public final void p() {
        f53141b = null;
    }
}
