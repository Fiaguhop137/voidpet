package O8;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: O8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1265n implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC1266o f8502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC1266o f8503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC1260i f8504c;

    AbstractC1265n() {
    }

    public static AbstractC1265n c(Object obj, Object obj2) {
        AbstractC1259h.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C1272v.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC1260i a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1260i values() {
        AbstractC1260i abstractC1260i = this.f8504c;
        if (abstractC1260i != null) {
            return abstractC1260i;
        }
        AbstractC1260i abstractC1260iA = a();
        this.f8504c = abstractC1260iA;
        return abstractC1260iA;
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

    abstract AbstractC1266o d();

    abstract AbstractC1266o e();

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
    public final AbstractC1266o entrySet() {
        AbstractC1266o abstractC1266o = this.f8502a;
        if (abstractC1266o != null) {
            return abstractC1266o;
        }
        AbstractC1266o abstractC1266oD = d();
        this.f8502a = abstractC1266oD;
        return abstractC1266oD;
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
        return AbstractC1273w.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1266o abstractC1266o = this.f8503b;
        if (abstractC1266o != null) {
            return abstractC1266o;
        }
        AbstractC1266o abstractC1266oE = e();
        this.f8503b = abstractC1266oE;
        return abstractC1266oE;
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
        AbstractC1259h.a(size, "size");
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
