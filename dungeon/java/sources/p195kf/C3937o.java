package p195kf;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p088ef.T;

/* JADX INFO: renamed from: kf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3937o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48160a = AtomicReferenceFieldUpdater.newUpdater(C3937o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48161b = AtomicReferenceFieldUpdater.newUpdater(C3937o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48162c = AtomicReferenceFieldUpdater.newUpdater(C3937o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: kf.o$a */
    /* synthetic */ class a extends u {
        a(Object obj) {
            super(obj, T.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.reflect.l
        public Object get() {
            return T.a(this.receiver);
        }
    }

    private final C3937o h() {
        C3937o c3937o;
        Object obj;
        while (true) {
            C3937o c3937o2 = (C3937o) f48161b.get(this);
            c3937o = c3937o2;
            while (true) {
                C3937o c3937o3 = null;
                while (true) {
                    obj = f48160a.get(c3937o);
                    if (obj == this) {
                        if (c3937o2 != c3937o && !b.a(f48161b, this, c3937o2, c3937o)) {
                            break;
                        }
                        break;
                    }
                    if (q()) {
                        return null;
                    }
                    if (!(obj instanceof x)) {
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c3937o3 = c3937o;
                        c3937o = (C3937o) obj;
                    } else {
                        if (c3937o3 != null) {
                            break;
                        }
                        c3937o = (C3937o) f48161b.get(c3937o);
                    }
                }
                if (!b.a(f48160a, c3937o3, c3937o, ((x) obj).f48178a)) {
                    break;
                }
                c3937o = c3937o3;
            }
        }
        return c3937o;
    }

    private final C3937o i(C3937o c3937o) {
        while (c3937o.q()) {
            c3937o = (C3937o) f48161b.get(c3937o);
        }
        return c3937o;
    }

    private final void j(C3937o c3937o) {
        C3937o c3937o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48161b;
        do {
            c3937o2 = (C3937o) atomicReferenceFieldUpdater.get(c3937o);
            if (k() != c3937o) {
                return;
            }
        } while (!b.a(f48161b, c3937o, c3937o2, this));
        if (q()) {
            c3937o.h();
        }
    }

    private final x t() {
        x xVar = (x) f48162c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f48162c.set(this, xVar2);
        return xVar2;
    }

    public final boolean c(C3937o c3937o, int i10) {
        C3937o c3937oM;
        do {
            c3937oM = m();
            if (c3937oM instanceof C3935m) {
                return (((C3935m) c3937oM).f48159d & i10) == 0 && c3937oM.c(c3937o, i10);
            }
        } while (!c3937oM.d(c3937o, this));
        return true;
    }

    public final boolean d(C3937o c3937o, C3937o c3937o2) {
        f48161b.set(c3937o, this);
        f48160a.set(c3937o, c3937o2);
        if (!b.a(f48160a, this, c3937o2, c3937o)) {
            return false;
        }
        c3937o.j(c3937o2);
        return true;
    }

    public final boolean f(C3937o c3937o) {
        f48161b.set(c3937o, this);
        f48160a.set(c3937o, this);
        while (k() == this) {
            if (b.a(f48160a, this, this, c3937o)) {
                c3937o.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        c(new C3935m(i10), i10);
    }

    public final Object k() {
        return f48160a.get(this);
    }

    public final C3937o l() {
        C3937o c3937o;
        Object objK = k();
        x xVar = objK instanceof x ? (x) objK : null;
        if (xVar != null && (c3937o = xVar.f48178a) != null) {
            return c3937o;
        }
        Intrinsics.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C3937o) objK;
    }

    public final C3937o m() {
        C3937o c3937oH = h();
        return c3937oH == null ? i((C3937o) f48161b.get(this)) : c3937oH;
    }

    public boolean q() {
        return k() instanceof x;
    }

    public boolean r() {
        return s() == null;
    }

    public final C3937o s() {
        Object objK;
        C3937o c3937o;
        do {
            objK = k();
            if (objK instanceof x) {
                return ((x) objK).f48178a;
            }
            if (objK == this) {
                return (C3937o) objK;
            }
            Intrinsics.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c3937o = (C3937o) objK;
        } while (!b.a(f48160a, this, objK, c3937o.t()));
        c3937o.h();
        return null;
    }

    public String toString() {
        return new a(this) + '@' + T.b(this);
    }
}
