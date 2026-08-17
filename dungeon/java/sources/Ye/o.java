package Ye;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17853b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17854a = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17854a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f17854a) {
                throw new NoSuchElementException();
            }
            this.f17854a = false;
            return o.this.g();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object value, int i10) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17852a = value;
        this.f17853b = i10;
    }

    @Override // Ye.c
    public int a() {
        return 1;
    }

    @Override // Ye.c
    public void c(int i10, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    public final int e() {
        return this.f17853b;
    }

    public final Object g() {
        return this.f17852a;
    }

    @Override // Ye.c
    public Object get(int i10) {
        if (i10 == this.f17853b) {
            return this.f17852a;
        }
        return null;
    }

    @Override // Ye.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
