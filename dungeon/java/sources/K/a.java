package K;

import java.util.NoSuchElementException;
import p323s.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(L l10) {
        if (l10.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int iD = l10.d() - 1;
        Object objC = l10.c(iD);
        l10.r(iD);
        return objC;
    }
}
