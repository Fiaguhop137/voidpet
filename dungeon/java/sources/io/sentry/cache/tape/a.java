package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class a extends c {

    private static final class b implements Iterator {
        private b() {
        }

        /* synthetic */ b(C0536a c0536a) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    a() {
    }

    @Override // io.sentry.cache.tape.c
    public void a(Object obj) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.c
    public void i(int i10) {
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(null);
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }
}
