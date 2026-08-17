package p269p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f50711e = new HashMap();

    @Override // p269p.b
    protected b.c c(Object obj) {
        return (b.c) this.f50711e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f50711e.containsKey(obj);
    }

    @Override // p269p.b
    public Object i(Object obj, Object obj2) {
        b.c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f50717b;
        }
        this.f50711e.put(obj, h(obj, obj2));
        return null;
    }

    @Override // p269p.b
    public Object j(Object obj) {
        Object objJ = super.j(obj);
        this.f50711e.remove(obj);
        return objJ;
    }

    public Map.Entry k(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f50711e.get(obj)).f50719d;
        }
        return null;
    }
}
