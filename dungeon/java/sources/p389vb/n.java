package p389vb;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p339sf.t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static final t a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.a((String) pair.c(), (String) pair.d());
        }
        return aVar.e();
    }
}
