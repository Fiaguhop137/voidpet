package p177jf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import p088ef.B0;
import p195kf.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static final void b(r rVar, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.b0(0, new t(rVar))).intValue() == rVar.f47429c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.f47428b + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(r rVar, int i10, CoroutineContext.Element element) {
        CoroutineContext.b key = element.getKey();
        CoroutineContext.Element elementE = rVar.f47428b.e(key);
        if (key != B0.f40749z1) {
            if (element != elementE) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        B0 b10 = (B0) elementE;
        Intrinsics.d(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        B0 b0D = d((B0) element, b10);
        if (b0D == b10) {
            return b10 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b0D + ", expected child of " + b10 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final B0 d(B0 b10, B0 b11) {
        while (b10 != null) {
            if (b10 == b11 || !(b10 instanceof z)) {
                return b10;
            }
            b10 = ((z) b10).k0();
        }
        return null;
    }
}
