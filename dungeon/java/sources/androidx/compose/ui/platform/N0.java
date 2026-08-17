package androidx.compose.ui.platform;

import I.X1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function0 f21926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I.A0 f21927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I.A0 f21928c = X1.d(Boolean.FALSE, null, 2, null);

    public void b(int i10) {
        k1.f22048a.a().setValue(p216m0.M.a(i10));
    }

    public final void c(Function0 function0) {
        if (this.f21927b == null) {
            this.f21926a = function0;
        }
    }

    public void d(boolean z10) {
        this.f21928c.setValue(Boolean.valueOf(z10));
    }
}
