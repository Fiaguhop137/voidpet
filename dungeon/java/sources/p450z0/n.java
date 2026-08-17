package p450z0;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import p323s.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final SemanticsConfiguration a(m mVar) {
        SemanticsConfiguration semanticsConfigurationB = mVar.b();
        if (semanticsConfigurationB != null && semanticsConfigurationB.t() && !semanticsConfigurationB.s()) {
            semanticsConfigurationB = semanticsConfigurationB.h();
            L l10 = new L(mVar.k().size());
            l10.l(mVar.k());
            while (l10.g()) {
                m mVar2 = (m) l10.r(l10.f52646b - 1);
                SemanticsConfiguration semanticsConfigurationB2 = mVar2.b();
                if (semanticsConfigurationB2 != null && !semanticsConfigurationB2.t()) {
                    semanticsConfigurationB.v(semanticsConfigurationB2);
                    if (!semanticsConfigurationB2.s()) {
                        l10.l(mVar2.k());
                    }
                }
            }
        }
        return semanticsConfigurationB;
    }
}
