package N;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f7159a = t.f7150e.a().p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7161c;

    public final Object a() {
        P.a.a(f());
        return this.f7159a[this.f7161c];
    }

    public final t b() {
        P.a.a(g());
        Object obj = this.f7159a[this.f7161c];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] c() {
        return this.f7159a;
    }

    protected final int d() {
        return this.f7161c;
    }

    public final boolean f() {
        return this.f7161c < this.f7160b;
    }

    public final boolean g() {
        P.a.a(this.f7161c >= this.f7160b);
        return this.f7161c < this.f7159a.length;
    }

    public final void h() {
        P.a.a(f());
        this.f7161c += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void i() {
        P.a.a(g());
        this.f7161c++;
    }

    public final void k(Object[] objArr, int i10) {
        m(objArr, i10, 0);
    }

    public final void m(Object[] objArr, int i10, int i11) {
        this.f7159a = objArr;
        this.f7160b = i10;
        this.f7161c = i11;
    }

    protected final void n(int i10) {
        this.f7161c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
