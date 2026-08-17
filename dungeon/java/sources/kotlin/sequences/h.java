package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class h implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f48446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f48447b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f48448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48449b = -2;

        a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f48449b == -2) {
                objInvoke = h.this.f48446a.invoke();
            } else {
                Function1 function1 = h.this.f48447b;
                Object obj = this.f48448a;
                Intrinsics.c(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f48448a = objInvoke;
            this.f48449b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48449b < 0) {
                a();
            }
            return this.f48449b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f48449b < 0) {
                a();
            }
            if (this.f48449b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f48448a;
            Intrinsics.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f48449b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f48446a = getInitialValue;
        this.f48447b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
