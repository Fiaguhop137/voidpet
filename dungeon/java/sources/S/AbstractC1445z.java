package S;

import java.util.Set;
import kotlin.jvm.internal.AbstractC3970g;

/* JADX INFO: renamed from: S.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1445z implements Set, Nd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f11422a;

    public AbstractC1445z(H h10) {
        this.f11422a = h10;
    }

    public final H a() {
        return this.f11422a;
    }

    public int c() {
        return this.f11422a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11422a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f11422a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC3970g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC3970g.b(this, objArr);
    }
}
