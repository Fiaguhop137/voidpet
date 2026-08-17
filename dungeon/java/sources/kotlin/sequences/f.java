package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f48434c;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48436b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f48437c;

        a() {
            this.f48435a = f.this.f48432a.iterator();
        }

        private final void a() {
            while (this.f48435a.hasNext()) {
                Object next = this.f48435a.next();
                if (((Boolean) f.this.f48434c.invoke(next)).booleanValue() == f.this.f48433b) {
                    this.f48437c = next;
                    this.f48436b = 1;
                    return;
                }
            }
            this.f48436b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48436b == -1) {
                a();
            }
            return this.f48436b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f48436b == -1) {
                a();
            }
            if (this.f48436b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f48437c;
            this.f48437c = null;
            this.f48436b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Sequence sequence, boolean z10, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f48432a = sequence;
        this.f48433b = z10;
        this.f48434c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
