package C9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: C9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0872o extends AbstractC0873p implements Map {
    protected AbstractC0872o() {
    }

    /* JADX INFO: renamed from: b */
    protected abstract Map a();

    protected boolean c(Object obj) {
        return B.b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        a().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    protected boolean d(Object obj) {
        return B.c(this, obj);
    }

    protected int e() {
        return Q.d(entrySet());
    }

    @Override // java.util.Map
    public Set entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return a().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return a().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return a().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return a().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return a().values();
    }
}
