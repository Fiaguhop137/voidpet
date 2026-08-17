package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f48465b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48467b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f48468c;

        a() {
            this.f48466a = w.this.f48464a.iterator();
        }

        private final void a() {
            if (this.f48466a.hasNext()) {
                Object next = this.f48466a.next();
                if (((Boolean) w.this.f48465b.invoke(next)).booleanValue()) {
                    this.f48467b = 1;
                    this.f48468c = next;
                    return;
                }
            }
            this.f48467b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48467b == -1) {
                a();
            }
            return this.f48467b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f48467b == -1) {
                a();
            }
            if (this.f48467b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f48468c;
            this.f48468c = null;
            this.f48467b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f48464a = sequence;
        this.f48465b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
