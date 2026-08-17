package D0;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class O implements e0 {
    @Override // D0.e0
    public StaticLayout a(f0 f0Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(f0Var.r(), f0Var.q(), f0Var.e(), f0Var.o(), f0Var.u());
        builderObtain.setTextDirection(f0Var.s());
        builderObtain.setAlignment(f0Var.a());
        builderObtain.setMaxLines(f0Var.n());
        builderObtain.setEllipsize(f0Var.c());
        builderObtain.setEllipsizedWidth(f0Var.d());
        builderObtain.setLineSpacing(f0Var.l(), f0Var.m());
        builderObtain.setIncludePad(f0Var.g());
        builderObtain.setBreakStrategy(f0Var.b());
        builderObtain.setHyphenationFrequency(f0Var.f());
        builderObtain.setIndents(f0Var.i(), f0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Q.a(builderObtain, f0Var.h());
        }
        if (i10 >= 28) {
            T.a(builderObtain, f0Var.t());
        }
        if (i10 >= 33) {
            a0.b(builderObtain, f0Var.j(), f0Var.k());
        }
        if (i10 >= 35) {
            c0.a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // D0.e0
    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return a0.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
