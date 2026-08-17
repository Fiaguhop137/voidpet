package p170j8;

import android.os.Bundle;
import com.google.android.gms.common.C2333b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(AbstractC3839d abstractC3839d, int i10, Bundle bundle) {
        super(abstractC3839d, i10, bundle);
        Objects.requireNonNull(abstractC3839d);
        this.f46999g = abstractC3839d;
    }

    @Override // p170j8.Y
    protected final boolean e() {
        this.f46999g.f46923p.a(C2333b.f31870f);
        return true;
    }

    @Override // p170j8.Y
    protected final void f(C2333b c2333b) {
        AbstractC3839d abstractC3839d = this.f46999g;
        if (abstractC3839d.t() && abstractC3839d.Z()) {
            abstractC3839d.Y(16);
        } else {
            abstractC3839d.f46923p.a(c2333b);
            abstractC3839d.L(c2333b);
        }
    }
}
