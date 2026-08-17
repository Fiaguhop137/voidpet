package p195kf;

import Ad.AbstractC0793c;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import p088ef.L;
import p088ef.M;

/* JADX INFO: renamed from: kf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3928f {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator it = AbstractC3927e.a().iterator();
        while (it.hasNext()) {
            try {
                ((L) it.next()).L(coroutineContext, th);
            } catch (Throwable th2) {
                AbstractC3927e.b(M.b(th, th2));
            }
        }
        try {
            AbstractC0793c.a(th, new C3929g(coroutineContext));
        } catch (Throwable unused) {
        }
        AbstractC3927e.b(th);
    }
}
