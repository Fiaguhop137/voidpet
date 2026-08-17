package N;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class c extends b implements Map.Entry, Nd.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f7123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f7124d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f7123c = iVar;
        this.f7124d = obj2;
    }

    public void a(Object obj) {
        this.f7124d = obj;
    }

    @Override // N.b, java.util.Map.Entry
    public Object getValue() {
        return this.f7124d;
    }

    @Override // N.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f7123c.b(getKey(), obj);
        return value;
    }
}
