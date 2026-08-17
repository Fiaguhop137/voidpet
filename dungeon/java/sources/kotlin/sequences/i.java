package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class i extends j implements Iterator, Ed.b, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f48452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f48453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Ed.b f48454d;

    private final Throwable f() {
        int i10 = this.f48451a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f48451a);
    }

    private final Object g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.j
    public Object b(Object obj, Ed.b bVar) {
        this.f48452b = obj;
        this.f48451a = 3;
        this.f48454d = bVar;
        Object objE = Fd.b.e();
        if (objE == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objE == Fd.b.e() ? objE : Unit.f48228a;
    }

    @Override // kotlin.sequences.j
    public Object c(Iterator it, Ed.b bVar) {
        if (!it.hasNext()) {
            return Unit.f48228a;
        }
        this.f48453c = it;
        this.f48451a = 2;
        this.f48454d = bVar;
        Object objE = Fd.b.e();
        if (objE == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objE == Fd.b.e() ? objE : Unit.f48228a;
    }

    @Override // Ed.b
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f48283a;
    }

    public final void h(Ed.b bVar) {
        this.f48454d = bVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f48451a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator it = this.f48453c;
                Intrinsics.c(it);
                if (it.hasNext()) {
                    this.f48451a = 2;
                    return true;
                }
                this.f48453c = null;
            }
            this.f48451a = 5;
            Ed.b bVar = this.f48454d;
            Intrinsics.c(bVar);
            this.f48454d = null;
            bVar.resumeWith(Ad.q.b(Unit.f48228a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f48451a;
        if (i10 == 0 || i10 == 1) {
            return g();
        }
        if (i10 == 2) {
            this.f48451a = 1;
            Iterator it = this.f48453c;
            Intrinsics.c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw f();
        }
        this.f48451a = 0;
        Object obj = this.f48452b;
        this.f48452b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Ed.b
    public void resumeWith(Object obj) {
        Ad.r.b(obj);
        this.f48451a = 4;
    }
}
