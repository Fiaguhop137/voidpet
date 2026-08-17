package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f48440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f48441c;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f48443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48444c;

        a() {
            this.f48442a = g.this.f48439a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f48443b;
            if (it != null && it.hasNext()) {
                this.f48444c = 1;
                return true;
            }
            while (this.f48442a.hasNext()) {
                Iterator it2 = (Iterator) g.this.f48441c.invoke(g.this.f48440b.invoke(this.f48442a.next()));
                if (it2.hasNext()) {
                    this.f48443b = it2;
                    this.f48444c = 1;
                    return true;
                }
            }
            this.f48444c = 2;
            this.f48443b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f48444c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f48444c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f48444c = 0;
            Iterator it = this.f48443b;
            Intrinsics.c(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f48439a = sequence;
        this.f48440b = transformer;
        this.f48441c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
