package p088ef;

import Ed.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import p195kf.C3926d;
import p195kf.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P {
    public static final O a(CoroutineContext coroutineContext) {
        if (coroutineContext.e(B0.f40749z1) == null) {
            coroutineContext = coroutineContext.P(F0.b(null, 1, null));
        }
        return new C3926d(coroutineContext);
    }

    public static final O b() {
        return new C3926d(W0.b(null, 1, null).P(C3282e0.c()));
    }

    public static final void c(O o10, CancellationException cancellationException) {
        B0 b10 = (B0) o10.getCoroutineContext().e(B0.f40749z1);
        if (b10 != null) {
            b10.d(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o10).toString());
    }

    public static /* synthetic */ void d(O o10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(o10, cancellationException);
    }

    public static final Object e(Function2 function2, b bVar) {
        z zVar = new z(bVar.getContext(), bVar);
        Object objB = p213lf.b.b(zVar, zVar, function2);
        if (objB == Fd.b.e()) {
            h.c(bVar);
        }
        return objB;
    }

    public static final void f(O o10) {
        E0.j(o10.getCoroutineContext());
    }

    public static final boolean g(O o10) {
        B0 b10 = (B0) o10.getCoroutineContext().e(B0.f40749z1);
        if (b10 != null) {
            return b10.a();
        }
        return true;
    }

    public static final O h(O o10, CoroutineContext coroutineContext) {
        return new C3926d(o10.getCoroutineContext().P(coroutineContext));
    }
}
