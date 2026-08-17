package io.sentry.cache.tape;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f45732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f45733b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a f45734c;

    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    private final class C0537b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f45735a;

        C0537b(Iterator it) {
            this.f45735a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45735a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                return b.this.f45734c.b((byte[]) this.f45735a.next());
            } catch (IOException e10) {
                throw ((Error) d.h(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f45735a.remove();
        }
    }

    b(d dVar, c.a aVar) {
        this.f45732a = dVar;
        this.f45734c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void a(Object obj) throws IOException {
        this.f45733b.reset();
        this.f45734c.a(obj, this.f45733b);
        this.f45732a.e(this.f45733b.a(), 0, this.f45733b.size());
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f45732a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f45732a.close();
    }

    @Override // io.sentry.cache.tape.c
    public void i(int i10) throws IOException {
        this.f45732a.L(i10);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0537b(this.f45732a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f45732a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f45732a + '}';
    }
}
