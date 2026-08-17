package p380v2;

import F9.f;
import F9.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: v2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4245h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f56090a = new LinkedHashMap();

    public void a(C4244g c4244g) {
        long[] jArr = c4244g.f56088e;
        if (jArr.length <= 0 || this.f56090a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f56090a.put(Long.valueOf(c4244g.f56088e[0]), c4244g);
    }

    public C4244g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C4244g c4244g : this.f56090a.values()) {
            arrayList.add(c4244g.f56085b);
            arrayList2.add(c4244g.f56086c);
            arrayList3.add(c4244g.f56087d);
            arrayList4.add(c4244g.f56088e);
        }
        return new C4244g(f.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), h.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), h.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), h.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f56090a.size();
    }
}
