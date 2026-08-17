package p352ta;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f54594a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f54594a) {
            try {
                if (this.f54594a.containsKey(obj)) {
                    return this.f54594a.get(obj);
                }
                Object objA = a(obj);
                this.f54594a.put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
