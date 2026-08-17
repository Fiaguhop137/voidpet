package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class q implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f48325a;

    public static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f48327b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f48326a;
            this.f48326a = null;
            Intrinsics.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f48326a == null && !this.f48327b) {
                String line = q.this.f48325a.readLine();
                this.f48326a = line;
                if (line == null) {
                    this.f48327b = true;
                }
            }
            return this.f48326a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f48325a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
