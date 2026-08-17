package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class y0 extends AbstractList implements H, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f38117a;

    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f38118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38119b;

        a(int i10) {
            this.f38119b = i10;
            this.f38118a = y0.this.f38117a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f38118a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f38118a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f38118a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f38118a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f38118a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f38118a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f38121a;

        b() {
            this.f38121a = y0.this.f38117a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f38121a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38121a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y0(H h10) {
        this.f38117a = h10;
    }

    @Override // com.google.protobuf.H
    public Object M3(int i10) {
        return this.f38117a.M3(i10);
    }

    @Override // com.google.protobuf.H
    public H V() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f38117a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.H
    public void q0(AbstractC3142h abstractC3142h) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.H
    public List r() {
        return this.f38117a.r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38117a.size();
    }
}
