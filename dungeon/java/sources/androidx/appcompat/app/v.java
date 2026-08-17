package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class v {
    private static p128h1.i a(p128h1.i iVar, p128h1.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.g() + iVar2.g()) {
            Locale localeC = i10 < iVar.g() ? iVar.c(i10) : iVar2.c(i10 - iVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return p128h1.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static p128h1.i b(p128h1.i iVar, p128h1.i iVar2) {
        return (iVar == null || iVar.f()) ? p128h1.i.e() : a(iVar, iVar2);
    }
}
