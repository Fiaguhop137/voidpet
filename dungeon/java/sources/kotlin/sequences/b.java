package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sequence f48421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48422b;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f48423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48424b;

        a(b bVar) {
            this.f48423a = bVar.f48421a.iterator();
            this.f48424b = bVar.f48422b;
        }

        private final void a() {
            while (this.f48424b > 0 && this.f48423a.hasNext()) {
                this.f48423a.next();
                this.f48424b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f48423a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f48423a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f48421a = sequence;
        this.f48422b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i10) {
        int i11 = this.f48422b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f48421a, i11);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
