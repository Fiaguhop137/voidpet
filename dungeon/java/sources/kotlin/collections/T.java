package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class T extends S {
    public static Sequence w(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return CollectionsKt___CollectionsKt.Z(map.entrySet());
    }

    public static List x(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return C3959v.l();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C3959v.l();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C3958u.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
