package S;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class O implements ListIterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f11316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11318c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11319d;

    public O(F f10, int i10) {
        this.f11316a = f10;
        this.f11317b = i10 - 1;
        this.f11319d = G.h(f10);
    }

    private final void a() {
        if (G.h(this.f11316a) != this.f11319d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        a();
        this.f11316a.add(this.f11317b + 1, obj);
        this.f11318c = -1;
        this.f11317b++;
        this.f11319d = G.h(this.f11316a);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f11317b < this.f11316a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f11317b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        int i10 = this.f11317b + 1;
        this.f11318c = i10;
        G.m(i10, this.f11316a.size());
        Object obj = this.f11316a.get(i10);
        this.f11317b = i10;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f11317b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        a();
        G.m(this.f11317b, this.f11316a.size());
        int i10 = this.f11317b;
        this.f11318c = i10;
        Object obj = this.f11316a.get(i10);
        this.f11317b--;
        return obj;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f11317b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        this.f11316a.remove(this.f11318c);
        this.f11317b--;
        this.f11318c = -1;
        this.f11319d = G.h(this.f11316a);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        a();
        int i10 = this.f11318c;
        if (i10 < 0) {
            G.i();
            throw new Ad.g();
        }
        this.f11316a.set(i10, obj);
        this.f11319d = G.h(this.f11316a);
    }
}
