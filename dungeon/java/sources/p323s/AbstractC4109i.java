package p323s;

import Nd.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p341t.d;

/* JADX INFO: renamed from: s.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4109i implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52717c;

    public AbstractC4109i(int i10) {
        this.f52715a = i10;
    }

    protected abstract Object a(int i10);

    protected abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52716b < this.f52715a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f52716b);
        this.f52716b++;
        this.f52717c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f52717c) {
            d.b("Call next() before removing an element.");
        }
        int i10 = this.f52716b - 1;
        this.f52716b = i10;
        b(i10);
        this.f52715a--;
        this.f52717c = false;
    }
}
