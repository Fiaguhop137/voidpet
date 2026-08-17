package p446ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p428xe.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final List a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.e.c cVar = (a.e.c) it.next();
            int iZ = cVar.z();
            for (int i10 = 0; i10 < iZ; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
