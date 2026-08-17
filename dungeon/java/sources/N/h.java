package N;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f7143a;

    public h(f fVar) {
        this.f7143a = fVar;
    }

    @Override // kotlin.collections.AbstractC3948j
    public int a() {
        return this.f7143a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f7143a.clear();
    }

    @Override // N.a
    public boolean e(Map.Entry entry) {
        Object obj = this.f7143a.get(entry.getKey());
        if (obj != null) {
            return Intrinsics.b(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f7143a.containsKey(entry.getKey());
    }

    @Override // N.a
    public boolean h(Map.Entry entry) {
        return this.f7143a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f7143a);
    }
}
