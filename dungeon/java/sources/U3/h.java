package U3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f13057c;

    public h(List list) {
        this.f13057c = list;
        this.f13055a = new ArrayList(list.size());
        this.f13056b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f13055a.add(((Z3.i) list.get(i10)).b().k());
            this.f13056b.add(((Z3.i) list.get(i10)).c().k());
        }
    }

    public List a() {
        return this.f13055a;
    }

    public List b() {
        return this.f13057c;
    }

    public List c() {
        return this.f13056b;
    }
}
