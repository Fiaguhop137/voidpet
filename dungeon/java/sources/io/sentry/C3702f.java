package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3702f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object[] f45823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f45824b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f45825c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f45826d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45827e;

    /* JADX INFO: renamed from: io.sentry.f$a */
    class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45829b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f45830c;

        a() {
            this.f45828a = C3702f.this.f45824b;
            this.f45830c = C3702f.this.f45826d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45830c || this.f45828a != C3702f.this.f45825c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f45830c = false;
            int i10 = this.f45828a;
            this.f45829b = i10;
            this.f45828a = C3702f.this.o(i10);
            return C3702f.this.f45823a[this.f45829b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f45829b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == C3702f.this.f45824b) {
                C3702f.this.remove();
                this.f45829b = -1;
                return;
            }
            int iO = this.f45829b + 1;
            if (C3702f.this.f45824b >= this.f45829b || iO >= C3702f.this.f45825c) {
                while (iO != C3702f.this.f45825c) {
                    if (iO >= C3702f.this.f45827e) {
                        C3702f.this.f45823a[iO - 1] = C3702f.this.f45823a[0];
                        iO = 0;
                    } else {
                        C3702f.this.f45823a[C3702f.this.n(iO)] = C3702f.this.f45823a[iO];
                        iO = C3702f.this.o(iO);
                    }
                }
            } else {
                System.arraycopy(C3702f.this.f45823a, iO, C3702f.this.f45823a, this.f45829b, C3702f.this.f45825c - iO);
            }
            this.f45829b = -1;
            C3702f c3702f = C3702f.this;
            c3702f.f45825c = c3702f.n(c3702f.f45825c);
            C3702f.this.f45823a[C3702f.this.f45825c] = null;
            C3702f.this.f45826d = false;
            this.f45828a = C3702f.this.n(this.f45828a);
        }
    }

    C3702f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f45823a = objArr;
        this.f45827e = objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f45827e - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f45827e) {
            return 0;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (p()) {
            remove();
        }
        Object[] objArr = this.f45823a;
        int i10 = this.f45825c;
        int i11 = i10 + 1;
        this.f45825c = i11;
        objArr[i10] = obj;
        if (i11 >= this.f45827e) {
            this.f45825c = 0;
        }
        if (this.f45825c == this.f45824b) {
            this.f45826d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f45826d = false;
        this.f45824b = 0;
        this.f45825c = 0;
        Arrays.fill(this.f45823a, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    public boolean p() {
        return size() == this.f45827e;
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f45823a[this.f45824b];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f45823a;
        int i10 = this.f45824b;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f45824b = i11;
            objArr[i10] = null;
            if (i11 >= this.f45827e) {
                this.f45824b = 0;
            }
            this.f45826d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f45825c;
        int i11 = this.f45824b;
        if (i10 < i11) {
            return (this.f45827e - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f45826d) {
            return this.f45827e;
        }
        return 0;
    }
}
