package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;

/* JADX INFO: renamed from: Q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1337c {
    public static final Map a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    public static /* synthetic */ Map b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return a(i10, f10);
    }

    public static final List c(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.j0(list));
        }
        return CollectionsKt.l();
    }

    public static final Map d(Map map) {
        int size = map.size();
        if (size == 0) {
            return N.i();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.i0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
