package I;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1075t0 {
    public static final InterfaceC1072s0 a(CoroutineContext coroutineContext) {
        InterfaceC1072s0 interfaceC1072s0 = (InterfaceC1072s0) coroutineContext.e(InterfaceC1072s0.f4862i1);
        if (interfaceC1072s0 != null) {
            return interfaceC1072s0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(Function1 function1, Ed.b bVar) {
        return a(bVar.getContext()).s(function1, bVar);
    }
}
