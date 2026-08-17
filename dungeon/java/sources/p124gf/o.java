package p124gf;

import java.util.concurrent.CancellationException;
import p088ef.AbstractC3304p0;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class o {
    public static final void a(v vVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC3304p0.a("Channel was consumed, consumer had failed", th);
            }
        }
        vVar.d(cancellationExceptionA);
    }
}
