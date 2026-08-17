package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f48471b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48472a;

        a() {
            this.f48472a = x.this.f48470a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48472a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return x.this.f48471b.invoke(this.f48472a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f48470a = sequence;
        this.f48471b = transformer;
    }

    public final Sequence d(Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new g(this.f48470a, this.f48471b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
