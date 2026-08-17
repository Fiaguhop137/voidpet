package C9;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: C9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0859b extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f1527a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f1528b;

    /* JADX INFO: renamed from: C9.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC0859b() {
    }

    private boolean c() {
        this.f1527a = a.FAILED;
        this.f1528b = a();
        if (this.f1527a == a.DONE) {
            return false;
        }
        this.f1527a = a.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f1527a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        B9.n.o(this.f1527a != a.FAILED);
        int iOrdinal = this.f1527a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1527a = a.NOT_READY;
        Object objA = H.a(this.f1528b);
        this.f1528b = null;
        return objA;
    }
}
