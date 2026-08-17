package C0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: C0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0843p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C0819d.c cVar = (C0819d.c) list.get(i12);
            if (AbstractC0823f.f(i10, i11, cVar.h(), cVar.f())) {
                if (!(i10 <= cVar.h() && cVar.f() <= i11)) {
                    H0.a.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new C0819d.c(cVar.g(), cVar.h() - i10, cVar.f() - i10));
            }
        }
        return arrayList;
    }
}
