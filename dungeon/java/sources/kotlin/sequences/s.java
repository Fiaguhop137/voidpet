package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class s extends m {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f48458a;

        public a(Iterator it) {
            this.f48458a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return this.f48458a;
        }
    }

    public static final class b implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f48459a;

        public b(Object obj) {
            this.f48459a = obj;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new c(this.f48459a);
        }
    }

    public static final class c implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48460a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f48461b;

        c(Object obj) {
            this.f48461b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48460a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f48460a) {
                throw new NoSuchElementException();
            }
            this.f48460a = false;
            return this.f48461b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static Sequence h(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return i(new a(it));
    }

    public static Sequence i(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.a ? sequence : new kotlin.sequences.a(sequence);
    }

    public static Sequence j() {
        return e.f48431a;
    }

    public static final Sequence k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return l(sequence, new p());
    }

    private static final Sequence l(Sequence sequence, Function1 function1) {
        return sequence instanceof x ? ((x) sequence).d(function1) : new g(sequence, new r(), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator m(Sequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator n(Iterable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Object obj) {
        return obj;
    }

    public static Sequence p(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return l(sequence, new q());
    }

    public static Sequence q(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? e.f48431a : new h(new n(obj), nextFunction);
    }

    public static Sequence r(Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return i(new h(nextFunction, new o(nextFunction)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(Object obj) {
        return obj;
    }

    public static final Sequence u(Object obj) {
        return new b(obj);
    }

    public static Sequence v(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return AbstractC3952n.J(elements);
    }
}
