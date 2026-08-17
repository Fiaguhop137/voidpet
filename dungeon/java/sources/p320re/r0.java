package p320re;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f52582a;

    public r0(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f52582a = map;
    }

    public final r0 a() {
        Map map = this.f52582a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(N.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C4083h.c((C4083h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new r0(linkedHashMap);
    }

    public final Map b() {
        return this.f52582a;
    }
}
