package Y7;

import L7.e;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f16951a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f16952b;

    static {
        HashMap map = new HashMap();
        f16952b = map;
        map.put(e.DEFAULT, 0);
        f16952b.put(e.VERY_LOW, 1);
        f16952b.put(e.HIGHEST, 2);
        for (e eVar : f16952b.keySet()) {
            f16951a.append(((Integer) f16952b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f16952b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = (e) f16951a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
