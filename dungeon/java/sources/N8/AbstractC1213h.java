package N8;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: N8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1213h implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC1214i f8017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC1214i f8018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC1207b f8019c;

    AbstractC1213h() {
    }

    public static AbstractC1213h c(Object obj, Object obj2) {
        T.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C1221p.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC1207b a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1207b values() {
        AbstractC1207b abstractC1207b = this.f8019c;
        if (abstractC1207b != null) {
            return abstractC1207b;
        }
        AbstractC1207b abstractC1207bA = a();
        this.f8019c = abstractC1207bA;
        return abstractC1207bA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC1214i d();

    abstract AbstractC1214i e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC1214i entrySet() {
        AbstractC1214i abstractC1214i = this.f8017a;
        if (abstractC1214i != null) {
            return abstractC1214i;
        }
        AbstractC1214i abstractC1214iD = d();
        this.f8017a = abstractC1214iD;
        return abstractC1214iD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1222q.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1214i abstractC1214i = this.f8018b;
        if (abstractC1214i != null) {
            return abstractC1214i;
        }
        AbstractC1214i abstractC1214iE = e();
        this.f8018b = abstractC1214iE;
        return abstractC1214iE;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
