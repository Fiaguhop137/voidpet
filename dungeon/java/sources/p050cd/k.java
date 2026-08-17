package p050cd;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27443b = new k(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27444a;

    private k(Map map) {
        this.f27444a = Collections.unmodifiableMap(b(map));
    }

    private static g a(String str, Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof Integer) {
            return f.e(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return f.e(((Long) obj).longValue());
        }
        if (obj instanceof String) {
            return o.f((String) obj);
        }
        if (obj instanceof Boolean) {
            return a.e(((Boolean) obj).booleanValue());
        }
        if (obj instanceof byte[]) {
            return b.e((byte[]) obj);
        }
        if (obj instanceof BigDecimal) {
            return c.f((BigDecimal) obj);
        }
        throw new IllegalArgumentException("Can't map value for parameter '" + str + "': " + obj.getClass());
    }

    private static Map b(Map map) {
        Objects.requireNonNull(map, "Map must not be null");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String strA = r.a((String) entry.getKey());
            g gVarA = a(strA, entry.getValue());
            if (!gVarA.b().isEmpty()) {
                throw new IllegalArgumentException("Parameter value for '" + strA + "' must be bare item (no parameters)");
            }
            linkedHashMap.put((String) entry.getKey(), gVarA);
        }
        return linkedHashMap;
    }

    public static k r(Map map) {
        return new k(map);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g compute(String str, BiFunction biFunction) {
        return (g) this.f27444a.compute(str, biFunction);
    }

    @Override // java.util.Map
    public void clear() {
        this.f27444a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f27444a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f27444a.containsValue(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g computeIfAbsent(String str, Function function) {
        return (g) this.f27444a.computeIfAbsent(str, function);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g computeIfPresent(String str, BiFunction biFunction) {
        return (g) this.f27444a.computeIfPresent(str, biFunction);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f27444a.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f27444a.equals(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g get(Object obj) {
        return (g) this.f27444a.get(obj);
    }

    @Override // java.util.Map
    public void forEach(BiConsumer biConsumer) {
        this.f27444a.forEach(biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g getOrDefault(Object obj, g gVar) {
        return (g) this.f27444a.getOrDefault(obj, gVar);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g merge(String str, g gVar, BiFunction biFunction) {
        return (g) this.f27444a.merge(str, gVar, biFunction);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f27444a.hashCode();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g put(String str, g gVar) {
        return (g) this.f27444a.put(str, gVar);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f27444a.isEmpty();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public g putIfAbsent(String str, g gVar) {
        return (g) this.f27444a.putIfAbsent(str, gVar);
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f27444a.keySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g remove(Object obj) {
        return (g) this.f27444a.remove(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g replace(String str, g gVar) {
        return (g) this.f27444a.replace(str, gVar);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean replace(String str, g gVar, g gVar2) {
        return this.f27444a.replace(str, gVar, gVar2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f27444a.putAll(map);
    }

    public StringBuilder q(StringBuilder sb2) {
        for (Map.Entry entry : this.f27444a.entrySet()) {
            sb2.append(';');
            sb2.append((String) entry.getKey());
            if (!((g) entry.getValue()).get().equals(Boolean.TRUE)) {
                sb2.append('=');
                ((g) entry.getValue()).c(sb2);
            }
        }
        return sb2;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f27444a.remove(obj, obj2);
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        this.f27444a.replaceAll(biFunction);
    }

    @Override // java.util.Map
    public int size() {
        return this.f27444a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f27444a.values();
    }
}
