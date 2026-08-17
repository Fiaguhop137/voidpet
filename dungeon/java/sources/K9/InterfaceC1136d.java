package K9;

import java.util.Set;

/* JADX INFO: renamed from: K9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1136d {
    default Object a(Class cls) {
        return e(D.b(cls));
    }

    default Set b(D d10) {
        return (Set) c(d10).get();
    }

    W9.b c(D d10);

    W9.b d(D d10);

    default Object e(D d10) {
        W9.b bVarD = d(d10);
        if (bVarD == null) {
            return null;
        }
        return bVarD.get();
    }

    default Set f(Class cls) {
        return b(D.b(cls));
    }

    default W9.b g(Class cls) {
        return d(D.b(cls));
    }
}
