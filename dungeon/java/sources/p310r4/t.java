package p310r4;

import L4.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p199l1.e;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f52355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f52356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f52357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f52358d;

    public t(Class cls, Class cls2, Class cls3, List list, e eVar) {
        this.f52355a = cls;
        this.f52356b = eVar;
        this.f52357c = (List) k.c(list);
        this.f52358d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, h hVar, int i10, int i11, i.a aVar, List list) throws q {
        int size = this.f52357c.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = ((i) this.f52357c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f52358d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, h hVar, int i10, int i11, i.a aVar) {
        List list = (List) k.d(this.f52356b.acquire());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f52356b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f52357c.toArray()) + '}';
    }
}
