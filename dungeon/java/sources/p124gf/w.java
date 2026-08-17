package p124gf;

import Ed.b;

/* JADX INFO: loaded from: classes3.dex */
public interface w {

    public static final class a {
        public static /* synthetic */ boolean a(w wVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return wVar.n(th);
        }
    }

    Object g(Object obj);

    Object l(Object obj, b bVar);

    boolean n(Throwable th);
}
