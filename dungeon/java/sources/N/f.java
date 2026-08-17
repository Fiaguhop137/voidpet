package N;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3947i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC3947i implements L.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P.e f7134b = new P.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f7136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7138f;

    public f(d dVar) {
        this.f7133a = dVar;
        this.f7135c = this.f7133a.s();
        this.f7138f = this.f7133a.size();
    }

    @Override // kotlin.collections.AbstractC3947i
    public Set a() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractC3947i
    public Set b() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractC3947i
    public int c() {
        return this.f7138f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f7150e.a();
        Intrinsics.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f7135c = tVarA;
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f7135c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC3947i
    public Collection d() {
        return new l(this);
    }

    @Override // L.f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d build() {
        d dVar;
        if (this.f7135c == this.f7133a.s()) {
            dVar = this.f7133a;
        } else {
            this.f7134b = new P.e();
            dVar = new d(this.f7135c, size());
        }
        this.f7133a = dVar;
        return dVar;
    }

    public final int f() {
        return this.f7137e;
    }

    public final t g() {
        return this.f7135c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f7135c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final P.e h() {
        return this.f7134b;
    }

    public final void i(int i10) {
        this.f7137e = i10;
    }

    public final void k(Object obj) {
        this.f7136d = obj;
    }

    protected final void m(P.e eVar) {
        this.f7134b = eVar;
    }

    public void n(int i10) {
        this.f7138f = i10;
        this.f7137e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f7136d = null;
        this.f7135c = this.f7135c.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f7136d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        d dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        P.b bVar = new P.b(0, 1, null);
        int size = size();
        t tVar = this.f7135c;
        t tVarS = dVarBuild.s();
        Intrinsics.d(tVarS, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f7135c = tVar.E(tVarS, 0, bVar, this);
        int size2 = (dVarBuild.size() + size) - bVar.a();
        if (size != size2) {
            n(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f7136d = null;
        t tVarG = this.f7135c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = t.f7150e.a();
            Intrinsics.d(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f7135c = tVarG;
        return this.f7136d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f7135c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f7150e.a();
            Intrinsics.d(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f7135c = tVarH;
        return size != size();
    }
}
