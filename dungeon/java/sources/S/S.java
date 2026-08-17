package S;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f11326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f11327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map.Entry f11329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map.Entry f11330e;

    public S(H h10, Iterator it) {
        this.f11326a = h10;
        this.f11327b = it;
        this.f11328c = h10.f();
        c();
    }

    protected final void c() {
        this.f11329d = this.f11330e;
        this.f11330e = this.f11327b.hasNext() ? (Map.Entry) this.f11327b.next() : null;
    }

    protected final Map.Entry d() {
        return this.f11329d;
    }

    public final H f() {
        return this.f11326a;
    }

    protected final Map.Entry g() {
        return this.f11330e;
    }

    public final boolean hasNext() {
        return this.f11330e != null;
    }

    public final void remove() {
        if (f().f() != this.f11328c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f11329d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f11326a.remove(entry.getKey());
        this.f11329d = null;
        Unit unit = Unit.f48228a;
        this.f11328c = f().f();
    }
}
