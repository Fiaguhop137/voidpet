package Q3;

import java.io.Closeable;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p453z3.InterfaceC4380l;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f9336a = a.f9337a;

    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9337a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(K3.f fVar) {
            return null;
        }
    }

    public static final K3.e c(K3.f fVar, Throwable th) {
        p435y3.n nVarA;
        if (!(th instanceof K3.m) || (nVarA = fVar.b()) == null) {
            nVarA = fVar.a();
        }
        return new K3.e(nVarA, fVar, th);
    }

    public static final y3.h.a d(y3.h.a aVar, Pair pair) {
        if (pair != null) {
            aVar.r().add(0, new C(pair));
        }
        return aVar;
    }

    public static final y3.h.a e(y3.h.a aVar, InterfaceC4380l.a aVar2) {
        if (aVar2 != null) {
            aVar.q().add(0, new D(aVar2));
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(Pair pair) {
        return CollectionsKt.e(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(InterfaceC4380l.a aVar) {
        return CollectionsKt.e(aVar);
    }

    public static final void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void i(AutoCloseable autoCloseable) {
        try {
            p002a1.e.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final Function1 j() {
        return f9336a;
    }

    public static final p435y3.j k(C3.c.a aVar) {
        return aVar instanceof C3.d ? ((C3.d) aVar).f() : p435y3.j.f57807b;
    }

    public static final boolean l(p435y3.C c10) {
        return ((c10.c() != null && !Intrinsics.b(c10.c(), "file")) || c10.b() == null || F.g(c10)) ? false : true;
    }

    public static final boolean m(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean n(C3.c.a aVar) {
        return (aVar instanceof C3.d) && ((C3.d) aVar).g();
    }
}
