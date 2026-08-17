package p088ef;

import Ad.AbstractC0793c;
import kotlin.coroutines.CoroutineContext;
import p195kf.AbstractC3928f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            L l10 = (L) coroutineContext.e(L.f40784y1);
            if (l10 != null) {
                l10.L(coroutineContext, th);
            } else {
                AbstractC3928f.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            AbstractC3928f.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC0793c.a(runtimeException, th);
        return runtimeException;
    }
}
