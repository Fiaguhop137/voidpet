package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f48426b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48428b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f48429c;

        a() {
            this.f48427a = d.this.f48425a.iterator();
        }

        private final void a() {
            while (this.f48427a.hasNext()) {
                Object next = this.f48427a.next();
                if (!((Boolean) d.this.f48426b.invoke(next)).booleanValue()) {
                    this.f48429c = next;
                    this.f48428b = 1;
                    return;
                }
            }
            this.f48428b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48428b == -1) {
                a();
            }
            return this.f48428b == 1 || this.f48427a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f48428b == -1) {
                a();
            }
            if (this.f48428b != 1) {
                return this.f48427a.next();
            }
            Object obj = this.f48429c;
            this.f48429c = null;
            this.f48428b = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f48425a = sequence;
        this.f48426b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
